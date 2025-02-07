package com.example.demo.models;

import java.util.*;

public abstract class People<PersonType extends Person> implements Iterable<PersonType> {
    private List<PersonType> personList;

    public People(List<PersonType> personList){
        this.personList = personList;
    }

    public void add(PersonType person){
        personList.add(person);
    }

    public void remove(PersonType person){
        personList.remove(person);
    }

    public Integer size(){
        return personList.size();
    }

    public void clear(){
        personList.clear();
    }

    public void addAll(Iterable<PersonType> personList){
        this.personList.addAll((Collection<? extends PersonType>) personList);
    }

    public PersonType findById(long id){
        for (PersonType person : personList) {
            if (person.getId() == id){
                return person;
            }
        }
        return null;
    }

    public void findAll(){
        personList.stream()
                .map(personType -> personList)
                .forEach(System.out::println);
    }

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }
}
