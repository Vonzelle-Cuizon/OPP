/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeever5;

/**
 *
 * @author User
 */
public class Hourly extends Employee{
    public int hours;
    public int rate;

    public Hourly(int hours, int rate, String fname, String mname, String lname, int empID, int dhDay, int dhMonth, int dhYear) {
        super(fname, mname, lname, empID, dhDay, dhMonth, dhYear);
        this.hours = hours;
        this.rate = rate;
    }
    
    public Hourly(int hours, int rate, String fname, String lname, int empID, int dhDay, int dhMonth, int dhYear) {
        super(fname, lname, empID, dhDay, dhMonth, dhYear);
        this.hours = hours;
        this.rate = rate;
    }

    public Hourly(int hours, int rate, String fname, String mname, String lname) {
        super(fname, mname, lname);
        this.hours = hours;
        this.rate = rate;
    }

    public Hourly(int hours, int rate, int dhDay, int dhMonth, int dhYear) {
        super(dhDay, dhMonth, dhYear);
        this.hours = hours;
        this.rate = rate;
    }

    public Hourly(int hours, int rate, int empID) {
        super(empID);
        this.hours = hours;
        this.rate = rate;
    }

    public Hourly(int hours, int rate) {
        this.hours = hours;
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    
    public double computeSalary(){
        return this.hours>40?this.hours * this.rate+ ((this.hours - 40) * this.hours * .5):this.hours * this.rate;
    }
 
    
   
    void display(){
        System.out.println(super.toString() + this);
        System.out.println("Salary: " + computeSalary());
        System.out.println("");
    }
    
    @Override
    public String toString() {
        return ("\nHours: " + this.hours + "\nRate: " + this.rate);
    }
    
}
