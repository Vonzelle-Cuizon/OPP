/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.time;

/**
 *
 * @author User
 */
public class Time {

    public static void main(String[] args) {
        
        
        Time2 timer = new Time2(11,59,59,"AM");
        System.out.println(timer);
       
        timer.tickSec();
        System.out.println(timer);
        timer.display();
        timer.tickHours();
        System.out.println(timer);
        timer.display();
        
    }
}
