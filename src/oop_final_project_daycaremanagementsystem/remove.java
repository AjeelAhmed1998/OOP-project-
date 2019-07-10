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


public class remove extends JFrame {
    JButton jbRemoveChild, jbRemoveEmployee, jbBack;
    public remove() throws HeadlessException {
        super("remove");
        
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setVisible(true);
        
        myActionListener n = new myActionListener();
        
        jbRemoveChild = new JButton("remove child");
        jbRemoveChild.addActionListener(n);
        jbRemoveEmployee = new JButton("remove employee");
        jbRemoveEmployee.addActionListener(n);
        
        jbBack = new JButton("back");
        jbBack.addActionListener(n);
        
        
        
        add(jbRemoveChild);
        add(jbRemoveEmployee);
        add(jbBack);
        
        
        
        
    }
    
    public class myActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().equals(jbRemoveChild.getText())){
                removeChild a = new removeChild();
                
            }
            
            else if(e.getActionCommand().equals(jbRemoveEmployee.getText())){
                
                removeEmployee b = new removeEmployee();
        }
            
            
            else if (e.getActionCommand().equals(jbBack.getText())){
                mainMenu a = new mainMenu();
            }
        }
        
    }
     

}
