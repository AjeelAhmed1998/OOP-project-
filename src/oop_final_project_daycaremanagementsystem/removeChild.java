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

public class removeChild extends JFrame {

    JLabel lbEnterName;
    JTextField tfEnterName;
    JButton jbRemove;

    public removeChild() throws HeadlessException {

        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        myActionListener a = new myActionListener();
        lbEnterName = new JLabel("enter the name of the child you want to remove from the file");

        tfEnterName = new JTextField(10);
        tfEnterName.addActionListener(a);

        jbRemove = new JButton("remove");
        jbRemove.addActionListener(a);

        add(lbEnterName);
        add(tfEnterName);
        add(jbRemove);

    }

    public ArrayList<Child> readAllData() {
        //  ArrayList initialized with size 0
        ArrayList<Child> childList = new ArrayList<Child>();
// Input stream
        ObjectInputStream inputStream = null;
        try {
// open file for reading
            inputStream = new ObjectInputStream(new FileInputStream("parentAndChild.ser"));
// End Of File flag
            boolean EOF = false;
// Keep reading file until file ends
            while (!EOF) {
                try {
// read object and type cast into CarDetails object
                    Child myObj = (Child) inputStream.readObject();
// add object into ArrayList
                    childList.add(myObj);
//System.out.println("Read: " + myObj.getName());
                } catch (ClassNotFoundException e) {
//System.out.println("Class not found");
                } catch (EOFException end) {
// EOFException is raised when file ends
// set End Of File flag to true so that loop exits
                    EOF = true;
                }
            }
        } catch (FileNotFoundException e) {
//System.out.println("Cannot find file");
        } catch (IOException e) {
//System.out.println("IO Exception while opening stream");
//e.printStackTrace();
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
        return childList;
    }

    public class myActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getActionCommand().equals(jbRemove.getText())) {
                ArrayList<Child> childList = readAllData();

                for (int i = 0; i < childList.size(); i++) {

                    if (childList.get(i).getName().equals(tfEnterName.getText())) {
                        childList.remove(i);
                        
                        
                          try {
                            System.out.println("the file");
                                ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("parentAndChild.ser", false));
                                for (int j = 0; j < childList.size(); j++) {

                                    write.writeObject(childList.get(j));
                                    
                                   
                                }
                            } catch (IOException a) {
                            }
                        
                      
                        
                         JOptionPane.showMessageDialog(new JFrame(), "removed");
                        break;
                     
                    
                    } else if ((i == childList.size() - 1) && !(childList.get(i).getName().equals(tfEnterName.getText()))) {
                        JOptionPane.showMessageDialog(new JFrame(), "child not found");
                    } else {
                        continue;
                    }

                }
            }

        }

    }

}
