package com.example.udemy_project.config;

import com.example.udemy_project.common.Coach;
import com.example.udemy_project.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SportsConfig {

    @Bean("aquatic") //("aquatic") is custom bean id...by default it's the methods name
    public Coach newSwimmingCoach(){
        return new SwimCoach();
    }

}
