/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.time;

/**
 *
 * @author User
 */
public class Time2 {
     public int Seconds;
     public int Minutes;
     public int Hours;
     public int Meridian;
     
    public Time2(int Hours, int Minutes, int Seconds, String Meridian) {
        this.Hours = Hours;
        this.Minutes = Minutes;
        this.Seconds = Seconds;
        if(Meridian == "AM")this.Meridian = 1;
        if(Meridian == "PM")this.Meridian = -1;
    }

    public int getMeridian() {
        return Meridian;
    }

    public void setMeridian(int Meridian) {
        this.Meridian = Meridian;
    }

    public int getSeconds() {
        return Seconds;
    }

    public void setSeconds(int Seconds) {
        this.Seconds = Seconds;
    }

    public int getMinutes() {
        return Minutes;
    }

    public void setMinutes(int Minutes) {
        this.Minutes = Minutes;
    }

    public int getHours() {
        return Hours;
    }

    public void setHours(int Hours) {
        this.Hours = Hours;
    }
     
    void timetravel(){
        if(this.Seconds >= 60){
            this.Minutes += this.Seconds/60;
            this.Seconds = this.Seconds%60;
        }
        if(this.Minutes >= 60){
            this.Hours += this.Minutes/60;
            this.Minutes = this.Minutes%60;
        }
        if(this.Hours >= 12){
            this.Meridian = this.Meridian * -1;
            if(this.Hours>12)this.Hours = (this.Hours%12);
        }
    } 
    
    void addSeconds(int addSec){
        this.Seconds += addSec;
        timetravel();
    }
    
    void addMinutes(int addMin){
        this.Minutes += addMin;
        timetravel();
    }
    
    void addHours(int addHours){
        this.Hours += addHours;
        timetravel();
    }
    
    void tickSec(){
        this.Seconds++;
        timetravel();
    }
    
    void tickMin(){
        this.Minutes++;
        timetravel();
    }
    
    void tickHours(){
        this.Hours++;
        timetravel();
    }

    String displayMer(int Meridian){
        return Meridian>0?"AM":"PM";
    }
    
    
    void display(){
        System.out.printf("%02d:%02d:%02d:%s\n",this.Hours,this.Minutes,this.Seconds,displayMer(this.Meridian));
    }
    
    
    @Override
    public String toString() {
        return ((this.Hours>9?"":"0")+this.Hours  +":"+ (this.Minutes>9?"":"0")+this.Minutes +":"+ (this.Seconds>9?"":"0")+ this.Seconds + (this.Meridian>0?" AM":" PM"));
    }
    
    
    
}
