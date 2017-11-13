/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclassproject2;

/**
 *
 * @author lefte
 */
public class clasi {
    
    private String name;
    private String surname;
    private String fathersname;
    private int age;
    private String dob;//date of birth
    public void setname(String name){
        System.out.println(name);
    this.name=name;
    }
    public void setsurname(String name){
    this.surname=name;
    }
    public void setFname(String name){
    this.fathersname=name;
    }
    public void setDob(String name){
    this.dob=name;
    }
    public String getName()
    {
    return name;
    }
    public String getFName()
    {
    return fathersname;
    }
    public String getDob()
    {
    return dob;
    }
    public String getsurName()
    {
    return surname;
    }
    
    
    
    
    
}
