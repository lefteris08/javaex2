/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise6;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Spyros
 */
public class Exercise6 {

    /**
     * @param args the command line arguments
     */
    
    /*
    +a. asks from the user his last name, first name, father's name
 +b. asks for his date of birth
 +c. create a file with filename = lastname.firstname.txt
 +d. write inside the file the following lines:
 +
 +Line 1: Last Name, First Name, Father's Name
 +Line 2: Date of Birth in the format DD/MM/YYYY
 +Line 3: The age of this person
    
    
    /*/
    public static void main(String[] args) {
        String color="";
        Scanner stdin = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = stdin.nextLine();
        System.out.println("Hello " + name);
        System.out.println("What is your surname?");
        String surname = stdin.nextLine();
        System.out.println("What is your Fathers name?");
        String Fname = stdin.nextLine();
        
        while(true){
        System.out.println("Whats your date of birth");
        //while(true){
        
        
        color = stdin.nextLine();
        System.out.println(color);
        // Print whats gathered to a file
       
        if(color.contains("/" )){
        
        String hjd[]=color.split("/");
        if(hjd.length<3){
        
        }
        else{
        break;
        }
        //if(hjd[0]!=null&&hjd[1]!=null&&hjd[2]!=null)
        //break;
        }
        
        //}
        }
        System.out.println("printing........");
        if (true) {
            try {
                String boith="";
                boith=name+"."+surname+".txt";
                PrintWriter writer = new PrintWriter(boith, "UTF-8");
                writer.println("Your name is " + name );
                writer.println("Your surname is " + surname);
                writer.println("Your father name" + Fname);
                //writer.println("You are " + age + " years old ");
                String []d=color.split("/");
                
                writer.println("Your date of birth is   " +d[0]+"/"+d[1]+"/"+d[2] );
                int age=0;
                age=2017-Integer.parseInt(d[2]);
                writer.println("Your age is "+ String.valueOf(age));
                
                writer.close();
                System.out.println("file is ready");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Exercise6.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Exercise6.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Wrong input");
        }

    }

}
