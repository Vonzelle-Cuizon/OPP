/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory;

/**
 *
 * @author User
 */
public class HourlyEmployee {
    public float TotalHoursWorked;
    public double ratePerHour;
    public String empName;
    public int empID;

    public HourlyEmployee(float TotalHoursWorked, double ratePerHour, String empName, int empID) {
        this.TotalHoursWorked = TotalHoursWorked;
        this.ratePerHour = ratePerHour;
        this.empName = empName;
        this.empID = empID;
    }

    public HourlyEmployee(){
        
    }
    
    public float getTotalHoursWorked() {
        return TotalHoursWorked;
    }

    public void setTotalHoursWorked(float TotalHoursWorked) {
        this.TotalHoursWorked = TotalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
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
        double temp = this.TotalHoursWorked * this.ratePerHour;
        
        if(this.TotalHoursWorked>40){
            temp = temp + ((this.TotalHoursWorked - 40) * this.ratePerHour * .5);
        }
        
        return temp;
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
