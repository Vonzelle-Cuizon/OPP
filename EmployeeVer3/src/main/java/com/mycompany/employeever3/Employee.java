/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeever3;

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

    public Employee(String fname, String mname, String lname) {
        empName = new Name(fname,mname,lname);
    }
    
    public Employee(int dhDay, int dhMonth, int dhYear) {
        dateHired = new Date(dhDay,dhMonth,dhYear);
    }

    public Employee(int empID) {
        this.empID = empID;
    }
    
    public Employee() {
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
    
    
}
