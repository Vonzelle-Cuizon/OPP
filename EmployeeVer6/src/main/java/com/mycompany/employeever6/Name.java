/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeever6;

/**
 *
 * @author User
 */
public class Name {
    String fname;
    String mname;
    String lname;

    public Name(String fname, String mname, String lname) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
    }

    public Name(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    
    
    public Name() {   
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return (mname!=null)?this.fname + " " + this.mname.charAt(0) + " " +this.lname: this.fname + " " +this.lname;
    }

    
    
}