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

public class search extends JFrame {

    JButton jbSearchEmployee, jbSearchChild, jbBack;

    public search() throws HeadlessException {
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());
        myActionListener a = new myActionListener();
        
        jbSearchChild = new JButton("search child");
        jbSearchChild.addActionListener(a);
        jbSearchEmployee = new JButton("search employee");
        jbSearchEmployee.addActionListener(a);
        
        jbBack = new JButton("back");
        jbBack.addActionListener(a);
        
        
        add(jbSearchChild);
        add(jbSearchEmployee);
        add(jbBack);

    }

    public class myActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getActionCommand().equals(jbSearchChild.getText())){
                searchChild a = new searchChild();
                
            }
            
            else if (e.getActionCommand().equals(jbSearchEmployee.getText())){
                searchEmployee b = new searchEmployee();
            }
            
            else if (e.getActionCommand().equals(jbBack.getText())){
                mainMenu  a = new mainMenu();
                
            }

        }

    }

}
