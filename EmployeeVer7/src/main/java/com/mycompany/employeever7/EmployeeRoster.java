/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeever7;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class EmployeeRoster {
    public ArrayList<Employee> emplist;

    public EmployeeRoster(ArrayList<Employee> emplist) {
        this.emplist = emplist;
    }

    public ArrayList<Employee> getEmplist() {
        return emplist;
    }

    public void setEmplist(ArrayList<Employee> emplist) {
        this.emplist = emplist;
    }

    
   
    
    public boolean addEmployee(Employee emp){
       for(int i=0;i<emplist.size();i++){
            if(emplist.get(i).empID == emp.empID){
                System.out.println(emp.empID + " - " + emp.empName +"  Already added to lsit");
                return false;
            }
       }
        
      emplist.add(emp);
      return true;
    }
    
    public Employee removeEmployee(int id){
        Employee temp = null;
        for(int i=0;i<emplist.size();i++){
            if(emplist.get(i).equals(id)){
                temp = emplist.get(i);
                emplist.remove(i);
                break;
            }
        }
        
        return temp;
    }
    
    public int countHE(){
        int x = 0;
        for(int i=0;i<emplist.size();i++){
            if(emplist.get(i) instanceof Hourly)x++;
        }
        
        return x;
    }
    
    public int countCE(){
        int x = 0;
        for(int i=0;i<emplist.size();i++){
            if(emplist.get(i) instanceof Comm && !(emplist.get(i) instanceof Based))x++;
        }
        
        return x;
    }
    
    public int countBCPE(){
        int x = 0;
        for(int i=0;i<emplist.size();i++){
            if(emplist.get(i) instanceof Based)x++;
        }
        
        return x;
    }
    
    public int countPWE(){
        int x = 0;
        for(int i=0;i<emplist.size();i++){
            if(emplist.get(i) instanceof Piece)x++;
        }
        
        return x;
    }
    
    public void displayHE(){
        System.out.println("Hourly Employees: ");
        for(int i=0;i<emplist.size();i++){
            if(emplist.get(i) instanceof Hourly){
                
                emplist.get(i).display();
            }
        }
        System.out.println("-------------------------");
    }
    
    public void displayCE(){
        System.out.println("Commission Employees: ");
        for(int i=0;i<emplist.size();i++){
            if(emplist.get(i) instanceof Comm && !(emplist.get(i) instanceof Based)){
                
                emplist.get(i).display();
            }
        }
        
        System.out.println("-------------------------");
    }
    
    public void displayBCPE(){
        System.out.println("Based Employees: ");
        for(int i=0;i<emplist.size();i++){
            if(emplist.get(i) instanceof Based){
                
                emplist.get(i).display();
            }
        }
        System.out.println("-------------------------");
    }
    
    public void displayPWE(){
        System.out.println("Piece Employees: ");
        for(int i=0;i<emplist.size();i++){
            if(emplist.get(i) instanceof Piece){
                
                emplist.get(i).display();
            }
        }
        System.out.println("-------------------------");
    }
    
    public void displayAll(){
        System.out.println("ID    |          Name          |   Date Hired   |    Salary    |  Type     " );
        
        for (int i=0; i<emplist.size(); i++) {
            double salary = 0.0;
            if(emplist.get(i) instanceof Hourly){
                Hourly hEmp = (Hourly)emplist.get(i);
                salary = hEmp.computeSalary();
            }
            
            if(emplist.get(i) instanceof Piece){
                Piece pEmp = (Piece)emplist.get(i);
                salary = pEmp.computeSalary();
            }
            
            if(emplist.get(i) instanceof Based){
                Based bEmp = (Based)emplist.get(i);
                salary = bEmp.computeSalary();
            }
            
            if(emplist.get(i) instanceof Comm && !(emplist.get(i) instanceof Based)){
                Comm cEmp = (Comm)emplist.get(i);
                salary = cEmp.computeSalary();
            }
            
            System.out.printf("%-5d | %-22s | %-14s | %-12.2f | %-12s\n", 
                emplist.get(i).getEmpID(),        
                emplist.get(i).getEmpName(),      
                emplist.get(i).getDateHired(),    
                salary, 
                emplist.get(i).getClass().getSimpleName()
            );
        }
    }
    
}
