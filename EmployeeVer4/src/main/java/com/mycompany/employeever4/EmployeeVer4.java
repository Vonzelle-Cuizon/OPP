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
        EmployeeRoster list = new EmployeeRoster();
        
        Employee emp1 = new Employee("First","Middle","Last",1,6,15,2005);
        
        list.addEmployee(emp1);
        
        list.display();
    }
}

