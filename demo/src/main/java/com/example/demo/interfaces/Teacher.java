package com.example.demo.interfaces;

public interface Teacher {

    void teach(Learner learner, Double numberOfHours);

    void lecture (Iterable<? extends Learner> learners, Double numberOfHours);
}
