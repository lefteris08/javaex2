/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclassproject2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lefte
 */
public class Javaclassproject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clasi Klasi=new clasi();
        String date="";
        Scanner stdin = new Scanner(System.in);
        System.out.println("What is your name?");
        //String name = 
        Klasi.setname(stdin.nextLine());
        System.out.println("Hello " + Klasi.getName());
        System.out.println("What is your surname?");
        //String surname = 
        Klasi.setsurname(stdin.nextLine());
        System.out.println("What is your Fathers name?");
        //String Fname =
          Klasi.setFname(stdin.nextLine());
        while(true)
        {
        System.out.println("Whats your date of birth");
            //date = 
        Klasi.setDob(stdin.nextLine());
       // System.out.println(Klasi.getDob());
        if(Klasi.getDob().contains("/" ))
            {
            String hjd[]=Klasi.getDob().split("/");
                if(hjd.length<3)
                {
                }
                else
                {
                    break;
                }
            }
        }
        try {
                String boith="";
                boith=Klasi.getName()+"."+Klasi.getsurName()+".txt";
                PrintWriter writer = new PrintWriter(boith, "UTF-8");
                writer.println("Your name is " + Klasi.getName() );
                writer.println("Your surname is " + Klasi.getsurName());
                writer.println("Your father name  " + Klasi.getFName());
                //writer.println("You are " + age + " years old ");
                String []d=(Klasi.getDob()).split("/");
                
                writer.println("Your date of birth is   " +d[0]+"/"+d[1]+"/"+d[2] );
                int age=0;
                age=2017-Integer.parseInt(d[2]);
                writer.println("Your age is "+ String.valueOf(age));
                
                writer.close();
                System.out.println("file is ready");
            } catch (FileNotFoundException ex) {
                
            } catch (UnsupportedEncodingException ex) {
               
            }
 
        
        
        
        
        
        //System.out.println("on"+Klasi.getDob()+"on"+Klasi.getsurName()+"on"+Klasi.getName()+"on"+Klasi.getFName());
        
        
    }
    
}
