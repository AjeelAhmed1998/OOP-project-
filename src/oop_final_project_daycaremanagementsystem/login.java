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

public class login extends JFrame {

    //plUpper will have labels and textfields and lower will have buttons 
    JPanel plUpper, plLower;
    JLabel lbUser, lbPassword;
    JTextField tfUser, tfPassword;
    JButton btLogin, btCreate;

    public login() throws HeadlessException {

        super("Login");

        setLayout(new FlowLayout());

        setSize(800, 800);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);

        myActionListener forLogin = new myActionListener();
        //initializing all components 
        plUpper = new JPanel(new FlowLayout());

        plLower = new JPanel(new FlowLayout());

        lbUser = new JLabel("Username");

        lbPassword = new JLabel("Password");

        tfUser = new JTextField("ajeel", 15);
        tfUser.addActionListener(forLogin);

        tfPassword = new JTextField("ajeel", 15);
        tfPassword.addActionListener(forLogin);

        btCreate = new JButton("Create new account for employee");
        btCreate.addActionListener(forLogin);
        btLogin = new JButton("Login");
        btLogin.addActionListener(forLogin);

        plUpper.add(lbUser);
        plUpper.add(tfUser);
        plUpper.add(lbPassword);
        plUpper.add(tfPassword);

        plLower.add(btLogin);
        plLower.add(btCreate);
        add(plUpper);
        add(plLower);
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
            System.out.println("IO Exception while opening stream"+e.getMessage());
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

        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals("Login")) {
                //if (!(tfUser.getText().isEmpty() && tfPassword.getText().isEmpty())) {
                System.out.println("Reading file");

                System.out.println("got till here");

                ArrayList<Employee> employeeList = readAllData();
                for (int i = 0; i < employeeList.size(); i++) {
                    System.out.println(i+"- In Login Method : "+employeeList.get(i).getUap_employee().username);

                    //System.out.println(employeeList.size());
                    // System.out.println(employeeList.get(i).getUap_employee().getUsername());
                    //if(employeeList.get(i).getUap_employee().getUsername().equals(tfUser.getText())) {
                    if (employeeList.get(i).getUap_employee().getUsername().equals(tfUser.getText()) && employeeList.get(i).getUap_employee().getPassword().equals(tfPassword.getText())) {
                        //createEmployee E = new createEmployee();
                        mainMenu a = new mainMenu();
                        break;

                    } else if ((i == employeeList.size() - 1) && !(employeeList.get(i).getUap_employee().getUsername().equals(tfUser.getText())) && !(employeeList.get(i).getUap_employee().getPassword().equals(tfPassword.getText()))) {
                        JOptionPane.showMessageDialog(new JFrame(), "wrong username or password");

                    } else {
                        System.out.println("working");
                        continue;
                    }

                }

            } else if (e.getActionCommand().equals("Create new account for employee")) {

                createEmployee a = new createEmployee();

            }
            

        }

    }
}
