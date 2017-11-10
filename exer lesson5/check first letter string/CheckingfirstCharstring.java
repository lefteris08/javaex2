/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkingfirstcharstring;

/**
 *
 * @author lefte
 */
public class CheckingfirstCharstring {
//in the following programm we will find some functions to check if the first 
    //char in each string is p if it is we will not print it and print all the others
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String []pinakas={"cat","dog","pig","bear","bird","parrot","rabbit"};
    System.out.println("First method using matches");
    for(int i=0;i<pinakas.length;i++){
    if(pinakas[i].matches("p.*")||pinakas[i].matches("P.*"))//here we will check with P*
    {
    System.out.println("");
    }
    else{
    System.out.println(pinakas[i]);
    }
    
    }
    char o=pinakas[0].charAt(0);
    
    
    System.out.println("------------");
    System.out.println("1st merhod");
    System.out.println("----------------");
    
    for(int i=0;i<pinakas.length;i++){
         o=pinakas[i].charAt(0);
         if(o=='p'||o=='P'){
        
            System.out.println("");
            }
        else
         {
        System.out.println(pinakas[i]);
            }
//System.out.println(o);
    }
    System.out.println("------------");
    System.out.println("2rd merhod");
    System.out.println("----------------");
    
    
    
    //checking using carAt
    for(int i=0;i<pinakas.length;i++)
    {
         o=pinakas[i].charAt(0);
         if(o=='p'||o=='P'){
        
            System.out.println("");
            }
        else
         {
        System.out.println(pinakas[i]);
            }
         
    }
    
    //check using startswith
    System.out.println("------------");
    System.out.println("3rd merhod");
    System.out.println("----------------");
    for(int i=0;i<pinakas.length;i++)
    {
        // o=pinakas[i].charAt(0);
         if(pinakas[i].startsWith("p")||pinakas[i].startsWith("P")){
        
            System.out.println("");
            }
        else
         {
        System.out.println(pinakas[i]);
            }
         
    }
    

    }
    
}
