/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeever7;

/**
 *
 * @author User
 */
public class Based extends Comm{
    public double baseSalary;

    public Based(double baseSalary, double totalSales, String fname, String mname, String lname, int empID, int dhDay, int dhMonth, int dhYear) {
        super(totalSales, fname, mname, lname, empID, dhDay, dhMonth, dhYear);
        this.baseSalary = baseSalary;
    }

    public Based(double baseSalary, double totalSales, String fname, String lname, int empID, int dhDay, int dhMonth, int dhYear) {
        super(totalSales, fname, lname);
        this.baseSalary = baseSalary;
    }

    public Based(double baseSalary, double totalSales, int dhDay, int dhMonth, int dhYear) {
        super(totalSales, dhDay, dhMonth, dhYear);
        this.baseSalary = baseSalary;
    }

    public Based(double baseSalary, double totalSales, int empID) {
        super(totalSales, empID);
        this.baseSalary = baseSalary;
    }

    public Based(double baseSalary, double totalSales) {
        super(totalSales);
        this.baseSalary = baseSalary;
    }

    public Based(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    @Override
    public double computeSalary(){
        
        return super.computeSalary() + this.baseSalary;
    }
    
    @Override
    void display(){
        System.out.println(super.toString() + this);
        System.out.println("Salary: " + computeSalary());
        System.out.println("");
    }
    
    @Override
    public String toString() {
        return ("\nBase salary: " +  this.baseSalary);
    }
    
}
