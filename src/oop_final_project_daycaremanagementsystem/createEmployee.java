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

public class createEmployee extends JFrame {

    JLabel lbName, lbAge, lbCnic, lbBankAccount, lbNewUsername, lbNewPassword, lbEarning, lbSalariedJob, lbHourlyJob, lbSalary, lbHourlyRate;
    JTextField tfName, tfAge, tfCnic, tfBankAccount, tfNewUsername, tfNewPassword, tfSalary, tfHourlyRate;
    JButton jbBack, jbCreate;

    ButtonGroup bgEarning;
    JRadioButton rbSalaried, rbHourly;

    JComboBox cbHourlyJobs, cbSalariedJobs;

    JPanel jpUpper, jpLower;

    public createEmployee() throws HeadlessException {
        super("Create an account for the new employee");

        setLayout(new FlowLayout());

        setSize(400, 400);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);

        myActionListener a = new myActionListener();

        jpUpper = new JPanel(new GridLayout(0, 2));
        jpLower = new JPanel(new GridLayout(0, 3));

        lbName = new JLabel("Name");
        tfName = new JTextField();
        lbAge = new JLabel("Age");
        tfAge = new JTextField();
        lbCnic = new JLabel("CNIC");
        tfCnic = new JTextField();
        lbBankAccount = new JLabel("Bank account");
        tfBankAccount = new JTextField();

        lbNewUsername = new JLabel("New username");
        tfNewUsername = new JTextField();
        lbNewPassword = new JLabel("New password");
        tfNewPassword = new JTextField();

        lbEarning = new JLabel("Earning");
        bgEarning = new ButtonGroup();
        rbHourly = new JRadioButton("hourly");
        rbSalaried = new JRadioButton("salaried");
        bgEarning.add(rbHourly);
        bgEarning.add(rbSalaried);

        lbSalariedJob = new JLabel("Salaried Job");
        String[] salariedJobs = new String[]{"caregiver", "security guard", "receptionist"};
        cbSalariedJobs = new JComboBox(salariedJobs);

        lbHourlyJob = new JLabel("Hourly job");
        String[] hourlyJobs = new String[]{"cook", "janitor"};
        cbHourlyJobs = new JComboBox(hourlyJobs);

        lbSalary = new JLabel("salary");

        tfSalary = new JTextField();
        tfSalary.addActionListener(a);

        lbHourlyRate = new JLabel("hourly rate");
        tfHourlyRate = new JTextField();
        tfHourlyRate.addActionListener(a);

        tfName.addActionListener(a);
        tfAge.addActionListener(a);
        tfCnic.addActionListener(a);
        tfBankAccount.addActionListener(a);
        tfNewUsername.addActionListener(a);
        tfNewPassword.addActionListener(a);
        rbSalaried.addActionListener(a);
        rbHourly.addActionListener(a);
        cbHourlyJobs.addActionListener(a);
        cbSalariedJobs.addActionListener(a);

        jpUpper.add(lbName);
        jpUpper.add(tfName);
        jpUpper.add(lbAge);
        jpUpper.add(tfAge);
        jpUpper.add(lbCnic);
        jpUpper.add(tfCnic);
        jpUpper.add(lbBankAccount);
        jpUpper.add(tfBankAccount);
        jpUpper.add(lbNewUsername);
        jpUpper.add(tfNewUsername);
        jpUpper.add(lbNewPassword);
        jpUpper.add(tfNewPassword);

        jpLower.add(lbEarning);
        jpLower.add(rbHourly);
        jpLower.add(rbSalaried);
        jpUpper.add(lbSalariedJob);
        jpUpper.add(cbSalariedJobs);
        jpUpper.add(lbHourlyJob);
        jpUpper.add(cbHourlyJobs);

        jpUpper.add(lbSalary);
        jpUpper.add(tfSalary);

        jpUpper.add(lbHourlyRate);
        jpUpper.add(tfHourlyRate);

        jbCreate = new JButton("Create");
        jbBack = new JButton("Back");
        jbCreate.addActionListener(a);
        jbBack.addActionListener(a);
        
        jpLower.add(jbCreate);
        jpLower.add(jbBack);

