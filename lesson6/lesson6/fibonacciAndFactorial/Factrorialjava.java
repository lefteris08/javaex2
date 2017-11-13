/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//factorial kai fibonacci 
// na kanw kai to locale ellinika
package factrorialjava;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lefte
 */
public class Factrorialjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
            System.out.print("bale ena int");
        
            Scanner red=new Scanner(System.in);
            int y,u,lw;
            lw=epistr(red);
            y=epistr2(lw);
            u=Fibonacci(lw);
            System.out.println(y);
           // red.next();
            System.out.println(u);
        // TODO code application logic here
    }
    
    public static int epistr(Scanner red){
    int r;
    r=0;
        
        while (true){
        try{
        r=red.nextInt();
            break;
        }
        catch (InputMismatchException ime) {
                        System.out.println("balle ena int");
                        red.next();
                        } 
        
    }
        return r;
        
    
    }
    
 public static int epistr2(int t){
     
     if(t>0){
         //System.out.println("asdasda");
                 return epistr2(t-1)*t;
     }
     else{ return 1;}
     }
    
   public static int Fibonacci(int n) {  
        if (n == 0 || n == 1)  return n;
        else
        return Fibonacci(n - 1) + Fibonacci(n - 2); }
}
