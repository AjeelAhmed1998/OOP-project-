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

public class updateEmployee extends JFrame {

    JLabel lbEnterUsername, lbEnterPassword, lbName, lbAge, lbUsername, lbPassword, lbBankAccount, lbCNIC;
    JTextField tfEnterUsername, tfEnterPassword, tfName, tfAge, tfUsername, tfPassword, tfBankAccount, tfCNIC;
    JButton jbUpdate, jbBack, jbSearch;

    public updateEmployee() throws HeadlessException {
        super("update employee info");
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 2));
        setVisible(true);

        myActionListener a = new myActionListener();

        lbEnterUsername = new JLabel("enter username");
        lbEnterPassword = new JLabel("enter password");
        lbName = new JLabel("name");
        lbAge = new JLabel("age");
        lbUsername = new JLabel("username");
        lbPassword = new JLabel("password");
        lbBankAccount = new JLabel("bank account number");
        lbCNIC = new JLabel("cnic");

        jbSearch = new JButton("search");
        jbSearch.addActionListener(a);

        tfEnterUsername = new JTextField(10);
        tfEnterUsername.addActionListener(a);
        tfEnterPassword = new JTextField(10);
        tfEnterPassword.addActionListener(a);
        tfName = new JTextField(10);
        tfName.addActionListener(a);
        tfAge = new JTextField(10);
        tfAge.addActionListener(a);
        tfUsername = new JTextField(10);
        tfUsername.addActionListener(a);
        tfPassword = new JTextField(10);
        tfPassword.addActionListener(a);
        tfBankAccount = new JTextField(10);
        tfBankAccount.addActionListener(a);
        tfCNIC = new JTextField(10);
        tfCNIC.addActionListener(a);

        jbUpdate = new JButton("Update");
        jbUpdate.addActionListener(a);
        jbBack = new JButton("back");
        jbBack.addActionListener(a);

        add(lbEnterUsername);
        add(tfEnterUsername);
        add(lbEnterPassword);
        add(tfEnterPassword);
        add(lbName);
        add(tfName);
        add(lbAge);
        add(tfAge);
        add(lbBankAccount);
        add(tfBankAccount);
        add(lbCNIC);
        add(tfCNIC);
        add(lbUsername);
        add(tfUsername);
        add(lbPassword);
        add(tfPassword);
        add(jbUpdate);
        add(jbBack);
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
            if (e.getActionCommand().equals("search")) {
                System.out.println("search");
                for (int i = 0; i < employeeList.size(); i++) {
                    if (employeeList.get(i).getUap_employee().getUsername().equals(tfEnterUsername.getText()) && employeeList.get(i).getUap_employee().getPassword().equals(tfEnterPassword.getText())) {
                        tfName.setText(employeeList.get(i).getName());
                        System.out.println(employeeList.get(i).getName());
                        tfAge.setText(employeeList.get(i).getAge());
                        tfUsername.setText(employeeList.get(i).getUap_employee().getUsername());
                        tfPassword.setText(employeeList.get(i).getUap_employee().getPassword());
                        tfBankAccount.setText(employeeList.get(i).getBankAccount());
                        tfCNIC.setText(employeeList.get(i).getCnic());
                        JOptionPane.showMessageDialog(new JFrame(), "found");
                        System.out.println("probably didnt came in then");
                        
                        
                        break;

                    } else if ((i == employeeList.size() - 1) && !(employeeList.get(i).getUap_employee().getUsername().equals(tfEnterUsername.getText())) && !(employeeList.get(i).getUap_employee().getPassword().equals(tfEnterPassword.getText()))) {
                        JOptionPane.showMessageDialog(new JFrame(), "wrong username or password");

                    } else {
                        //System.out.println("working");
                        System.out.println("not found");
                        continue;
                    }

                }
            } else if (e.getActionCommand().equals(jbUpdate.getText())) {
                for (int i = 0; i < employeeList.size(); i++) {
                    if (employeeList.get(i).getUap_employee().getUsername().equals(tfEnterUsername.getText()) && employeeList.get(i).getUap_employee().getPassword().equals(tfEnterPassword.getText())) {
                        employeeList.remove(i);
//                    employeeList.get(i).setName();
//                    System.out.println(employeeList.get(i).getName());
//                    employeeList.get(i).setAge();
//                    employeeList.get(i).setBankAccount(tfBankAccount.getText());
//                    employeeList.get(i).setCnic();
//                    employeeList.get(i).getUap_employee().setUsername();
//                    employeeList.get(i).getUap_employee().setPassword();
//                    System.out.println("hello is this working");
                        salariedEmployee cr = new salariedEmployee(tfName.getText(), tfAge.getText(), new usernameAndPassword(tfUsername.getText(), tfPassword.getText()), tfCNIC.getText(), tfBankAccount.getText(), "89");
                        ObjectOutputStream writer = null;
                        try {
                                
                                
                                employeeList.add(cr);
                                System.out.println("new object added to list, List Size = " + employeeList.size());
                                writer = new ObjectOutputStream(new FileOutputStream("Employee.ser", false));
                                for (int j = 0; j < employeeList.size(); j++) {

                                    writer.writeObject(employeeList.get(j));
                                    System.out.println(employeeList.get(j).getName());

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
                        JOptionPane.showMessageDialog(new JFrame(), "account updated");

                    }

                }

            }
            
            else if (e.getActionCommand().equals(jbBack.getText())){
                update a = new update();
            }

        }

    }
}
