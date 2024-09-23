/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeever2;

/**
 *
 * @author User
 */
public class Employee {
    public String Name;
    public int empID;
            
    public Employee(String Name, int empID) {
        this.Name = Name;
        this.empID = empID;
    }

    public Employee(String Name) {
        this.Name = Name;
    }

    public Employee(int empID) {
        this.empID = empID;
    }
    
    public Employee() {
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
    
    
}
