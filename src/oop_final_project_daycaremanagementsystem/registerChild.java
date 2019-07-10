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


public class registerChild extends JFrame{
    JLabel lbName, lbTime;
    JTextField tfName, tfTimeFrom, tfTimeTo;
    JButton jbAdmit;
    
    
    public registerChild() throws HeadlessException {
        setSize(400, 400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        myActionListener a = new myActionListener();
        
        
        lbName = new JLabel("name");
        tfName = new JTextField();
        
        
        lbTime = new JLabel("Time");
        tfTimeFrom = new JTextField();
        tfTimeTo = new JTextField();
        
        jbAdmit = new JButton("admit");
        
        
        
        
        
        
        
        
        
        
        
        
               
        
       
        
    }
    
    public class myActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals(jbAdmit.getText())){
                
            }
            
            
            
            
            
        }
        
    }
            
    
    

}
