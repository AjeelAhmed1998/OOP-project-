package oop_final_project_daycaremanagementsystem;

/**
 * @author ajeel
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;


public class Child extends Person implements Serializable {
    
    protected Parent parent;
    protected ArrayList<String> identityMarkers, foodAllergicTo, diseases;
    //protected String[] 
    protected String noteOnChildPersonality;
    //because its a defualt constructor its gonna have a default super()

    public Child() {
        super();
        this.parent = new Parent();
        this.identityMarkers = new ArrayList<>();
        this.foodAllergicTo = new ArrayList<>();
        this.diseases = new ArrayList<>();
        
    }

    public Child(String name, String age, Parent parent, ArrayList<String> identityMarkers, ArrayList<String> foodAllergicTo, ArrayList<String> diseases, String noteOnChildPersonality ) {
        super(name, age);
        this.parent = parent;
        this.identityMarkers = identityMarkers;
        this.foodAllergicTo = foodAllergicTo;
        this.diseases = diseases;
        this.noteOnChildPersonality = noteOnChildPersonality;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public ArrayList<String> getIdentityMarkers() {
        return identityMarkers;
    }

    public ArrayList<String> getFoodAllergicTo() {
        return foodAllergicTo;
    }

    public ArrayList<String> getDiseases() {
        return diseases;
    }

    public void setFoodAllergicTo(ArrayList<String> foodAllergicTo) {
        this.foodAllergicTo = foodAllergicTo;
    }

    public void setDiseases(ArrayList<String> diseases) {
        this.diseases = diseases;
    }

    public void setIdentityMarkers(ArrayList<String> identityMarkers) {
        this.identityMarkers = identityMarkers;
    }

    public void setNoteOnChildPersonality(String noteOnChildPersonality) {
        this.noteOnChildPersonality = noteOnChildPersonality;
    }

    public String getNoteOnChildPersonality() {
        return noteOnChildPersonality;
    }
    
    
    
    
    
    
    
   
}
