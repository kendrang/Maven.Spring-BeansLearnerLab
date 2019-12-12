package com.example.demo.configurations;

import com.example.demo.models.Instructor;
import com.example.demo.models.Instructors;
import com.example.demo.models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;

@Configuration
public class InstructorsConfig {

    @Bean(name = "tcUSAInstructors")
    public Instructors tcUSAInstructors(){
        Instructors instructors = new Instructors (new ArrayList<>());
        instructors.add(new Instructor("Bob", 1L));
        instructors.add(new Instructor("John", 2L));
        instructors.add(new Instructor("TemsEgg", 3L));
        return instructors;
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors(){
        Instructors instructors = new Instructors (new ArrayList<>());
        instructors.add(new Instructor("Paul", 1L));
        instructors.add(new Instructor("Mary", 2L));
        instructors.add(new Instructor("Pru", 3L));
        return instructors;
    }

    @Primary
    @Bean(name = "instructors")
    public Instructors instructors (){
        Instructors instructors = new Instructors (new ArrayList<>());
        instructors.add(new Instructor("Dolio", 1L));
        instructors.add(new Instructor("Roberto", 2L));
        instructors.add(new Instructor("Chris", 3L));
        return instructors;

    }







}

