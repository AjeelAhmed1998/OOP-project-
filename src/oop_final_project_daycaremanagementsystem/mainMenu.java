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


public class mainMenu extends JFrame{
    
    JButton jbrCreateProfile, jbRegister, jbBilling, jbUpdate, jbRemove, jbSearch, jbBack;
    public mainMenu() throws HeadlessException {
        super("Main menu");
        
        setLayout(new GridLayout(0, 2));
        
        
        setSize(1080, 400);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setVisible(true);
        
        myActionListener a = new myActionListener();
        
        
        jbrCreateProfile = new JButton("create a new profile for child");
        jbrCreateProfile.addActionListener(a);
        jbRegister = new JButton("register");
        jbRegister.addActionListener(a);
        jbBilling = new JButton("billing");
        jbBilling.addActionListener(a);
        jbUpdate = new JButton("update");
        jbUpdate.addActionListener(a);
        jbRemove = new JButton("remove");
        jbRemove.addActionListener(a);
        jbSearch = new JButton ("search");
        jbSearch.addActionListener(a);
        jbBack = new JButton ("back");
        jbBack.addActionListener(a);
        
        add(jbrCreateProfile);
        add(jbRegister);
      //  add(jbBilling);
        add(jbUpdate);
        add(jbRemove);
        add(jbSearch);
        add(jbBack);
        
        
        
        
        
    }
    
    public class myActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if (e.getActionCommand().equals("create a new profile for child")) {
                createProfile a = new createProfile();
            }
            
            else if(e.getActionCommand().equals("register")){
                //registerChild b = new registerChild();
                admitAndRegister a = new admitAndRegister();
            
        }
            
            else if (e.getActionCommand().equals(jbUpdate.getText())){
                System.out.println("hello");
                update he = new update();
            }
            
            else if(e.getActionCommand().equals(jbRemove.getText())){
                remove a = new remove();
            }
            
            else if(e.getActionCommand().equals(jbSearch.getText())){
                search a = new search();
            }
            
            else if(e.getActionCommand().equals(jbBack.getText())){
                login ae = new login();
            }
        }
    
    }
    
    

}
