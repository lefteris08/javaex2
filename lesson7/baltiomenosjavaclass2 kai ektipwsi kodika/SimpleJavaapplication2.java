/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplejavaapplication2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author davidoster
 */
public class SimpleJavaapplication2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person person = new Person();
        String replaced="";
        System.out.println("Give your first name");
        replaced=input.next()+"## 1";    
        //System.out.println(replaced);
        //String []kl=replaced.split("##");
        //System.out.println(kl[0]+"       "+kl[1]);
        person.setall(replaced);
//person.setFirstName(input.next());
        
        System.out.println("Give your last name");
        //person.setLastName(input.next());
        
        
        replaced=input.next()+"## 2";    
        //kl=replaced.split("##");
        //System.out.println(kl[0]+"       "+kl[1]);
        
        person.setall(replaced);
        System.out.println("Give your father's name");
        //person.setFatherName(input.next());
        replaced=input.next()+"## 3";    
        //kl=replaced.split("##");
       // System.out.println(kl[0]+"       "+kl[1]);
        
        
        
        person.setall(replaced);
        
        //input.close();
        //person.setBirthDay(person.setBirthDate());
        person.setall("as## 4");
        //Integer.
        for(int i = 1; i <= 3; i++){
            switch(i){
                case 1: 
                    //writer.println("Line " + i + ": " + this.lastName + ", " + this.firstName + ", " + this.fathersName);
                    person.WriteString(i,"Last Name: " + person.getall("LastName") + ", First Name: " + person.getall("FirstName") + ", Father's Name: " + person.getall("FathersName"));
                    break;
                case 2: 
                    person.WriteString(i,"Your birthday is on: " + person.getall("BirthDay"));
                    break;
                default: 
                    person.WriteString(i, "Your age is: " + (Calendar.getInstance().get(Calendar.YEAR) - Integer.valueOf(person.getall("BirthYearInt"))));
                break;
            }
        }
        
        //edw tha ektipwsoume to arxeio
        String boith="";
        //this.lastName + "." + this.firstName
        boith=System.getProperty("user.dir")+"\\"+person.getall("LastName")+"."+person.getall("FirstName")+".txt";
        System.out.println(boith);
        Path path = Paths.get(boith);
        try {
            Files.lines(path).forEach(System.out::println);
           //System.out.println( Files.lines(path, StandardCharsets.UTF_8));
        } catch (IOException ex) {
            Logger.getLogger(SimpleJavaapplication2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}