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

public class newParentAndChild extends JFrame {

    JPanel jpParent;
    JLabel lbName, lbAge, lbJob, lbAddress, lbPhoneNumber, lbCnic;
    JTextField tfName, tfAge, tfJob, tfAddress, tfPhoneNumber, tfCnic;

    JPanel jpChild;
    JLabel lbcName, lbcAge, lbcIdentityMarkers, lbcFoodAllergicTo, lbcDiseases, lbcNoteOnPersonality;
    JTextField tfcName, tfcAge, tfcIdentityMarkers1, tfcIdentityMarkers2, tfcIdentityMarkers3, tfcFoodAllergicTo1, tfcFoodAllergicTo2, tfcFoodAllergicTo3, tfcDiseases1, tfcDiseases2, tfcDiseases3, tfcNoteOnPersonality;
    JButton jbNext, jbBack;

    newParentAndChild() throws HeadlessException {

        super("create new parent profile");

        setSize(400, 400);

        setLayout(new GridLayout(0, 2));

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);

        myactionlistener a = new myactionlistener();
        
        lbName = new JLabel("Name");

        tfName = new JTextField();
        tfName.addActionListener(a);

        lbAge = new JLabel("Age");

        tfAge = new JTextField();
        tfAge.addActionListener(a);

        lbJob = new JLabel("Job");

        tfJob = new JTextField();
        tfJob.addActionListener(a);

        lbAddress = new JLabel("address");

        tfAddress = new JTextField();
        tfAddress.addActionListener(a);

        lbPhoneNumber = new JLabel("Phone number");

        tfPhoneNumber = new JTextField();
        tfPhoneNumber.addActionListener(a);

        lbCnic = new JLabel("cnic");

        tfCnic = new JTextField();
        tfCnic.addActionListener(a);

        jbNext = new JButton("Next");
        jbNext.addActionListener(a);

        jbBack = new JButton("Back");
        jbBack.addActionListener(a);

        jpParent = new JPanel(new GridLayout(0, 2));

        jpParent.add(lbName);
        jpParent.add(tfName);

        jpParent.add(lbAge);
        jpParent.add(tfAge);

        jpParent.add(lbJob);
        jpParent.add(tfJob);

        jpParent.add(lbAddress);
        jpParent.add(tfAddress);

        jpParent.add(lbPhoneNumber);
        jpParent.add(tfPhoneNumber);

        jpParent.add(lbCnic);
        jpParent.add(tfCnic);

        add(jpParent);

        jpChild = new JPanel(new GridLayout(0, 2));

        lbcName = new JLabel("Child's name");
        tfcName = new JTextField();
        tfcName.addActionListener(a);

        lbcAge = new JLabel("Child's age");
        tfcAge = new JTextField();
        tfcAge.addActionListener(a);

        lbcIdentityMarkers = new JLabel("identity markers ");
        tfcIdentityMarkers1 = new JTextField();
        tfcIdentityMarkers1.addActionListener(a);
        tfcIdentityMarkers2 = new JTextField();
        tfcIdentityMarkers2.addActionListener(a);
        tfcIdentityMarkers3 = new JTextField();
        tfcIdentityMarkers3.addActionListener(a);

        lbcFoodAllergicTo = new JLabel("Food allergic to");
        tfcFoodAllergicTo1 = new JTextField();
        tfcFoodAllergicTo1.addActionListener(a);
        tfcFoodAllergicTo2 = new JTextField();
        tfcFoodAllergicTo2.addActionListener(a);
        tfcFoodAllergicTo3 = new JTextField();
        tfcFoodAllergicTo3.addActionListener(a);

        lbcDiseases = new JLabel("Diseases");
        tfcDiseases1 = new JTextField();
        tfcDiseases1.addActionListener(a);
        tfcDiseases2 = new JTextField();
        tfcDiseases2.addActionListener(a);
        tfcDiseases3 = new JTextField();
        tfcDiseases3.addActionListener(a);

        lbcNoteOnPersonality = new JLabel("Note on personality");
        tfcNoteOnPersonality = new JTextField(10);
        tfcNoteOnPersonality.addActionListener(a);

        jbNext = new JButton("Next");
        jbNext.addActionListener(a);
        jbBack = new JButton("back");
        jbBack.addActionListener(a);

        jpChild.add(lbcName);
        jpChild.add(tfcName);
        jpChild.add(lbcAge);
        jpChild.add(tfcAge);
        jpChild.add(lbcIdentityMarkers);
        jpChild.add(tfcIdentityMarkers1);
        jpChild.add(tfcIdentityMarkers2);
        jpChild.add(tfcIdentityMarkers3);
        jpChild.add(lbcFoodAllergicTo);
        jpChild.add(tfcFoodAllergicTo1);
        jpChild.add(tfcFoodAllergicTo2);
        jpChild.add(tfcFoodAllergicTo3);
        jpChild.add(lbcDiseases);
        jpChild.add(tfcDiseases1);
        jpChild.add(tfcDiseases2);
        jpChild.add(tfcDiseases3);
        jpChild.add(lbcNoteOnPersonality);
        jpChild.add(tfcNoteOnPersonality);

        jpChild.add(jbNext);
        jpChild.add(jbBack);

        add(jpChild);

    }

    
    
    public ArrayList<Child> readAllData() {
        //  ArrayList initialized with size 0
        ArrayList<Child> childList = new ArrayList<Child>();
// Input stream
        ObjectInputStream inputStream = null;
        try {
// open file for reading
            inputStream = new ObjectInputStream(new FileInputStream("parentAndchild.ser"));
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
    

    
    
    public class myactionlistener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Next")) {
                if (!(tfName.getText().isEmpty() && tfAge.getText().isEmpty() && tfCnic.getText().isEmpty() && tfJob.getText().isEmpty() && tfPhoneNumber.getText().isEmpty() && tfcName.getText().isEmpty())) {
                    ArrayList<Child> childList = readAllData();
                    ArrayList<String> identityMarker = new  ArrayList<>();
                    identityMarker.add(tfcIdentityMarkers1.getText());
                    identityMarker.add(tfcIdentityMarkers2.getText());
                    identityMarker.add(tfcIdentityMarkers3.getText());
                    
                    ArrayList<String> foodAllergicTo= new ArrayList<>();
                    foodAllergicTo.add(tfcFoodAllergicTo1.getText());
                    foodAllergicTo.add(tfcFoodAllergicTo2.getText());
                    foodAllergicTo.add(tfcFoodAllergicTo3.getText());
                    
                    ArrayList<String> diseases= new ArrayList<>();
                    diseases.add(tfcDiseases1.getText());
                    diseases.add(tfcDiseases2.getText());
                    diseases.add(tfcDiseases3.getText());
                    
                    Parent parent = new Parent(tfName.getText(), tfAge.getText(), tfJob.getText(), tfAddress.getText(), tfPhoneNumber.getText(), tfCnic.getText());
                    
                    Child child = new Child(tfcName.getText(), tfcAge.getText(), parent, identityMarker, foodAllergicTo, diseases, tfcNoteOnPersonality.getText());
                    
                     try {childList.add(child);
                            System.out.println("the file");
                                ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("parentAndChild.ser", false));
                                for (int i = 0; i < childList.size(); i++) {

                                    write.writeObject(childList.get(i));
                                    
                                   
                                }
                            } catch (IOException a) {
                            }
                     
                     JOptionPane.showMessageDialog(new JFrame(), "creaeted");

                }

            }
            
            else if (e.getActionCommand().equals(jbBack.getText())){
                createProfile a = new createProfile();
            }

        }

    }

}
