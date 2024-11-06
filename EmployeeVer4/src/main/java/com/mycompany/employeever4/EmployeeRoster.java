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
    public Employee[] emplist;
    public int count = 0;
    public int max = 10;

    public EmployeeRoster(Employee[] emplist, int max) {
        this.emplist = emplist;
        this.count = max;
    }

    public EmployeeRoster(Employee[] emplist) {
        this.emplist = emplist;
    }

    public EmployeeRoster() {
        
    }

    public Employee[] getEmplist() {
        return emplist;
    }

    public void setEmplist(Employee[] emplist) {
        this.emplist = emplist;
    }

    public int getCount() {
        return count;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    
    
    public boolean addEmployee(Employee emp){
        for(int i=0;i<count;i++){
            if(emplist[i].empID == emp.empID){
                System.out.println("ALready done");
                return false;
            }
        }
        
        if(emp!=null && count<max){
            emplist[count] = emp;
            count++;
            return true;
        }
        
        return false;
    }
    
    public Employee removeEmployee(int id){
        Employee temp = null;
        
        for(int i=0;i<count;i++){
            if(emplist[i].empID==id){
                temp = emplist[i];
                
                for (int j=i;j<count-1;j++){
                    emplist[j] = emplist[j + 1];
                }
                
                emplist[count-1] = null;
                count--;
                
                System.out.println("Employee " + id + " is removed.");
                break;
            }
        }
        
        return temp;
    }
    
    public int countHE(){
        int x = 0;
        for(int i=0;i<count;i++){
            if(emplist[i] instanceof Hourly)x++;
        }
        
        return x;
    }
    
    public int countCE(){
        int x = 0;
        for(int i=0;i<count;i++){
            if(emplist[i] instanceof Comm && !(emplist[i] instanceof Based))x++;
        }
        
        return x;
    }
    
    public int countBCPE(){
        int x = 0;
        for(int i=0;i<count;i++){
            if(emplist[i] instanceof Based)x++;
        }
        
        return x;
    }
    
    public int countPWE(){
        int x = 0;
        for(int i=0;i<count;i++){
            if(emplist[i] instanceof Piece)x++;
        }
        
        return x;
    }
    
    public void displayHE(){
        System.out.println("Hourly Employees: ");
        for(int i=0;i<count;i++){
            if(emplist[i] instanceof Hourly){
                
                emplist[i].display();
            }
        }
        System.out.println("-------------------------");
    }
    
    public void displayCE(){
        System.out.println("Commission Employees: ");
        for(int i=0;i<count;i++){
            if(emplist[i] instanceof Comm && !(emplist[i] instanceof Based)){
                
                emplist[i].display();
            }
        }
        
        System.out.println("-------------------------");
    }
    
    public void displayBCPE(){
        System.out.println("Based Employees: ");
        for(int i=0;i<count;i++){
            if(emplist[i] instanceof Based){
                
                emplist[i].display();
            }
        }
        System.out.println("-------------------------");
    }
    
    public void displayPWE(){
        System.out.println("Piece Employees: ");
        for(int i=0;i<count;i++){
            if(emplist[i] instanceof Piece){
                
                emplist[i].display();
            }
        }
        System.out.println("-------------------------");
    }
    
    public void displayAll(){
        System.out.println("ID    |          Name          |   Date Hired   |    Salary    |  Type     " );
        
        for (int i = 0; i < count; i++) {
            double salary = 0.0;
            if(emplist[i] instanceof Hourly){
                Hourly hEmp = (Hourly)emplist[i];
                salary = hEmp.computeSalary();
            }
            
            if(emplist[i] instanceof Piece){
                Piece pEmp = (Piece)emplist[i];
                salary = pEmp.computeSalary();
            }
            
            if(emplist[i] instanceof Based){
                Based bEmp = (Based)emplist[i];
                salary = bEmp.computeSalary();
            }
            
            if(emplist[i] instanceof Comm && !(emplist[i] instanceof Based)){
                Comm cEmp = (Comm)emplist[i];
                salary = cEmp.computeSalary();
            }
            
            System.out.printf("%-5d | %-22s | %-14s | %-12.2f | %-12s\n", 
                emplist[i].getEmpID(),        
                emplist[i].getEmpName(),      
                emplist[i].getDateHired(),    
                salary, 
                emplist[i].getClass().getSimpleName()
            );
        }
    }
    
}
