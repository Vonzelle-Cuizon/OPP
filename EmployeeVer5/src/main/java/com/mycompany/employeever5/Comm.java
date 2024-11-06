/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeever5;

/**
 *
 * @author User
 */
public class Comm extends Employee{
    public double totalSales;

    public Comm(double totalSales, String fname, String mname, String lname, int empID, int dhDay, int dhMonth, int dhYear) {
        super(fname, mname, lname, empID, dhDay, dhMonth, dhYear);
        this.totalSales = totalSales;
    }
    
    public Comm(double totalSales, String fname, String lname, int empID, int dhDay, int dhMonth, int dhYear) {
        super(fname, lname, empID, dhDay, dhMonth, dhYear);
        this.totalSales = totalSales;
    }

    public Comm(double totalSales, String fname, String mname, String lname) {
        super(fname, mname, lname);
        this.totalSales = totalSales;
    }
    
    public Comm(double totalSales, String fname, String lname) {
        super(fname, lname);
        this.totalSales = totalSales;
    }

    public Comm(double totalSales, int dhDay, int dhMonth, int dhYear) {
        super(dhDay, dhMonth, dhYear);
        this.totalSales = totalSales;
    }

    public Comm(double totalSales, int empID) {
        super(empID);
        this.totalSales = totalSales;
    }    
    
    public Comm(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public Comm() {
    }
    
    
    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public double computeSalary(){
        double rateof = 0;
        
        if(this.totalSales<10000)rateof = 0.05;
        else if(this.totalSales>=10000 && this.totalSales<100000)rateof = 0.1;
        else if(this.totalSales>=100000 && this.totalSales<1000000)rateof = 0.2;
        
        return this.totalSales + this.totalSales * rateof;
    }
    
    void display(){
        System.out.println(this);
        System.out.println("Salary: " + computeSalary());
        System.out.println("");
    }
    
    @Override
    public String toString() {
        return (super.toString() + "\nTotal Sales: " + this.totalSales);
    }
    
    
}
