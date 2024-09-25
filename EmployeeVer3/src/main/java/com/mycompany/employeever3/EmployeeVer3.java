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
        
        Employee EMP = new Employee("Von","Jhom","Cui",100,1,1,1);
        System.out.println(EMP.empName.fname);
        System.out.printf("%c.\n",EMP.empName.mname.charAt(0));
        System.out.println(EMP.empName.lname);
        System.out.println(EMP.empID);
        
    }
}

