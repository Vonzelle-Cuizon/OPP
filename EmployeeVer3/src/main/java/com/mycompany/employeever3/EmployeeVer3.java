/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeever3;

/**
 *
 * @author User
 */
public class EmployeeVer3 {
      
    public static void main(String[] args) {
        
        System.out.println("HOURLY -------------------------");
        
        Hourly H1 = new Hourly(10,20,"Vonzelle","Devila","Cuizon",1,15,6,2005);
        H1.display();
        Hourly H2 = new Hourly(10,20,"Vonzelle","Cuizon",2,15,6,2005);
        H2.display();
        Hourly H3 = new Hourly(10,20,"Vonzelle","Devila","Cuizon");
        H3.display();
        Hourly H4 = new Hourly(10,20,15,6,2005);
        H4.display();
        Hourly H5 = new Hourly(10,20,5);
        H5.display();
        Hourly H6 = new Hourly(10,20);
        H6.display();
        
        
        System.out.println("\nPIECE -------------------------");
        
        Piece P1 = new Piece(10,20,"Vonzelle","Devila","Cuizon",21,15,6,2005);
        P1.display();
        Piece P2 = new Piece(10,20,"Vonzelle","Cuizon",21,15,6,2005);
        P2.display();
        Piece P3 = new Piece(10,20,"Vonzelle","Devila","Cuizon");
        P2.display();
        Piece P4 = new Piece(10,20,15,6,2005);
        P3.display();
        Piece P5 = new Piece(10,20,21);
        P4.display();
        Piece P6 = new Piece(10,20);
        P5.display();
        
       
        
        System.out.println("\nCOMMISION -------------------------");
           
        Comm C1 = new Comm(10000,"Vonzelle","Devila","Cuizon",31,15,6,2005);
        C1.display();
        Comm C2 = new Comm(10000,"Vonzelle","Cuizon",32,15,6,2005);
        C2.display();
        Comm C3 = new Comm(10000,"Vonzelle","Devila","Cuizon");
        C3.display();
        Comm C4 = new Comm(10000,"Vonzelle","Cuizon");
        C1.display();
        Comm C5 = new Comm(10000,15,6,2005);
        C5.display();
        Comm C6 = new Comm(10000);
        C5.display();
        
        
        System.out.println("\nBASED -------------------------");
        
        Based B1 = new Based(10000,10000,"Vonzelle","Devila","Cuizon",41,15,6,2005);
        B1.display();
        Based B2 = new Based(10000,10000,"Vonzelle","Cuizon",123,15,6,2005);
        B2.display();
        Based B3 = new Based(10000,10000,15,6,2005);
        B3.display();
        Based B4 = new Based(10000,10000,44);
        B4.display();
        Based B5 = new Based(10000,10000);
        B5.display();
         Based B6 = new Based(10000);
        B6.display();
        
    }
}

