/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import java.util.Scanner;

/**
 *
 * @author lefte
 */
public class Function {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Epistrofitim kk=new Epistrofitim(); 
    Scanner reader = new Scanner(System.in);
    int y,y1;
    float jj,jj2,jj3;
    y=kk.epistinr("Bale int", reader);
    y1=kk.epistinr("Bale int", reader);
    jj=episfl(y);
    jj2=episfl(y1);
    //jj2
    jj3=jj/jj2;
    System.out.println(jj3);
    
    }
    
    
    public static float episfl(int g){
    return (float) g; 
    }
}
