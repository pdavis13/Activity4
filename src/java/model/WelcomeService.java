/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author Peter
 */
public class WelcomeService {
    private Calendar currentDate = Calendar.getInstance();
    
    public String getGreetingTime(){
        if(currentDate.get(Calendar.HOUR_OF_DAY) < 12){
            return "morning";
        } else if(currentDate.get(Calendar.HOUR_OF_DAY) < 18){
            return "afternoon";
        } else{
            return "evening";
        }
    }
    
    public String getGreetingMessage(String name){
        return "Good " + getGreetingTime() + ", " + name + ". Welcome!";
    }
}
