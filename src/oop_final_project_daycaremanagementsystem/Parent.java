package oop_final_project_daycaremanagementsystem;

/**
 * @author ajeel
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;


public class Parent extends Person implements Serializable{
    protected String job;
    protected String address;
    protected String phoneNumber;
    protected String cnic;

    
    //default constructor 
    public Parent() {
         
        super();
        
        this.job = "Worker";
        this.address = "House, Street, Sector";
        this.phoneNumber = "0000-0000-00";
        this.cnic = "0000-0000-00";
        
        
         
    }
    
    

    public Parent(String name, String age, String job, String address, String phoneNumber, String cnic) {
        super(name, age);
        this.job = job;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.cnic = cnic;
    }

    public String getJob() {
        
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }
    
    
    
    

    
    
   

  
    
    
    
    
    
    
    

}
