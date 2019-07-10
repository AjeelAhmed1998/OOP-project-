package oop_final_project_daycaremanagementsystem;

/**
 * @author ajeel
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;


public class Janitor extends hourlyEmployee{

    public Janitor(String name, String age, usernameAndPassword uap_employee, String cnic, String bankAccount,String hourlyRate) {
        super(name, age, uap_employee, cnic, bankAccount, hourlyRate);
    }
    
    public Janitor(){
        super();
    }
    
    

}
