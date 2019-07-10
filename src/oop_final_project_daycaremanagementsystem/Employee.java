package oop_final_project_daycaremanagementsystem;

/**
 * @author ajeel
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public abstract class Employee extends Person implements Serializable{

    protected usernameAndPassword uap_employee;//userAndPassword of employee
    protected String cnic;
    protected String bankAccount;


//    public Employee() {
//        super();
//        
//        
//    }
    public Employee() {

        super();
        this.cnic = "0000-0000-00";
        this.bankAccount = "0000-0000-00";
    }

    public Employee(String name, String age, usernameAndPassword uap_employee, String cnic, String bankAccount ) {
        super(name, age);
        this.uap_employee = uap_employee;
        this.cnic = cnic;
        this.bankAccount = bankAccount;
    }

    public usernameAndPassword getUap_employee() {
        return uap_employee;
    }

    public void setUap_employee(usernameAndPassword uap_employee) {
        this.uap_employee = uap_employee;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
    
    
    
    
    

}
