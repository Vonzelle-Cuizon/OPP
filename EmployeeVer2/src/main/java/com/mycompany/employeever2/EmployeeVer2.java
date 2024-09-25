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
        Hourly emp1A = new Hourly(100,20,"AAA",1);
        System.out.println(emp1A);
        
        Hourly emp1B = new Hourly(100,20,"BBB");
        emp1B.empID = 2;
        System.out.println(emp1B);
        
        Hourly emp1C = new Hourly(100,20,3);
        emp1C.Name = "CCC";
        System.out.println(emp1C);
        
        Hourly emp1D = new Hourly(100,20);
        emp1D.Name = "DDD";
        emp1D.empID = 4;
        System.out.println(emp1D);
        
        Hourly emp1E = new Hourly();
        emp1E.Name = "EEE";
        emp1E.empID = 5;
        emp1E.TotalHoursWorked = 100;
        emp1E.ratePerHour = 20;
        System.out.println(emp1E);
        
        System.out.println("__________________________");
        
        Piece emp2A = new Piece(100,20,"FFF",6);
        System.out.println(emp2A);
        
        Piece emp2B = new Piece(100,20,"GGG");
        emp2B.empID = 7;
        System.out.println(emp2B);
        
        Piece emp2C = new Piece(100,20,8);
        emp2C.Name = "HHH";
        System.out.println(emp2C);
        
        Piece emp2D = new Piece(100,20);
        emp2D.Name = "III";
        emp2D.empID = 9;
        System.out.println(emp2D);
        
        Piece emp2E = new Piece();
        emp2E.Name = "JJJ";
        emp2E.empID = 10;
        emp2E.totalPiecesFinished = 100;
        emp2E.ratePerPiece = 20;
        System.out.println(emp2E);
        
        System.out.println("__________________________");
        
        
        
        Comm emp3A = new Comm(10000,"KKK",11);
        System.out.println(emp3A);
        
        Comm emp3B = new Comm(10000,"LLL");
        emp3B.empID = 12;
        System.out.println(emp3B);
        
        Comm emp3C = new Comm(10000,13);
        emp3C.Name = "MMM";
        System.out.println(emp3C);
        
        Comm emp3D = new Comm(10000);
        emp3D.Name = "NNN";
        emp3D.empID = 14;
        System.out.println(emp3D);
        
        Comm emp3E = new Comm();
        emp3E.Name = "OOO";
        emp3E.empID = 15;
        emp3E.totalSales = 100000;
        System.out.println(emp3E);
        
        System.out.println("__________________________");
        
        Based emp4A = new Based(10000, 10000, "PPP",16);
        System.out.println(emp4A);
        
        Based emp4B = new Based(10000,10000,"QQQ");
        emp4B.empID = 17;
        System.out.println(emp4B);
        
        Based emp4C = new Based(10000,10000,18);
        emp4C.Name = "RRR";
        System.out.println(emp4C);
        
        Based emp4D = new Based(10000,10000);
        emp4D.Name = "SSS";
        emp4D.empID = 19;
        System.out.println(emp4D);
        
        Based emp4E = new Based();
        emp4E.Name = "TTT";
        emp4E.empID = 20;
        emp4E.totalSales = 100000;
        emp4E.baseSalary = 10000;
        System.out.println(emp4E);
        
        System.out.printf("\n\n------------------------------\n\n");
        
        emp1A.display();
        emp1B.display();
        emp1C.display();
        emp1D.display();
        emp1E.display();
        System.out.println("__________________________");   
        emp2A.display();
        emp2B.display();
        emp2C.display();
        emp2D.display();
        emp2E.display();
        System.out.println("__________________________"); 
        emp3A.display();
        emp3B.display();
        emp3C.display();
        emp3D.display();
        emp3E.display();
        System.out.println("__________________________"); 
        emp4A.display();
        emp4B.display();
        emp4C.display();
        emp4D.display();
        emp4E.display();
        System.out.println("__________________________"); 
    }
}
