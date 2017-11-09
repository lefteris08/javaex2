/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi1enwsi;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lefte
 */
public class Askisi1enwsi {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        epistrtim ep = new epistrtim();    
        Scanner reader = new Scanner(System.in);
        int y=0;
        String h= "A";
        String g="";
         String gtel="";
        //h=ep.epistring("Bale String", reader);
        y=ep.epistinr("Bale int", reader);
       // reader.next();
       System.out.print("prosoxi");
//reader.
        reader = new Scanner(System.in);
       //y=ep.epistinr("Bale int", reader);
       h=ep.epistring("Bale String", reader);
        g= String.valueOf(y);
        gtel=g+h;
        System.out.println("o telikos arithmos einai "+gtel);
        
        
    



    }






}
