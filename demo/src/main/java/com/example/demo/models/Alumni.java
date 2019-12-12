package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    @Autowired
    @Qualifier( "previousStudents")
    private Students previousStudents;

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;

    @PostConstruct
    public void executeBootcamp() {
        //int numberOfInstructors = instructors.size();
        //    int numberOfStudents = students.size();
        //    double numberOfHoursToTeachEachStudent = 1200;
        //    double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        //    double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;
        for(Instructor instructor: instructors){
            instructor.lecture(previousStudents, (1200.0 * previousStudents.size()) / instructors.size());
        }

    }
    public Students getPreviousStudents() {
        return previousStudents;
    }

    public Instructors getInstructors() {
        return instructors;
    }
}
