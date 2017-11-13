/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclassproject2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lefte
 */
public class clasi {
    
    private String name;
    private String surname;
    private String fathersname;
    private int age;
    private String dob;//date of birth
    public void setname(String name){
       // System.out.println(name);
    this.name=name;
    }
    public void setsurname(String name){
    this.surname=name;
    }
    public void setFname(String name){
    this.fathersname=name;
    }
    public void setDob(String name){
    this.dob=name;
    }
    public String getName()
    {
    return name;
    }
    public String getFName()
    {
    return fathersname;
    }
    public String getDob()
    {
    return dob;
    }
    public String getsurName()
    {
    return surname;
    }
    
    public  void dim(){
        PrintWriter writer;
     // Scanner stdin = new Scanner(System.in);
        try {
            writer = new PrintWriter("the-file-name.txt", "UTF-8");
          writer.println("The first line");
        writer.println("The second line");
        writer.close();
        
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Javaclassproject2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Javaclassproject2.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    public  void grapsimo(String stoixia,String periexomeno,clasi Klasi){
    
    try {
            String boith="";
                //parakatw pernoume to dir tou project mas
                boith=System.getProperty("user.dir")+"\\"+Klasi.getName()+"."+Klasi.getsurName()+".txt";
                if(new File(boith).isFile()){
                 PrintWriter writer= new PrintWriter(new FileOutputStream(new File(boith), true));
                
                writer.println(stoixia + periexomeno );
                
                writer.close();
                }
                else{
                PrintWriter writer = new PrintWriter(boith, "UTF-8");
                
                writer.println(stoixia + periexomeno );
                
                writer.close();
                }
                System.out.println("file is ready");
            } catch (FileNotFoundException ex) {
                
            } catch (UnsupportedEncodingException ex) {
               
            }
    }
    
    
    
}
