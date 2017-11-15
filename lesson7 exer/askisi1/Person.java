

package direcroriesfiles;

/**
 *
 * @author davidoster
 */

// code from https://github.com/alekarios/JAVA_homeworks/blob/master/lesson5/simple_java_app_2/Person.java - MODIFIED
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Person {
    private String lastName;
    private String Date;
    private String Month;
    private String Year;
    private String firstName;
    private String fathersName;
    private String birthday;
    private int year;
    private static PrintWriter writer = null;
    
    public void setall(String all){
        String []kl=all.split("##");
        if (kl[1].equals(" 1")){
            this.firstName = kl[0];
        }
        else if (kl[1].equals(" 2")){
        this.lastName = kl[0];
        
        }
       else if (kl[1].equals(" 3")){
       this.fathersName = kl[0]; 
       }
        else if (kl[1].equals(" 4")){
       this.Date=kl[0];
        }
        else if (kl[1].equals(" 5")){
       this.Month=kl[0];
        }
        else if (kl[1].equals(" 6")){
       this.Year=kl[0];
       this.year= Integer.valueOf(kl[0]);
     //  System.out.println("Age"+year);
     //  System.out.println("Age"+Year);
       
        }
        
        else if (kl[1].equals(" 7")){
       this.birthday=kl[0];
      // System.out.println(kl[0]);
        }
        
    
    
    }
    
    public String getall(String eis){
        
        
    if(eis.equals("LastName")) 
            {//d
        return this.lastName;
    }
        
        
    if(eis.equals("FirstName")) {
        return this.firstName;
    }
    if(eis.equals("FathersName")) {
        return this.fathersName;
    }
        
    if(eis.equals("BirthDay")) {
        return this.birthday;
    }
    
    if(eis.equals("BirthYear")) {
        return String.valueOf(this.year);
    }
    
   if(eis.equals("BirthYearInt")) {
       String j=""+this.year;
        return j;
    }
   else{    return "";
   }
    
    
    
    }
    
    
    
      
}
