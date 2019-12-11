package com.example.demo.configurations;

import com.example.demo.classrooms.Classroom;
import com.example.demo.models.Instructors;
import com.example.demo.models.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students students){
        return new Classroom(instructors, students);
    }

    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(Instructors instructors, @Qualifier("previousStudents") Students previousStudents){
        return new Classroom(instructors, previousStudents);
    }
}