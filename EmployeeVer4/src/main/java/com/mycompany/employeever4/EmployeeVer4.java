/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeever4;

/**
 *
 * @author User
 */
public class EmployeeVer4 {
      
    public static void main(String[] args) {
        
        Employee[] employees = new Employee[10]; 
        EmployeeRoster roster = new EmployeeRoster(employees);
        
        Hourly emp1 = new Hourly(10,10,"Vonzelle","Devila","Cuizon",1,15,6,2005);
        roster.addEmployee(emp1);
        
        Hourly Anna = new Hourly(10,10,"Anna","Lynn","Baro",69,12,12,2005);
        roster.addEmployee(Anna);
        
        Piece emp2 = new Piece(10,10,"Jesus","Mary","joseph",2,15,6,2005);
        roster.addEmployee(emp2);
        
        Comm emp3 = new Comm(10000,"Geogre","George","geroge",3,15,6,2005);
        roster.addEmployee(emp3);
        
        Based emp4 = new Based(1000,10000,"Geogre","George","geroge",4,15,6,2005);
        roster.addEmployee(emp4);
        
//        System.out.println(roster.countHE());
//        System.out.println(roster.countBCPE());
//        System.out.println(roster.countCE());
//        System.out.println(roster.countPWE());
//        
//        roster.removeEmployee(2);
//        System.out.println("--");
//        
//        System.out.println(roster.countHE());
//        System.out.println(roster.countBCPE());
//        System.out.println(roster.countCE());
//        System.out.println(roster.countPWE());
        
        roster.displayHE();
        
        roster.displayPWE();
         
        roster.displayCE();
        
        roster.displayBCPE();
        
        System.out.println(" ");
        
        roster.displayAll();
//        for (int i = 0; i < roster.getCount(); i++) {
//            if (roster.getEmplist()[i] != null) {
//                System.out.println(roster.getEmplist()[i]);
//            }
//        }
        
        
    }
}

