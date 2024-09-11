/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.factory;

/**
 *
 * @author User
 */
public class PieceWorkerEmployee {
    public int totalPiecesFinished;
    public double ratePerPiece;
    public String empName;
    public int empID;

    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece, String empName, int empID) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
        this.empName = empName;
        this.empID = empID;
    }
    
    public PieceWorkerEmployee() {
 
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
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
        double temp = this.ratePerPiece * this.totalPiecesFinished;
        double temp2 = temp;
        int x=0;
        while(temp2>=100){
            temp2 -= 100;
            x++;
        }
        temp = temp + (x*this.ratePerPiece*10);
        
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
