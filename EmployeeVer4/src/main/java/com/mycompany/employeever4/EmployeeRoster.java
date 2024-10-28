/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeever4;
/**
 *
 * @author User
 */
public class EmployeeRoster {
    private Employee[] empList;
    private int count;
    private int max;

    public EmployeeRoster(Employee[] empList, int count, int max) {
        this.empList = empList;
        this.count = count;
        this.max = max;
    }
    
    public EmployeeRoster(Employee[] empList, int count) {
        this.empList = empList;
        this.count = count;
    }

    public EmployeeRoster(int count, int max) {
        this.count = count;
        this.max = max;
    }

    public EmployeeRoster(int max) {
        this.max = max;
    }
    
    
    
    public EmployeeRoster() {
    }

    public Employee[] getEmpList() {
        return empList;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = empList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = 0;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    
    public boolean addEmployee(Employee emp){
        if(count<max){
            empList[count++] = emp;
        
            return true;  
        }
        
        else return false;
    }
    
    
    public Employee removeEmployee(int ID){
        for(int x=0;x<count;x++){
            if(empList[x].getEmpID()==ID){
                Employee temp = empList[x];
                
                for(int i=x;i<count-1;i++){
                    empList[i] = empList[i+1];
                }
                
                empList[count-1] = null;
                count--;
                
                return temp;
            }
        }
        
        return null;
    }
    
    public void display(){
        for(int x=0;x<count;x++){
            System.out.println(empList[x].toString());
        }
    }
    
}