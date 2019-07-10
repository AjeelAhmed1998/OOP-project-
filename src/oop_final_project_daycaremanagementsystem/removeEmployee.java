package oop_final_project_daycaremanagementsystem;

/**
 * @author ajeel
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class removeEmployee extends JFrame {

    JLabel lbEnterCNIC;
    JTextField tfEnterCNIC;
    JButton jbRemove;

    public removeEmployee() throws HeadlessException {

        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        myActionListener a = new myActionListener();
        lbEnterCNIC = new JLabel("enter the cnic of the employee you want to remove from the file");

        tfEnterCNIC = new JTextField(10);
        tfEnterCNIC.addActionListener(a);

        jbRemove = new JButton("remove");
        jbRemove.addActionListener(a);

        add(lbEnterCNIC);
        add(tfEnterCNIC);
        add(jbRemove);

    }

    public ArrayList<Employee> readAllData() {
        //  ArrayList initialized with size 0
        ArrayList<Employee> employeeList = new ArrayList<Employee>(0);
// Input stream
        ObjectInputStream inputStream = null;
        try {
// open file for reading
            inputStream = new ObjectInputStream(new FileInputStream("Employee.ser"));
// End Of File flag
            boolean EOF = false;
// Keep reading file until file ends
            while (!EOF) {
                try {
// read object and type cast into CarDetails object
                    Employee myObj = (Employee) inputStream.readObject();
// add object into ArrayList
                    System.out.println("Employee Name in File : " + myObj.getName());
                    employeeList.add(myObj);
//System.out.println("Read: " + myObj.getName());
                } catch (ClassNotFoundException e) {
                    System.out.println("Class not found");
                } catch (EOFException end) {
// EOFException is raised when file ends
// set End Of File flag to true so that loop exits
                    System.out.println("end of file exception");
                    EOF = true;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file");
        } catch (IOException e) {
            System.out.println("IO Exception while opening stream" + e.getMessage());
            e.printStackTrace();
        } finally { // cleanup code to close stream if it was opened
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
// TODO Auto-generated catch block
                System.out.println("IO Exception while closing file");
            }
        }
// returns ArrayList
        return employeeList;
    }

    public class myActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equals(jbRemove.getText())) {
                ArrayList<Employee> employeeList = readAllData();

                for (int i = 0; i < employeeList.size(); i++) {
                    if (employeeList.get(i).getCnic().equals(tfEnterCNIC.getText())) {
                        employeeList.remove(i);
                        
                          try {
                            System.out.println("the file");
                                ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("Employee.ser", false));
                                for (int j = 0; j < employeeList.size(); j++) {

                                    write.writeObject(employeeList.get(j));
                                    
                                   
                                }
                            } catch (IOException a) {
                            }
                        
                        JOptionPane.showMessageDialog(new JFrame(), "removed");
                    }
                    
                    else if((i == employeeList.size()-1)&&!(employeeList.get(i).getCnic().equals(tfEnterCNIC.getText()))){
                        JOptionPane.showMessageDialog(new JFrame(),"employee not found" );
                        
                    }
                    
                    else {
                        continue;
                    }
                }
            }

        }

    }

}
