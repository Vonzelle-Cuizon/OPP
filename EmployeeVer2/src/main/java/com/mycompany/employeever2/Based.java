/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeever2;

/**
 *
 * @author User
 */
public class Based extends Comm{
    public double baseSalary;

    public Based(double totalSales, double baseSalary, String Name, int empID) {
        super(totalSales,Name, empID);
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }

    public Based(double totalSales, double baseSalary, String Name) {
        super(totalSales,Name);
        this.baseSalary = baseSalary;
    }

    public Based(double totalSales, double baseSalary, int empID) {
        super(totalSales,empID);
        this.baseSalary = baseSalary;
    }

    public Based(double totalSales, double baseSalary) {
        super(totalSales);
        this.baseSalary = baseSalary;
    }
    
    public Based() {
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    public double computeSalary(){
        double rateof = 0;
        
        if(this.totalSales<10000)rateof = 0.05;
        else if(this.totalSales>=10000 && this.totalSales<100000)rateof = 0.1;
        else if(this.totalSales>=100000 && this.totalSales<1000000)rateof = 0.2;
        
        return this.baseSalary + this.totalSales * rateof;
    }
    
    public void display(){
        System.out.println(this);
        System.out.printf("Salary: %.2f\n",computeSalary());
    }
    
    @Override
    public String toString() {
        return ("Name " + super.Name + "\nEMP ID " + super.empID);
    }
}
