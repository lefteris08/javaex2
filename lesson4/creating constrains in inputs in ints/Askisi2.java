/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lefte
 */
public class Askisi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        int arithmos1,arithmos2,arithmos3;
        String f,f1,f2;
        f="bale ton proto arithmo";
        f1="bale ton deutero arithmo";
        f2="bale ton trito arithmo";
        
        arithmos1=epistinr( f, reader );
        arithmos2=epistinr( f1, reader );
        while(arithmos2<3*arithmos1){
             System.out.println("o arithmos  pou edwses den einai 3plasios apo to 1 ");
             arithmos2=epistinr( f1, reader );
        }
        arithmos3=epistinr( f2, reader );
        while(arithmos2+arithmos1>arithmos3){
             System.out.println("o arithmos  pou edwses den einai megaliteros apo ton 1 kai 2 ");
             arithmos3=epistinr( f2, reader );
        } 
        
        System.out.println("oi 3 arithmoi einai \n"+arithmos1+"\n"+arithmos2+"\n"+arithmos3);
    }
    
    
    
    public static  int epistinr( String f, Scanner reader ){
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
        }
        if(reader.hasNext()){
        reader.next();
        }
   
   
                    
}
return(timi);

}

    
}
