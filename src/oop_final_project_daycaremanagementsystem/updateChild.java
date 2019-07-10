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

public class updateChild extends JFrame {

    JLabel lbEnterName, lbName, lbAge, lbParentsName, lbParentsAge, lbParentsCNIC, lbChildsDiseases;
    JTextField tfEnterName, tfName, tfAge, tfParentName, tfParentAge, tfParentCNIC, tfChildDisease, tfChildDisease2, tfChildDisease3;

    JButton jbUpdate, jbSearch, jbBack;

    public updateChild() throws HeadlessException {
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 2));
        setVisible(true);

        myActionListener a = new myActionListener();

        lbEnterName = new JLabel("enter name");
        tfEnterName = new JTextField(10);

        lbName = new JLabel("Name");
        tfName = new JTextField(10);

        lbAge = new JLabel("Age");
        tfAge = new JTextField(10);
        
        

        lbParentsName = new JLabel("Parents name");
        tfParentName = new JTextField(10);

        lbParentsAge = new JLabel("parents age");
        tfParentAge = new JTextField(10);

        lbParentsCNIC = new JLabel("Parents cnic");
        tfParentCNIC = new JTextField(10);

        lbChildsDiseases = new JLabel("childs diseases");
        tfChildDisease = new JTextField(10);

        tfChildDisease2 = new JTextField(10);
        tfChildDisease3 = new JTextField(10);

        jbUpdate = new JButton("update");

        add(lbEnterName);
        tfEnterName.addActionListener(a);
        add(tfEnterName);

        add(lbName);
        tfName.addActionListener(a);
        add(tfName);

        add(lbAge);
        tfAge.addActionListener(a);
        add(tfAge);

        add(lbParentsName);
        tfParentName.addActionListener(a);
        add(tfParentName);

        add(lbParentsAge);
        tfParentAge.addActionListener(a);
        add(tfParentAge);

        add(lbParentsCNIC);
        tfParentCNIC.addActionListener(a);
        add(tfParentCNIC);

        add(lbChildsDiseases);
        add(tfChildDisease);

        add(tfChildDisease2);
        add(tfChildDisease3);

        add(jbUpdate);

        jbUpdate.addActionListener(a);

        tfChildDisease.addActionListener(a);
        tfChildDisease2.addActionListener(a);
        tfChildDisease3.addActionListener(a);

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
            ArrayList<Child> childList = readAllData();
            if (e.getActionCommand().equals(jbUpdate.getText())) {
                for (int i = 0; i < childList.size(); i++) {
                    
                    if(childList.get(i).getName().equals(tfEnterName.getText())){
                        
                        
                        childList.remove(i);
                        
                        Child a = new Child();
                        
                        
                    }
                    
                    else if ((i == childList.size()-1) && !(childList.get(i).getName().equals(tfEnterName.getText()))){
                        
                    }
                    
                    else {
                        continue;
                    }
                    
                    
                   
                    
                }

            }
        }

    }

}
