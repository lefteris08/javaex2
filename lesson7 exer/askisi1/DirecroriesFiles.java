/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package direcroriesfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import static java.lang.System.in;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.script.ScriptEngine.FILENAME;

/**
 *
 * @author lefte
 */
public class DirecroriesFiles {
    public static void main(String[] args) {

        Person []ArrayOfPersons=new Person[100]; //edw dilwnoume tin lista pou tha apothikeuei tous person pou dimiourgoume 
        int atoma=0;
        
        Person person1=new Person();
        Person p2=new Person();//ws p2 einai to person 2
        
        DirecroriesFiles asd=new DirecroriesFiles();// i asd einai i all system directories pou tha baloume to arxeio mas diladei i main klasi mas
        
        createdir("C:\\temp");
        createdir("C:\\temp\\temp1");
        asd.diagrafi("C:\\temp\\temp1\\file.txt");//auto to kanoume gia na balei kena soixeia sto arxeio mas
 //parakatw kaloume tin bufferreader gia na diabasoume ta stoixeia
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            
            atoma=asd.dilosi(person1,ArrayOfPersons,atoma);//edw pairmoume tin sinartisi apo tin main kai pairnoume kai bazoume ta input stin person 1 kai bazoume tin person 1 ston array
         } catch (IOException ex) {
            Logger.getLogger(DirecroriesFiles.class.getName()).log(Level.SEVERE, null, ex);
         }
  //parakatw pairnoume ta stoixeia tou p1 kai ta bazoume sto arxeio
        asd.egrafiarxiouformat(person1);  
        String[] pe=new String [100];   //parakatw diabazoume to arxeio se ena string array pe
        asd.diabasma1("C:\\temp\\temp1\\file.txt",pe);   
        
        /*
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        //String onoma="";
        */
        //Person p2=new Person();
        
        //parakatw ektipwnoume tis grames tou arxeiou
        for(int u=1;u<4;u++){
        System.out.println(pe[u]);
      
        if(u==1){
        String []kl=pe[u].split(",");
        //System.out.println("to komeno kommati einai   {"+kl[0]+") 2("+kl[1]+")3("+kl[2]+")");
        String []kl2=kl[0].split(" ");
        //System.out.println("to onoma sou einai @@ "+kl2[4]);
        p2.setall(kl2[4]+"## 2");
        kl2=kl[1].split(" ");
        p2.setall(kl2[3]+"## 1");
        //System.out.println("to eponimo sou einai @@ "+kl2[3]);
        kl2=kl[2].split(" ");
        p2.setall(kl2[3]+"## 3");
        //System.out.println("to eponimo sou einai @@ "+kl2[3]);
        
        
        }
        else if(u==2){
        
          //  String []kl=pe[u].split(",");
        
        
        String []kl=pe[u].split(" ");
        System.out.println("todadsasd komeno kommati einai "+kl[5]);
        p2.setall(kl[5]+"## 7");
        }
        else{
          String []  kl=pe[u].split(":");
            System.out.println("todadsasd komeno kommati einai "+kl[1]);
            p2.setall((2017-Integer.valueOf(kl[1]))+"## 6");
        
        }

      
        
        
        

//System.out.println(kl[1]);
        //System.out.println(kl[2]);
        }
        asd.egrafiarxiouformat(p2);  
        
