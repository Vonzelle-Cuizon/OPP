/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeever2;

/**
 *
 * @author User
 */
public class Piece extends Employee{
    public int totalPiecesFinished;
    public double ratePerPiece;

    public Piece(int totalPiecesFinished, double ratePerPiece, String Name, int empID) {
        super(Name, empID);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public Piece(int totalPiecesFinished, double ratePerPiece, String Name) {
        super(Name);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public Piece(int totalPiecesFinished, double ratePerPiece, int empID) {
        super(empID);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public Piece(int totalPiecesFinished, double ratePerPiece) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
    
    public Piece() {
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
    
    public void displayPiece(int totalPiecesFinished){
        System.out.printf("\n\nPiece Finished whahahah: %d\n\n",totalPiecesFinished);
    }
    
    public double computeSalary(){
        return this.ratePerPiece * this.totalPiecesFinished + ((this.ratePerPiece * this.totalPiecesFinished)/100*this.ratePerPiece*10);
    }
    
    void display(){
        System.out.printf("Name: %s\nEMP ID: %d\n Salary: %.2f\n",super.Name,super.empID,computeSalary());
    }
    
    @Override
    public String toString() {
        return ("Name " + super.Name + "\nEMP ID " + super.empID);
    }
    
}
