package com.example.demo;

import com.example.demo.interfaces.Learner;
import com.example.demo.models.Person;

public class Student extends Person implements Learner {

    Double totalStudyTime;

    public Student(String name, Long id) {
        super(name, id);
    }

    @Override
    public void learn(Double numberOfHours) {

        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

}
