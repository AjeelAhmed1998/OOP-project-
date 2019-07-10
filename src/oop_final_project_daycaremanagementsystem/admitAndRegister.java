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
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class admitAndRegister extends JFrame {

    JButton jbNext, jbBack;
    JTextField tfName;
    JLabel lbEnter_child_name, lbFrom, lbTo, lbTimer, lbBill;
    JSpinner spFromHours, spFromMinutes, spToHours, spToMinutes;

    public admitAndRegister() throws HeadlessException {

        super("billing");

        setLayout(new FlowLayout());

        setSize(400, 400);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
//        String[] months = new String[]{"january", "feb", "mar", "aor", "may", "june", "july", "august", "sep", "oct","nov","dec"};
//        SpinnerListModel a = new SpinnerListModel(months);
//        spTest = new JSpinner(a);
//        add(spTest);
//        
//        System.out.println(spTest.getModel().getValue());
        myActionListener a = new myActionListener();

        jbBack = new JButton("back");

        jbBack.addActionListener(a);
        
        

        lbEnter_child_name = new JLabel("Enter your child name");

        lbFrom = new JLabel("From");

        lbTo = new JLabel("To");

        jbNext = new JButton("next");

        tfName = new JTextField(10);

        SpinnerNumberModel hoursForFrom = new SpinnerNumberModel(00, 00, 24, 1);
        SpinnerNumberModel hoursForTo = new SpinnerNumberModel(00, 00, 24, 1);
        SpinnerNumberModel minutesForFrom = new SpinnerNumberModel(00, 00, 59, 5);
        SpinnerNumberModel minutesForTo = new SpinnerNumberModel(00, 00, 59, 5);

        spFromHours = new JSpinner(hoursForFrom);

        spFromMinutes = new JSpinner(minutesForFrom);

        spToHours = new JSpinner(hoursForTo);

        spToMinutes = new JSpinner(minutesForTo);

        add(lbEnter_child_name);
        add(tfName);

        add(lbFrom);

        add(spFromHours);
        add(spFromMinutes);

        add(lbTo);
        add(spToHours);
        add(spToMinutes);

        add(jbNext);
        
        add(jbBack);

        tfName.addActionListener(a);
        jbNext.addActionListener(a);

        //add(lbTimer);
        // add(lbBill);
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

            if (e.getActionCommand().equals(jbNext.getText())) {

                ArrayList<Child> childList = readAllData();
                for (int i = 0; i < childList.size(); i++) {
                    if (childList.get(i).getName().equalsIgnoreCase(tfName.getText())) {

                        String fromTime = spFromHours.getModel().getValue() + ":" + spFromMinutes.getModel().getValue();
                        String toTime = "" + spToHours.getModel().getValue() + ":" + spToMinutes.getModel().getValue();

                        System.out.println("write in this format");
                        System.out.println("at what time are you leaving the kid?");
                        //String a = "1:24";

                        System.out.println("at what time will you be picking them up?");
                        //String ad = "3:33";

//        parsing strings into date objects 
                        Date ant = new Date();

                        SimpleDateFormat ft = new SimpleDateFormat("HH:mm");

                        try {

                            Date t = ft.parse(fromTime);
//            System.out.println("time is " + t.getTime());
                            Date s = ft.parse(toTime);
                            System.out.println(t);
                            double milliDouble = (s.getTime() - t.getTime());
                            double doubleHours = milliDouble / 3600000;
                            // System.out.println(doubleHours);
                            int hours = (int) doubleHours;
                            System.out.println("hours" + hours);
                            //  System.out.println(doubleHours);
                            double minutes = (doubleHours - hours) * 60;
//            System.out.println(minutes);
//            minutes = (int) minutes;
                            System.out.println("minutes are" + Math.round(minutes));
                            //lbTimer = new JLabel();
                            JOptionPane.showMessageDialog(new JFrame(), "Please come pick up your child in " + hours + "hours and " + Math.round(minutes) + "minutes and your bill would be" + doubleHours * 10);
                            break;//lbBill = new JLabel();
//            
//            String time = diff + "";
//            
//            Date abb = ft.parse(time);
//            
//            System.out.println(abb.getTime());
//            t.compareTo(new Date());
//            t.setTime(1222222);
                        } catch (ParseException tre) {
                            System.out.println("Unparseable using " + ft);
                        }

                    }
                    else if((i == childList.size()-1)&&!(childList.get(i).getName().equalsIgnoreCase(tfName.getText())))
                    {
                        JOptionPane.showMessageDialog(new JFrame(), "name not found");
                    
                    }
                    
                    else {
                        continue;
                    }
                }

            }
            
            
            else if (e.getActionCommand().equals(jbBack.getText())){
                mainMenu a = new mainMenu();
            }

        }

    }

}
