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


public class createProfile extends JFrame {
    /*its gonna ask 
    whether they want to make a new parent account or they already have an existing parent account */
    
    
    
    JLabel lbParentType;
    JButton jbNewParent, jbExistingParent, jbBack;
    public createProfile() throws HeadlessException {
        setLayout(new FlowLayout());
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        lbParentType = new JLabel();
        jbNewParent = new JButton("New parent");
        jbExistingParent = new JButton("Existing parent");
        myActionListener a =  new myActionListener();
        
        jbBack = new JButton("back");
        jbBack.addActionListener(a);
        
        add(lbParentType);
        
        jbNewParent.addActionListener(a);
        add(jbNewParent);
        jbExistingParent.addActionListener(a);
        add(jbExistingParent);
        
        add(jbBack);
        
        
        
        
    }
    
    public class myActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getActionCommand().equals(jbNewParent.getText())){
               newParentAndChild a = new newParentAndChild();
            }
            
            else if (e.getActionCommand().equals(jbExistingParent.getText())){
                existingParentAndNewChild a = new existingParentAndNewChild();
            }
            
            else if (e.getActionCommand().equals(jbBack.getText())){
                mainMenu a = new mainMenu();
                       
            }
        }
        
    }
    
    
    

}
