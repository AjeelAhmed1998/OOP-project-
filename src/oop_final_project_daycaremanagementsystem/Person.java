package oop_final_project_daycaremanagementsystem;

/**
 * @author ajeel
 */

import java.util.Scanner;

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

/*creating abstract Person class so it will be easier to create child classes, 
the Person class is abstract because we will never be instantiating it*/


//abstract methods can not have a body


public abstract class Person implements Serializable {
    
    public String pass;
    
    protected String name;
    protected String age;
    
    /*we should try to avoid null objects as much as possible
    */
    public Person() {
        
        this.name = "John Doe";
        this.age = "0";
        
        
    }
    
    

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
}
