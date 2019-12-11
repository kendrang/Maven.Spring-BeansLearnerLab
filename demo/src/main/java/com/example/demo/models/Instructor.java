package com.example.demo.models;

import com.example.demo.interfaces.Learner;
import com.example.demo.interfaces.Teacher;
import org.springframework.beans.factory.annotation.Autowired;

public class Instructor extends Person implements Teacher {


    public Instructor(String name, Long id) {
        super(name, id);
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours) {
        Integer numOfLearners = 0;
        for(Learner l : learners){
           numOfLearners++;
        }
        for(Learner l : learners){
            teach(l, numberOfHours/numOfLearners);
        }

    }
}
