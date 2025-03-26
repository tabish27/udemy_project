package com.example.udemy_project.rest;


import com.example.udemy_project.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coach;

    @Autowired
    public DemoController(@Qualifier("aquatic") Coach coach){
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.coach = coach;
    }


    @GetMapping("/get_workout")
    public String getWorkout(){
        return coach.getDailyWorkout();
    }

}
