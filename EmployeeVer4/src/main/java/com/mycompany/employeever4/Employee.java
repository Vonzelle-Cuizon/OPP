/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeever4;

/**
 *
 * @author User
 */
public class Employee {
    public Name empName;
    public int empID;
    public Date dateHired;
    
    public Employee(String fname, String mname, String lname, int empID, int dhDay, int dhMonth, int dhYear) {
        empName = new Name(fname,mname,lname);
        dateHired = new Date(dhDay,dhMonth,dhYear);
        this.empID = empID;
    }
    
    public Employee(String fname, String lname, int empID, int dhDay, int dhMonth, int dhYear) {
        empName = new Name(fname,lname);
        dateHired = new Date(dhDay,dhMonth,dhYear);
        this.empID = empID;
    }

    public Employee(String fname, String mname, String lname) {
        empName = new Name(fname,mname,lname);
    }
    
    public Employee(String fname, String lname) {
        empName = new Name(fname,lname);
    }
    
    public Employee(int dhDay, int dhMonth, int dhYear) {
        dateHired = new Date(dhDay,dhMonth,dhYear);
    }

    public Employee(int empID) {
        this.empID = empID;
    }
    
    public Employee() {
    }

    
    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }
    
    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    void display(){
        System.out.println(this);
    }  
    
    @Override
    public String toString() {
        return "\nEmployee Name: " + empName + "\nEmployee ID: " + empID + "\nDate hired: " + dateHired;
    }
    
    
    
    
    
}
