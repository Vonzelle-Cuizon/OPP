/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeever2;

/**
 *
 * @author User
 */
public class EmployeeVer2 {

    public static void main(String[] args) {
       Hourly emp1 = new Hourly(100,20,"Vonzelle",12345);
        System.out.println(emp1);
        
       Piece emp2 = new Piece(100000,5,"Jhoriemar",9876);
        System.out.println(emp2);
        emp2.displayPiece(100);
        
        Comm emp3 = new Comm(150000,"Cuizon",69);
        System.out.println(emp3);
    }
}
