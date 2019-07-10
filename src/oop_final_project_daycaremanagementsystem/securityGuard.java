package oop_final_project_daycaremanagementsystem;

/**
 * @author ajeel
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;


public class securityGuard extends salariedEmployee{

    public securityGuard() {
        super();
    }
    
    
    public securityGuard(String name, String age, usernameAndPassword uap_employee, String cnic, String bankAccount, String salary){
        super(name, age, uap_employee, cnic, bankAccount, salary);
    }
            
    

}
