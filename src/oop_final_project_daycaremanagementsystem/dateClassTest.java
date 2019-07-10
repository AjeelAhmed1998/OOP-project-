package oop_final_project_daycaremanagementsystem;

/**
 * @author ajeel
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import sun.util.BuddhistCalendar;
import java.text.*;

public class dateClassTest {

    public static void main(String[] args) {
//        Date a = new Date();
//        System.out.println(a.toString());
//        
//        Date c = new Date();
//        
//        SimpleDateFormat date = new SimpleDateFormat("hh");
//        
//        System.out.println(date.format(a));
//        
//        
//        Date ate = new Date();
//        
//        System.out.printf("%1$s %2$tB %2$td, %2$tY ", "Due date:", ate);

        Scanner input = new Scanner(System.in);
        System.out.println("write in this format");
        System.out.println("at what time are you leaving the kid?");
        String a = "1:24";

        System.out.println("at what time will you be picking them up?");
        String ad = "3:33";

//        parsing strings into date objects 
        Date ant = new Date();

        SimpleDateFormat ft = new SimpleDateFormat("HH:mm");

        try {
            
           
            
            Date t = ft.parse(a);
//            System.out.println("time is " + t.getTime());
            Date s = ft.parse(ad);
            System.out.println(t);
            double milliDouble = (s.getTime()- t.getTime());
            double doubleHours = milliDouble/3600000;
           // System.out.println(doubleHours);
           int anthony = (int) doubleHours;
            System.out.println("hours"+anthony);
          //  System.out.println(doubleHours);
            double minutes = (doubleHours-anthony)*60;
//            System.out.println(minutes);
//            minutes = (int) minutes;
            System.out.println("minutes are" +Math.round(minutes));
            
            
           
            
//            
//            String time = diff + "";
//            
//            Date abb = ft.parse(time);
//            
//            System.out.println(abb.getTime());
//            t.compareTo(new Date());
//            t.setTime(1222222);
        } catch (ParseException e) {
            System.out.println("Unparseable using " + ft);
        }
        
        
//        admitAndRegister a = new admitAndRegister();
        

    }

}
