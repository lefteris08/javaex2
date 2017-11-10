/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dokimastikopj;

/**
 *
 * @author lefte
 */
public class Dokimastikopj {
    
    /**
     * @param args the command line argumentsint totalsum=0;
     */
    public static void main(String[] args) {
           int [][][]pinakas=new int [7][3][5]; //First we are creating a new 3d 7,3,5 array
           int []sum_from_3rd=new int[5];//here we will store te summ for the 3rd dimmension
           int []sum_from_row=new int[3];//here we will store the summ for the second dimension
           int []sum_from_line=new int[7];//here we will store the elements for the first dimension
           int totalsum=0;
           
           
           //in the followng loop we will give the array each element the summ 
           //of each array number ec in line 0,0,4 we will give them 4
           
           
           for(int grammes=0; grammes<pinakas.length;grammes++)
        {
           for(int stiles=0; stiles<pinakas[grammes].length;stiles++)
           {    
               for(int triti=0; triti<pinakas[grammes][stiles].length;triti++)
                {
                    pinakas[grammes][stiles][triti]=grammes+stiles+triti;
                   // System.out.print("grammi "+grammes+"  kai stili "+stiles+" kai tin triti diastasi "+triti+"   [ "+pinakas[grammes][stiles][triti]+"]");
                   // System.out.print(" [ "+pinakas[grammes][stiles][triti]+ "  ]");
                    
                    
                    
               
               }
               System.out.println("");
           }
           System.out.println("");
        }

           
           System.out.println("_________________________________");
           System.out.println("_________________________________");
           System.out.println("_________The result in the third dimmension is  _________________________________");
           System.out.println("_________________________________");
           System.out.println("_________________________________");
           
           //here we are showning the array with the dimension we want and 
           // summ its elements to see the value on this level
           
        for(int triti=0; triti<5;triti++)
        {
           for(int grammes=0; grammes<7;grammes++)
           {    
               for(int stiles=0; stiles<3;stiles++)//int grammes=0; grammes<7;grammes++)
                {
                   // pinakas[grammes][stiles][triti]=grammes+stiles+triti;
                   // System.out.print("grammi "+grammes+"  kai stili "+stiles+" kai tin triti diastasi "+triti+"   [ "+pinakas[grammes][stiles][triti]+"]");
                    System.out.print(" [ "+pinakas[grammes][stiles][triti]+ "  ]");
                    //sumtriti
                    sum_from_3rd[triti]=sum_from_3rd[triti]+pinakas[grammes][stiles][triti];
                    
               
               }
               System.out.println("");
           }
           System.out.println("the level "+(triti+1)+" is displayed above");
        }

         System.out.println("the summ in the third dimmension is : ");
         //
         for(int y=0;y<5;y++){
         
         System.out.println("the  "+y+" level has sum  "+sum_from_3rd[y]);
                totalsum= totalsum+sum_from_3rd[y];
                 }
          System.out.println("the total sum in this dimension is " +totalsum);
        System.out.println("_________________________________");
           System.out.println("_________________________________");
           System.out.println("_________Based on second dimension _________________________________");
           System.out.println("_________________________________");
           System.out.println("_________________________________");
           
        
        for(int stiles=0; stiles<3;stiles++)
        {
           for(int grammes=0; grammes<7;grammes++)
           {    
               for(int triti=0; triti<5;triti++)//int grammes=0; grammes<7;grammes++)
                {
                   // pinakas[grammes][stiles][triti]=grammes+stiles+triti;
                   // System.out.print("grammi "+grammes+"  kai stili "+stiles+" kai tin triti diastasi "+triti+"   [ "+pinakas[grammes][stiles][triti]+"]");
                    System.out.print(" [ "+pinakas[grammes][stiles][triti]+ "  ]");
                    //sumtriti
                    sum_from_row[stiles]=sum_from_row[stiles]+pinakas[grammes][stiles][triti];
                    
               
               }
               System.out.println("");
           }
           System.out.println("to epipedo "+(stiles+1)+" einai to parapanw");
        }
         System.out.println("the sum based on the second dimmension ");
         totalsum=0;
         
         for(int y=0;y<3;y++){
         totalsum=totalsum+sum_from_row[y];
         
         System.out.println("the "+y+" level has sum "+sum_from_row[y]);
                 }
        
        System.out.println("the sum on all levels are"+totalsum);
         
         
         
         System.out.println("_________________________________");
           System.out.println("_________________________________");
           System.out.println("_________Based on the first dimmension _________________________________");
           System.out.println("_________________________________");
           System.out.println("_________________________________");
           
        
        for(int grammes=0; grammes<7;grammes++)
        {
           for(int stiles=0; stiles<3;stiles++)
           {    
               for(int triti=0; triti<5;triti++)//int grammes=0; grammes<7;grammes++)
                {
                   // pinakas[grammes][stiles][triti]=grammes+stiles+triti;
                   // System.out.print("grammi "+grammes+"  kai stili "+stiles+" kai tin triti diastasi "+triti+"   [ "+pinakas[grammes][stiles][triti]+"]");
                    System.out.print(" [ "+pinakas[grammes][stiles][triti]+ "  ]");
                    //sumtriti
                    sum_from_line[grammes]=sum_from_line[grammes]+pinakas[grammes][stiles][triti];
                    
               
               }
               System.out.println("");
           }
           System.out.println("the level  "+(grammes+1)+" is the above");
        }
         System.out.println("the sum based on the first dimmension is ");
         totalsum=0;
         for(int y=0;y<7;y++){
         totalsum= totalsum+sum_from_line[y];
         System.out.println("the "+y+" level has sum "+sum_from_line[y]);
                 }
        
         System.out.println("the total sum is "+totalsum+"");
         
            }
    
}