        // TODO code application logic here
    }
  public int dilosi (Person person1,Person[] ArrayOfPersons,int atoma) throws IOException{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("dwse onoma");
    person1.setall(br.readLine()+"## 1");
  System.out.println("dwse epoimo");
    person1.setall(br.readLine()+"## 2");
  System.out.println("dwse onoma patera");
    person1.setall(br.readLine()+"## 3");
  
    
    
    String boithitiko_elenxou_imerominias="";
    
    while(true){
    System.out.println("dwse  imerominia");   
   
    boithitiko_elenxou_imerominias=""+br.readLine();
    //person1.setall(br.readLine()+"## 7");
    if(boithitiko_elenxou_imerominias.contains("/" ))
                {
                String xwrismeno[]=boithitiko_elenxou_imerominias.split("/");
             //  System.out.println(xwrismeno[0]+"   "+xwrismeno[1]+"   "+xwrismeno[3]+"   "+xwrismeno[2]+" meg"+xwrismeno.length);
                System.out.println("to string einai "+boithitiko_elenxou_imerominias);
                int c;
                    if(xwrismeno.length<3 )
                    {
                        System.out.println("你打错了号码");
                            
                    }
                    else
                    {
                        try{
                        Integer.valueOf(xwrismeno[2]);
                        Integer.valueOf(xwrismeno[1]);
                        Integer.valueOf(xwrismeno[0]);
                        person1.setall(xwrismeno[0]+"## 4");  
                        person1.setall(xwrismeno[1]+"## 5");    
                        person1.setall(xwrismeno[2]+"## 6");    
                        person1.setall(boithitiko_elenxou_imerominias+"## 7");
                        System.out.println(boithitiko_elenxou_imerominias);
                        break;
                        }
                        catch(NumberFormatException iu){
                         System.out.println("kati den paei swsta");
                            }
                        }
            }
    
    }
    
    
   // person1.setall(boithitiko_elenxou_imerominias+"## 7");
   // person1.setall(xwrismeno[2]+"## 6");
    
    
    
    
 // System.out.println("dwse  xronia");
   // person1.setall(br.readLine()+"## 6");
  ArrayOfPersons[atoma]=person1;
  atoma++;
  return atoma;
  }  
  public void ekripwsi(String path1){

Path path = Paths.get(path1);
        try {Files.lines(path).forEach(System.out::println);
           } catch (IOException ex) {
           
        }
        
}
  
  public void diagrafi(String path){
 try {   String boith=path;
                PrintWriter writer = new PrintWriter(boith, "UTF-8");
                
                
            } catch (FileNotFoundException ex) {
                
            } catch (UnsupportedEncodingException ex) {
               
            }
   

}

  public void egrafiarxiouformat(Person person1){
   grapsimo("","C:\\temp\\temp1\\file.txt");
        String periexomeno ="";
        periexomeno="Line "+ 1+" Last Name: " + person1.getall("LastName") + ", First Name: " + person1.getall("FirstName") + ", Father's Name: " + person1.getall("FathersName");
        grapsimo(periexomeno,"C:\\temp\\temp1\\file.txt");
        periexomeno="Line 2 Your birthday is "+person1.getall("BirthDay");
        grapsimo(periexomeno,"C:\\temp\\temp1\\file.txt");
        periexomeno="Line  Your age is:"+String.valueOf(2017-Integer.valueOf(person1.getall("BirthYear")));
        grapsimo(periexomeno,"C:\\temp\\temp1\\file.txt");
       
  
  
  }
  
public void diabasma1(String path1 ,String[] periexomena ){
 File file = new File(path1);
 int i=0;
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
            periexomena[i]=line;
            i++;
            }
        sc.close();
//Path path = Paths.get(path1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DirecroriesFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
}
  
  
  
  
  
  
  /*
  public static void diab1() {
   try {
           //BufferedReader br = new BufferedReader(new FileReader(FILENAME));
            BufferedReader br = new BufferedReader(new FileReader("c:"));
            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {

            e.printStackTrace();
        }
}
  */
  
    public static void createdir(String boith){
    //   String boith="";
        File jj=new File(boith) ;      
        if(jj.isFile()){
        System.out.println("exist");
        }
        else{
            
            jj.mkdirs();
        
        }
        
        
        
    
    
    
    }
   public static  void grapsimo(String stoixia,String path){
    //System.out.println(path);
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
      //          System.out.println("file is ready");
            } catch (FileNotFoundException ex) {
                
            } catch (UnsupportedEncodingException ex) {
               
            }
    }
 
    
}