        add(jpUpper);
        add(jpLower);

    }

    public ArrayList<Employee> readAllData() {
        //  ArrayList initialized with size 0
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
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
                    employeeList.add(myObj);
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
        return employeeList;
    }

    public class myActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Create")) {
                if (tfAge.getText().isEmpty() || tfBankAccount.getText().isEmpty() || tfCnic.getText().isEmpty() || tfName.getText().isEmpty() || tfNewPassword.getText().isEmpty() || tfNewUsername.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(new JFrame("please fill the form "), "please fill the form");

                } else if (!(tfAge.getText().isEmpty() && tfBankAccount.getText().isEmpty() && tfCnic.getText().isEmpty() && tfName.getText().isEmpty() && tfNewPassword.getText().isEmpty() && tfNewUsername.getText().isEmpty())) {

                    ArrayList<Employee> employeeList = readAllData();
                    if (rbSalaried.isSelected()) {
                        if (cbSalariedJobs.getSelectedItem().equals("caregiver")) {

                            Caregiver cr = new Caregiver(tfName.getText(), tfAge.getText(), new usernameAndPassword(tfNewUsername.getText(), tfNewPassword.getText()), tfCnic.getText(), tfBankAccount.getText(), tfSalary.getText());
                            ObjectOutputStream writer = null;
                            try {
                                
                                
                                employeeList.add(cr);
                                System.out.println("new object added to list, List Size = " + employeeList.size());
                                writer = new ObjectOutputStream(new FileOutputStream("Employee.ser", false));
                                for (int i = 0; i < employeeList.size(); i++) {

                                    writer.writeObject(employeeList.get(i));
                                    System.out.println(employeeList.get(i).getName());

                                }
                            } catch (IOException a) {
                                System.out.println("IOexception there is a problem in the creating employee file ");
                            } finally {
                                try {
                                    if (writer != null) {
                                        writer.close();

                                    }
                                } catch (IOException a) {
                                    System.out.println("IOexception while closing file");
                                }
                            }

                            JOptionPane.showMessageDialog(new JFrame(), "caregiver created");
//here

                        } else if (cbSalariedJobs.getSelectedItem().equals("security guard")) {

                            securityGuard cr = new securityGuard(tfName.getText(), tfAge.getText(), new usernameAndPassword(tfNewUsername.getText(), tfNewPassword.getText()), tfCnic.getText(), tfBankAccount.getText(), tfSalary.getText());
                            try {
                                employeeList.add(cr);
                                ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("Employee.ser", false));
                                for (int i = 0; i < employeeList.size(); i++) {

                                    write.writeObject(employeeList.get(i));
                                }
                            } catch (IOException a) {
                            }
                            JOptionPane.showMessageDialog(new JFrame(), "secuirty guard created");

                        } else if (cbSalariedJobs.getSelectedItem().equals("receptionist")) {
                            Receptionist rc = new Receptionist(tfName.getText(), tfAge.getText(), new usernameAndPassword(tfNewUsername.getText(), tfNewPassword.getText()), tfCnic.getText(), tfBankAccount.getText(), tfSalary.getText());

                            try {
                                employeeList.add(rc);
                                ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("Employee.ser", false));
                                for (int i = 0; i < employeeList.size(); i++) {

                                    write.writeObject(employeeList.get(i));
                                }
                            } catch (IOException a) {
                            }
                            JOptionPane.showMessageDialog(new JFrame(), "receptionist created");

                        }
                        salariedEmployee salariedE = new salariedEmployee(tfName.getText(), tfAge.getText(), new usernameAndPassword(tfNewUsername.getText(), tfNewPassword.getText()), tfCnic.getText(), tfBankAccount.getText(), tfSalary.getText());
                    } else if (rbHourly.isSelected()) {
                        if (cbHourlyJobs.getSelectedItem().equals("cook")) {

                            Cook ck = new Cook(tfName.getText(), tfAge.getText(), new usernameAndPassword(tfNewUsername.getText(), tfNewPassword.getText()), tfCnic.getText(), tfBankAccount.getText(), tfHourlyRate.getText());

                            try {
                                employeeList.add(ck);
                                ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("Employee.ser", false));
                                for (int i = 0; i < employeeList.size(); i++) {

                                    write.writeObject(employeeList.get(i));
                                }
                            } catch (IOException a) {
                            }
                            JOptionPane.showMessageDialog(new JFrame(), "cook created");
                        } else if (cbHourlyJobs.getSelectedItem().equals("janitor")) {
                            Janitor ja = new Janitor(tfName.getText(), tfAge.getText(), new usernameAndPassword(tfNewUsername.getText(), tfNewPassword.getText()), tfCnic.getText(), tfBankAccount.getText(), tfHourlyRate.getText());
                            try {
                                employeeList.add(ja);
                                ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("Employee.ser", false));
                                for (int i = 0; i < employeeList.size(); i++) {

                                    write.writeObject(employeeList.get(i));
                                }
                            } catch (IOException a) {
                            }

                            JOptionPane.showMessageDialog(new JFrame(), "janitor created");

                        }

                    }

                }
            } else if (e.getActionCommand().equals("Back")) {
                login a = new login();

            }

        }

    }

}
