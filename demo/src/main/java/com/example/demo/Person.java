package com.example.demo;

public class Person {

    private final Long id = 0L;
    private String name;


    public Person(String name, Long id) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }
}
