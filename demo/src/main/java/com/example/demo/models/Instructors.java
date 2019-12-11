package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class Instructors extends People<Instructor>{


    public Instructors(List<Instructor> people) {
        super(people);
    }

}
