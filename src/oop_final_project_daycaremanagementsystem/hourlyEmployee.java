package oop_final_project_daycaremanagementsystem;

/**
 * @author ajeel
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;


public class hourlyEmployee extends Employee {
    
    protected String hourlyRate;

    public hourlyEmployee() {
        super();
        this.hourlyRate = "10.10";
    }

    public hourlyEmployee(String name, String age, usernameAndPassword uap_employee, String cnic, String bankAccount,String hourlyRate) {
        super(name, age, uap_employee, cnic, bankAccount);
        this.hourlyRate = hourlyRate;
    }

    public String getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(String hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
    
    public double hourlySalaryCalculation(double hours){
        return Double.parseDouble(hourlyRate)*hours;
    }
    
    
    
    
    

   
    
    
    

}
