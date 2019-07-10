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

public class searchEmployee extends JFrame {

    JLabel lbEnterCnic, lbName, lbAge, lbUsername, lbBankAccount;
    JTextField tfEnterCnic, tfName, tfAge, tfUsername, tfBankAccount;

    JButton jbSearch;

    public searchEmployee() throws HeadlessException {

        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 2));
        setVisible(true);

        myActionListener a = new myActionListener();

        lbEnterCnic = new JLabel("enter cnic");
        tfEnterCnic = new JTextField(10);
        tfEnterCnic.addActionListener(a);
        lbName = new JLabel("name");

        tfName = new JTextField(10);
        tfName.addActionListener(a);
        lbAge = new JLabel("age");
        tfAge = new JTextField(10);
        tfAge.addActionListener(a);
        lbUsername = new JLabel("username");
        tfUsername = new JTextField(10);
        tfUsername.addActionListener(a);
        lbBankAccount = new JLabel("bank account");
        tfBankAccount = new JTextField(10);
        tfBankAccount.addActionListener(a);

        jbSearch = new JButton("search");
        jbSearch.addActionListener(a);

        add(lbEnterCnic);
        add(tfEnterCnic);
        add(lbName);
        add(tfName);
        add(lbAge);
        add(tfAge);
        add(lbUsername);
        add(tfUsername);
        add(lbBankAccount);
        add(tfBankAccount);
        add(jbSearch);

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
            ArrayList<Employee> employeeList = readAllData();
            if (e.getActionCommand().equals(jbSearch.getText())) {
                System.out.println("search");
                for (int i = 0; i < employeeList.size(); i++) {
                    if (employeeList.get(i).getCnic().equals(tfEnterCnic.getText())) {
                        tfName.setText(employeeList.get(i).getName());
//                        System.out.println(employeeList.get(i).getName());
                        tfAge.setText(employeeList.get(i).getAge());
                        tfUsername.setText(employeeList.get(i).getUap_employee().getUsername());
//                        tfPassword.setText(employeeList.get(i).getUap_employee().getPassword());
                        tfBankAccount.setText(employeeList.get(i).getBankAccount());
//                        tfCNIC.setText(employeeList.get(i).getCnic());
                        JOptionPane.showMessageDialog(new JFrame(), "found");
//                        System.out.println("probably didnt came in then");
                        break;

                    } else if ((i == employeeList.size() - 1) && !(employeeList.get(i).getCnic().equals(tfEnterCnic.getText()))) {
                        JOptionPane.showMessageDialog(new JFrame(), "wrong username or password");

                    } else {
                        //System.out.println("working");
                        System.out.println("not found");
                        continue;
                    }

                }

            }

        }

    }

}
