/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeever7;

/**
 *
 * @author User
 */
public class Piece extends Employee{
    public int piece;
    public int rate;

    public Piece(int piece, int rate, String fname, String mname, String lname, int empID, int dhDay, int dhMonth, int dhYear) {
        super(fname, mname, lname, empID, dhDay, dhMonth, dhYear);
        this.piece = piece;
        this.rate = rate;
    }
    
     public Piece(int piece, int rate, String fname, String lname, int empID, int dhDay, int dhMonth, int dhYear) {
        super(fname, lname, empID, dhDay, dhMonth, dhYear);
        this.piece = piece;
        this.rate = rate;
    }

    public Piece(int piece, int rate, String fname, String mname, String lname) {
        super(fname, mname, lname);
        this.piece = piece;
        this.rate = rate;
    }

    public Piece(int piece, int rate, int dhDay, int dhMonth, int dhYear) {
        super(dhDay, dhMonth, dhYear);
        this.piece = piece;
        this.rate = rate;
    }

    public Piece(int piece, int rate, int empID) {
        super(empID);
        this.piece = piece;
        this.rate = rate;
    }

    public Piece(int piece, int rate) {
        this.piece = piece;
        this.rate = rate;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    
    @Override
    public double computeSalary(){
        return this.rate * this.piece + ((this.piece * this.piece)/100*this.rate*10);
    }
    
    @Override
     void display(){
        System.out.println(super.toString() + this);
        System.out.println("Salary: " + computeSalary());
        System.out.println("");
    }
    
    @Override
    public String toString() {
        return ("\nPiece: " + this.piece + "\nRate: " + this.rate);
    }
    
    
    
}
