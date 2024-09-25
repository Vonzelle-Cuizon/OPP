/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeever2;

/**
 *
 * @author User
 */
public class Hourly extends Employee{
    public float TotalHoursWorked;
    public double ratePerHour;

    public Hourly(float TotalHoursWorked, double ratePerHour, String Name, int empID) {
        super(Name, empID);
        this.TotalHoursWorked = TotalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public Hourly(float TotalHoursWorked, double ratePerHour, String Name) {
        super(Name);
        this.TotalHoursWorked = TotalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    public Hourly(float TotalHoursWorked, double ratePerHour, int empID) {
        super(empID);
        this.TotalHoursWorked = TotalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public Hourly(float TotalHoursWorked, double ratePerHour) {
        this.TotalHoursWorked = TotalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    public Hourly() {
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
        return this.TotalHoursWorked>40?this.TotalHoursWorked * this.ratePerHour+ ((this.TotalHoursWorked - 40) * this.ratePerHour * .5):this.TotalHoursWorked * this.ratePerHour;
    }
    
   
    void display(){
        System.out.printf("Name: %s\nEMP ID: %d\n Salary: %.2f\n",super.Name,super.empID,computeSalary());
    }
    
    @Override
    public String toString() {
        return ("Name " + super.Name + "\nEMP ID " + super.empID);
    }

    
    
    
}
