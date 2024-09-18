/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factory;

/**
 *
 * @author User
 */
public class TestEmployee_Ver1 {

    public static void main(String[] args) {
        
         HourlyEmployee emp1A = new HourlyEmployee();
         emp1A.TotalHoursWorked = 42;
         emp1A.empID = 1;
         emp1A.ratePerHour = 10;
         emp1A.empName = "Emp 1-A";
         emp1A.displayHourly();
         System.out.println("");
         
         HourlyEmployee emp1B = new HourlyEmployee(100, 10.0, "EMP 1-B", 2);
         emp1B.displayHourly();
         System.out.println("");
         
         HourlyEmployee emp1C = new HourlyEmployee("EMP 1-C", 3);
         emp1C.displayHourly();
         System.out.println("");
         
         
         System.out.print("--------------------------------------\n\n\n\n");
         
         
         
         
         
         PieceWorkerEmployee emp2A = new PieceWorkerEmployee();
         emp2A.totalPiecesFinished = 100;
         emp2A.ratePerPiece = 2.0;
         emp2A.empName = "EMP 2-A";
         emp2A.empID = 4;
         emp2A.displayPiece();
         System.out.println("");
         
         PieceWorkerEmployee emp2B = new PieceWorkerEmployee(500, 1.0, "EMP 2-B",5);
         emp2B.displayPiece();
         System.out.println("");
         
         PieceWorkerEmployee emp2C = new PieceWorkerEmployee("EMP 2-C",6);
         emp2C.displayPiece();
         System.out.println("");

         System.out.println("--------------------------------------\\n\n\n\n");
         
         
         
         CommissionEmployee emp3A = new CommissionEmployee();
    
         emp3A.totalSales = 100000;
         emp3A.empName = "EMP 3-A";
         emp3A.empID = 7;
         emp3A.displayComm();
         System.out.println("");
         
         CommissionEmployee emp3B = new CommissionEmployee(9000.0, "EMP 3-B", 8);
         emp3B.displayComm();
         System.out.println("");
         
         CommissionEmployee emp3C = new CommissionEmployee("EMP 3-C", 9);
         emp3C.displayComm();
         System.out.println("");
         
         System.out.println("--------------------------------------\n\n\n\n");
         
         
         
         
         BasedPlusCommissionEmployee emp4A = new BasedPlusCommissionEmployee();
         emp4A.baseSalary = 9000;
         emp4A.totalSales = 10000;
         emp4A.empName = "EMP 4-A";
         emp4A.empID = 10;
         emp4A.displayBased();
        System.out.println("");
        
         BasedPlusCommissionEmployee emp4B = new BasedPlusCommissionEmployee(9000.0,10000, "EMP 4-B", 11);
         emp4B.displayBased();
         System.out.println("");
         
         BasedPlusCommissionEmployee emp4C = new BasedPlusCommissionEmployee("EMP 4-C", 11);
         emp4C.displayBased();
         System.out.println("");
         
         System.out.println("--------------------------------------");
         
         
         
         
    }
     
      
      
      
}
