/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplejavaapplication2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lefte
 */
//public class Filehandler 
        
public class Filehandler {
public void diagrgrapsimo(String stoixia,String path){
 try {   String boith=path;
                //boith=System.getProperty("user.dir")+"\\"+kl.getall("lastName")+"."+kl.getall("firstName")+".txt";
                PrintWriter writer = new PrintWriter(boith, "UTF-8");
                
                writer.println(stoixia);
                
                writer.close();
                
                System.out.println("file is ready");
            } catch (FileNotFoundException ex) {
                
            } catch (UnsupportedEncodingException ex) {
               
            }
   

}
public  void grapsimo(String stoixia,String path){
    System.out.println(path);
    try {   String boith=path;
                //boith=System.getProperty("user.dir")+"\\"+kl.getall("lastName")+"."+kl.getall("firstName")+".txt";
                if(new File(boith).isFile()){
                 PrintWriter writer= new PrintWriter(new FileOutputStream(new File(boith), true));
                
                writer.println(stoixia );
                
                writer.close();
                }
                else{
                PrintWriter writer = new PrintWriter(boith, "UTF-8");
                
                writer.println(stoixia);
                
                writer.close();
                }
                System.out.println("file is ready");
            } catch (FileNotFoundException ex) {
                
            } catch (UnsupportedEncodingException ex) {
               
            }
    }
    
public void ekripwsi(String path1){

Path path = Paths.get(path1);
        try {//edw ektipwnoume ton kodika 
            Files.lines(path).forEach(System.out::println);
           } catch (IOException ex) {
            Logger.getLogger(SimpleJavaapplication2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
}


    
