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
public class Javaclassproject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        erwtiseis();
       // energ();
        //System.out.println("on"+Klasi.getDob()+"on"+Klasi.getsurName()+"on"+Klasi.getName()+"on"+Klasi.getFName());
        
        
    }
    
    
    public static void energ(){
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
        
        
        stdin.close();
       ektipwsiarx(Klasi);
        
       }
    
    public static void ektipwsiarx2(clasi Klasi,String str1){
        
    }
    
    public static void ektipwsiarx(clasi Klasi){
     try {
                String boith="";
                String str1="Your name is ";
                
                String str2="Your  surname is ";
                
                String str3="Your  Fathersname is ";
                
                String str4="Your Date of birth is ";
                
                
                String str5="Your age is ";
               System.out.println(System.getProperty("user.dir"));
            //print
                //String str1="Your name is ";
                //parakatw pernoume to dir tou project mas
                boith=System.getProperty("user.dir")+"\\"+Klasi.getName()+"."+Klasi.getsurName()+".txt";
                if(new File(boith).isFile()){
                 PrintWriter writer= new PrintWriter(new FileOutputStream(new File(boith), true));
                
                writer.println(str1 + Klasi.getName() );
                writer.println("Your surname is " + Klasi.getsurName());
                writer.println("Your father name  " + Klasi.getFName());
                //writer.println("You are " + age + " years old ");
                String []d=(Klasi.getDob()).split("/");
                
                writer.println("Your date of birth is   " +d[0]+"/"+d[1]+"/"+d[2] );
                int age=0;
                age=2017-Integer.parseInt(d[2]);
                writer.println("Your age is "+ String.valueOf(age));
                
                writer.close();
                }
                else{
                PrintWriter writer = new PrintWriter(boith, "UTF-8");
                
                writer.println(str1 + Klasi.getName() );
                writer.println("Your surname is " + Klasi.getsurName());
                writer.println("Your father name  " + Klasi.getFName());
                //writer.println("You are " + age + " years old ");
                String []d=(Klasi.getDob()).split("/");
                
                writer.println("Your date of birth is   " +d[0]+"/"+d[1]+"/"+d[2] );
                int age=0;
                age=2017-Integer.parseInt(d[2]);
                writer.println("Your age is "+ String.valueOf(age));
                
                writer.close();
                }
                System.out.println("file is ready");
            } catch (FileNotFoundException ex) {
                
            } catch (UnsupportedEncodingException ex) {
               
            }
     
     
            
 }
    public static void erwtiseis()
    {clasi Klasi=new clasi();
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
        String []periexomena=new String[4];
        periexomena[0]="to onoma sou einai "+Klasi.getName();
        periexomena[1]="to epwnimo sou einai "+Klasi.getsurName();
        periexomena[2]="to onoma tou patera sou einai "+ Klasi.getFName();
        periexomena[3]="i imerominia einai "+Klasi.getDob();
        for (int u=0;u<4;u++ ){
            egrafi(u+1,periexomena[u]);
        
        
        
        }
        
        stdin.close();
     
    
    
    }
    
     public static void egrafi(int c ,String str){
     
     
     if(new File("C:\\Users\\lefte\\Documents\\NetBeansProjects\\New Folder\\Javaclassproject2\\kati.txt").isFile()){
     PrintWriter writer;
         try {
             writer = new PrintWriter(new FileOutputStream(new File("C:\\Users\\lefte\\Documents\\NetBeansProjects\\New Folder\\Javaclassproject2\\kati.txt"), true));
                writer.println(""+String.valueOf(c)+"    "+str );
                writer.close();
         } catch (FileNotFoundException ex) {
             Logger.getLogger(Javaclassproject2.class.getName()).log(Level.SEVERE, null, ex);
         }
                
                
        }
                else{
                PrintWriter writer;
         try {
             writer = new PrintWriter("C:\\Users\\lefte\\Documents\\NetBeansProjects\\New Folder\\Javaclassproject2\\kati.txt", "UTF-8");
                writer.println(""+String.valueOf(c)+"    "+str );
         
                writer.close();
         
         
         } catch (FileNotFoundException ex) {
             Logger.getLogger(Javaclassproject2.class.getName()).log(Level.SEVERE, null, ex);
         } catch (UnsupportedEncodingException ex) {
             Logger.getLogger(Javaclassproject2.class.getName()).log(Level.SEVERE, null, ex);
         }
                
                }
     
     }
    
    //Scanner stdin = new Scanner(System.in);
    
}
