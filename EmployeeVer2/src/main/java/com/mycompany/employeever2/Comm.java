/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeever2;

/**
 *
 * @author User
 */
public class Comm extends Employee{
    public double totalSales;

    public Comm(double totalSales, String Name, int empID) {
        super(Name, empID);
        this.totalSales = totalSales;
    }

    public Comm(double totalSales, String Name) {
        super(Name);
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

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    
    public double computeSalary(){
        double rateof = 0;
        
        if(this.totalSales<10000)rateof = 0.05;
        else if(this.totalSales>=10000 && this.totalSales<100000)rateof = 0.1;
        else if(this.totalSales>=100000 && this.totalSales<1000000)rateof = 0.2;
        
        return this.totalSales + this.totalSales * rateof;
    }
    
    @Override
    public String toString() {
        return ("Name " + super.Name + "\nEMP ID " + super.empID + "\nSalary " + computeSalary());
    }
}
