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


public class update extends JFrame{

    JButton jbUpdateEmployee, jbUpdateChild, jbBack;
    
    
    // I should have designed the program so if i change the parent information it would change the parents 
    //information of children who have the parents in commo, i.e if they are siblings so the user would not have to update the information again and again
           
    
    
    public update() throws HeadlessException {
        super("Update");
        setLayout(new FlowLayout());
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        myActionListener a = new myActionListener();
        
        jbUpdateChild = new JButton("Update child information");
        jbUpdateChild.addActionListener(a);
        jbUpdateEmployee = new JButton("Update employee information");
        jbUpdateEmployee.addActionListener(a);
        
        jbBack = new JButton("back");
        jbBack.addActionListener(a);
        
        add(jbUpdateChild);
        add(jbUpdateEmployee);
        add(jbBack);
        
        
        
        
        
        
        
        
        
       
        
        
        
    }
    
    public class myActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals(jbUpdateChild.getText())){
                
                updateChild a = new updateChild();
                
                
                
            }
            else if (e.getActionCommand().equals(jbUpdateEmployee.getText())){
                updateEmployee a  = new updateEmployee();
                
                
                
            }
            
            else if (e.getActionCommand().equals(jbBack.getText())){
                mainMenu a = new mainMenu();
            }
        }
        
    }
    
    
    

}
