package oop_final_project_daycaremanagementsystem;

/**
 * @author ajeel
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class usernameAndPassword implements Serializable{

    protected String username;
    protected String password;

    public usernameAndPassword() {
        this.username = "admin";
        this.password = "ciit111";

    }

    public usernameAndPassword(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
