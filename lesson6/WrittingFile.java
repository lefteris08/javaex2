/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writtingfile;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author lefte
 */
public class WrittingFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){ //throws FileNotFoundException, UnsupportedEncodingException {
        // TODO code application logic here
       // PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
       // writer.println("The first line");
       // writer.println("The second line");
       // writer.close();
        StringBuilder buffer1=new StringBuilder();
        StringBuilder buffer11=new StringBuilder();
        StringBuilder buffer2=new StringBuilder(10);
        StringBuilder buffer3=new StringBuilder("   hello");
        String buffer4;
        buffer1.append("hello");
        buffer4=buffer3.toString().trim();
        System.out.println(buffer3);
        buffer2.append("10");
        if (buffer1.indexOf("e")!= -1){
        buffer1.insert(buffer1.indexOf("e"),4023);
        }       
        buffer3.replace(0,buffer3.length(), buffer4);
//rr= buffer1.toString();
        System.out.println("oi buf1 einai "+buffer1+" buf2  "+buffer2+" kais 3 "  +buffer3);
        System.out.println(""+buffer1.toString().equals(buffer3.toString()));
        System.out.println(""+buffer1.toString().contains("h"));
        System.out.println(buffer4);
        System.out.println(buffer3);
        int jks;
        System.out.println(buffer1);
        jks=returnlast(buffer1,"l");
        jks=returnlast2(buffer1,"l");
     
         }
    public static int returnlast(StringBuilder buffer1,String l){
      int l1=buffer1.indexOf(l);
        int l2=buffer1.indexOf(l);
        do
        {   //l2=l1;
        //System.out.println(l2);
        l2=l1;        
       // System.out.println(l2);
        
        l1=buffer1.indexOf(l,l2+1);
         //   System.out.println(l1);
          if(l1==-1){
          l1=l2;}
        
        }
        while (!(l1==l2));
        System.out.println(l2);
        return 12;
 }
public static int returnlast2(StringBuilder buffer1,String l){
    int size=0;
    int totalsize=0;
    int epistr;
    size=buffer1.length();
    StringBuilder ok=new StringBuilder();
    ok= buffer1.reverse();
    totalsize=buffer1.indexOf(l)+1;
    epistr=size-totalsize;
        System.out.println(epistr);
        return epistr;
 }


}
