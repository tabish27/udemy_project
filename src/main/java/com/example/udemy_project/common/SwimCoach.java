package com.example.udemy_project.common;


public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice free style for half hour every day";
    }

}
