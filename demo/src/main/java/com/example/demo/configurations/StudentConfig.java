package com.example.demo.configurations;


import com.example.demo.Student;
import com.example.demo.models.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean(name = "currentStudents")
    public Students currentStudents(){
        List<Student> cohort = new ArrayList<>();
        cohort.add(new Student("Kai", 1L));
        cohort.add(new Student("Val", 2L));
        cohort.add(new Student("Ryan", 3L));
        return new Students(cohort);
    }

    @Bean(name = "previousStudents")
    public Students previousStudents(){
        Students cohort = new Students (new ArrayList<>());
        cohort.add(new Student("Alicia", 4L));
        cohort.add(new Student("Jennifer", 5L));
        cohort.add(new Student("Linda", 6L));
        return cohort;
    }




}
