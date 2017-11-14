

package simplejavaapplication2;

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
    private String firstName;
    private String fathersName;
    private String birthday;
    private int year;
    private static PrintWriter writer = null;
    //private String writeString;
    /*/
    public void setLastName(String lastName) {
        this.lastName = lastName;//done
    }
    public String getLastName() {//d
        return this.lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;//sone
    }
    public String getFirstName() {//d
        return this.firstName;
    }
    public void setFatherName(String fathersName) {
        this.fathersName = fathersName;//done
    }
    public String getFathersName() {//d
        return this.fathersName;
    }
    
    public String setBirthDate() {
        Scanner scanner = new Scanner(System.in);
        String str[] = {"day (DD)", "month (MM)", "year (YYYY)" };
        String date = "";

        for(int i = 0; i < 3; i++) {
            System.out.println("Enter your " + str[i] + " of birth : ");
            if(i == 2) {
                this.year = scanner.nextInt();
                date = date + String.valueOf(this.year);
            }
            else 
                date = date + scanner.next() + "/";
        }
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date parsedDate = null;

        try {
            parsedDate = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parsedDate.toString();
    }
    /*/
    public void setall(String all){
        String []kl=all.split("##");
        //System.out.println(kl[0]+kl[1]);
        if (kl[1].equals(" 1")){
            this.firstName = kl[0];
         //   System.out.print("i timi pou tha eprepe na exei einai "+kl[0]);
        }
        else if (kl[1].equals(" 2")){
           // System.out.print("i timi pou tha eprepe na exei einai "+kl[0]);
        this.lastName = kl[0];
        
        }
       else if (kl[1].equals(" 3")){
       this.fathersName = kl[0]; 
       }
        else if (kl[1].equals(" 4")){
       //this.fathersName = kl[0]; 
       
        Scanner scanner2 = new Scanner(System.in);
        String str[] = {"day (DD)", "month (MM)", "year (YYYY)" };
        String date = "";

        for(int i = 0; i < 3; i++) {
            System.out.println("Enter your " + str[i] + " of birth : ");
            if(i == 2) {
                this.year = scanner2.nextInt();
                date = date + String.valueOf(this.year);
            }
            else 
                date = date + scanner2.next() + "/";
        }
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date parsedDate = null;

        try {
            parsedDate = dateFormat.parse(date);
             } 
        catch (ParseException e) {
            e.printStackTrace();
            }
        
        
        this.birthday=parsedDate.toString();
        
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
    
    
    
    //one set kai ena get 
/*/    
    public void setBirthDay(String s) {
        //this.birthday = String.format("%d/%d/%d",day,month,year);
        this.birthday = s;
    }
    
    public String getBirthDay() {
        return this.birthday;
    }
    
    public String getBirthYear() {
        return String.valueOf(this.year);
    }
    
    public int getBirthYearInt() {
        return this.year;
    }
 /*/   
    public void WriteString(int i, String s) {
        if(i == 1) {
            try {
                writer = new PrintWriter(this.lastName + "." + this.firstName + ".txt");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        writer.println("Line " + i + ": " + s);
        if(i == 3) writer.close();
    }
}
