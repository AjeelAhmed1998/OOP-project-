package oop_final_project_daycaremanagementsystem;

/**
 * @author ajeel
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;


public class salariedEmployee extends Employee{
    
    protected String salary;

    public salariedEmployee() {
        super();
        this.salary = "60000";
    }

    public salariedEmployee(String name, String age, usernameAndPassword uap_employee, String cnic, String bankAccount, String salary) {
        super(name, age, uap_employee, cnic, bankAccount);
        this.salary = salary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    
    
    
    
    
    
    
    
    
    
    

}
