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

public class SimpleJavaapplication2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person person = new Person();
        Filehandler fh=new Filehandler();
        String replaced="";
        System.out.println("Give your first name");
        replaced=input.next()+"## 1";    
        person.setall(replaced);
        
        System.out.println("Give your last name");
        replaced=input.next()+"## 2";    
        person.setall(replaced);
        System.out.println("Give your father's name");
        replaced=input.next()+"## 3";    
        
        
        
        person.setall(replaced);
       while(true){
            System.out.println("whats your birthday");
            replaced=input.next();//+"## 4";    
            if(replaced.contains("/" ))
            {
            String hjd[]=replaced.split("/");
            int c;
                if(hjd.length<3 )
                {
                    System.out.println("你打错了号码");
                
                }
                else
                {
                    try{
                    Integer.valueOf(hjd[2]);
                    Integer.valueOf(hjd[1]);
                    Integer.valueOf(hjd[0]);
                    person.setall(hjd[0]+"## 4");  
                    person.setall(hjd[1]+"## 5");    
                    person.setall(hjd[2]+"## 6");    
                    person.setall(replaced+"## 7");
                    break;
                }
                catch(NumberFormatException iu){
                System.out.println("你打错了号码");
                }
                }
            }
        
        
        
       }       String pathapos="";
                pathapos=System.getProperty("user.dir")+"\\"+person.getall("LastName")+"."+person.getall("FirstName")+".txt";
               
        //for(int i = 1; i <= 3; i++){
            String periexomeno="";
            //switch(i){
                
                //case 1:
                    periexomeno="Line "+ 1+" Last Name: " + person.getall("LastName") + ", First Name: " + person.getall("FirstName") + ", Father's Name: " + person.getall("FathersName");
                    fh.diagrgrapsimo(periexomeno, pathapos);
                    
                    //person.WriteString(i,"Last Name: " + person.getall("LastName") + ", First Name: " + person.getall("FirstName") + ", Father's Name: " + person.getall("FathersName"));
                  //  break;
                //case 2: 
                   // person.WriteString(i,"Your birthday is on: " + person.getall("BirthDay"));
                    periexomeno="Line "+2+" Your birthday is on: " + person.getall("BirthDay");
                    fh.grapsimo(periexomeno, pathapos);
                    
                //    break;
              //  default: 
                    periexomeno="Line "+3+ " Your age is: " + (Calendar.getInstance().get(Calendar.YEAR) - Integer.valueOf(person.getall("BirthYearInt")));
                     fh.grapsimo(periexomeno, pathapos);
                   
                    
            //        break;
          //  }
        //}
        
        //edw tha ektipwsoume to arxeio
        String boith="";
        //this.lastName + "." + this.firstName
        boith=System.getProperty("user.dir")+"\\"+person.getall("LastName")+"."+person.getall("FirstName")+".txt";
        //System.out.println(boith);
        Path path = Paths.get(boith);
        try {//edw ektipwnoume ton kodika 
            Files.lines(path).forEach(System.out::println);
           } catch (IOException ex) {
            Logger.getLogger(SimpleJavaapplication2.class.getName()).log(Level.SEVERE, null, ex);
        }
      //i xrisimopoioume   fh.ekripwsi(boith);
         
    }
}
