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
        
         HourlyEmployee emp1 = new HourlyEmployee();
         emp1.TotalHoursWorked = 42;
         emp1.empID = 1;
         emp1.ratePerHour = 10;
         emp1.empName = "John";
         emp1.displayHourly();
         System.out.println("\n");
         System.out.println(emp1);
         System.out.println("--------------------------------------");
         
         
         PieceWorkerEmployee emp2 = new PieceWorkerEmployee(500, 1.0, "Jose",2);
         emp2.displayHourly();
         System.out.println("\n");
         System.out.println(emp2);
         System.out.println("--------------------------------------");
         
         CommissionEmployee emp3 = new CommissionEmployee(9000.0, "Jose", 3);
         emp3.displayHourly();
         System.out.println("\n");
         System.out.println(emp3);
         System.out.println("--------------------------------------");
         
         BasedPlusCommissionEmployee emp4 = new BasedPlusCommissionEmployee(9000.0,10000, "Jose", 4);
         emp4.displayHourly();
         System.out.println("\n");
         System.out.println(emp4);
         System.out.println("--------------------------------------");
         
         
         
    }
     
      
      
      
}
