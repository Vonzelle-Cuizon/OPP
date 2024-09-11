/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory;

/**
 *
 * @author User
 */
public class BasedPlusCommissionEmployee {
    public double totalSales;
    public double baseSalary;
    public String empName;
    public int empID;

    public BasedPlusCommissionEmployee(double totalSales, double baseSalary, String empName, int empID) {
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
        this.empName = empName;
        this.empID = empID;
    }

    public BasedPlusCommissionEmployee() {
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
    
    public double computeSalary(){
        double temp = this.totalSales;
        if(temp<10000)temp = temp+(temp*.05);
        else if(temp>=10000 && temp<100000)temp = temp+(temp*.1);
        else if(temp>=100000 && temp<1000000)temp = temp+(temp*.2);
        
        return temp + this.baseSalary;
    }
    
    public void displayHourly(){
        System.out.println("Employee ID: " + this.empID);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Employee Salary: " + computeSalary());
    }

    @Override
    public String toString() {
        return ("Employee ID: " + this.empID + "\nEmployee Name: " + this.empName + "\nEmployee Salary: " + computeSalary()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
