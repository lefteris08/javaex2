/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;
import java.awt.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.*;
/**
 *
 * @author lefte
 */
public class Epistrofitim { 
    public int po;
   
                public float epistfloat( String f, Scanner reader ){
                    float timi =0;
                    while(true)
                    {
                        
                        
    //int arr1= new int;
    //int arr2[]= new int;
    //int arr3[]= new int[];
    //int arr4[10]= new int[];
    //int arr5[10]= new int[];
    //int arr6[]= new int[10];//sosto
    //int []arr7= new int[10];//sosto

                        try {  // System.out.print(f);
                        timi = reader.nextFloat();
                        // Scans the next token of the input as an int.
                        //if(timi!=3 || timi!=1 || timi!=2){
                        break;
                        //}

                        } 
                        catch (InputMismatchException ime) {
                        System.out.println("balle ena float");
                        }
                        if(reader.hasNext()){
                        reader.next();
                        }



                }
                return(timi);

                }
                
                public  int epistinr( String f, Scanner reader ){
                    int timi =0;
                    while(true)
                    {

                        try {   
                        System.out.println(f);
                        timi = reader.nextInt();
                        //reader.next();
                        // Scans the next token of the input as an int.
                        break;




                        } 
                        catch (InputMismatchException ime) {
                        System.out.println("ebales lathos");
                        if(reader.hasNext()){
                        reader.next();
                        }
                        }




                }
                return(timi);

                }
                public String epistring( String f, Scanner reader ){
                     //System.out.println(f);

                    String timi ="0";
                    while(true)
                    {

                        try {   
                        System.out.println(f);

                        timi = reader.nextLine();
                        // Scans the next token of the input as an int.
                        break;




                        } 
                        catch (InputMismatchException ime) {
                        System.out.println("bale string");
                        }
                        if(reader.hasNext()){
                        reader.next();
                        }



                }
                return(timi);

                }
}

