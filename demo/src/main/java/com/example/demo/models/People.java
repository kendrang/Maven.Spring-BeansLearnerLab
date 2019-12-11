package com.example.demo.models;

import java.util.*;
import java.util.function.Consumer;

public abstract class People <PersonType extends Person> implements Iterable<PersonType>{

    List<PersonType> personList = new ArrayList<>();

    public People(List<PersonType> people) { this.personList = people;
    }


    public void People (List<PersonType> personList){
        this.personList = personList;
    }

    public void add (PersonType person){
        personList.add(person);
    }

    public void remove (PersonType person){
        personList.remove(person);
    }

    public void size (List<PersonType> personList){
        personList.size();
    }

    public void clear (List<PersonType> personList){
        personList.clear();
    }

    public void addAll(List<PersonType>personList , Iterable<PersonType> toAdd){
        personList.addAll((Collection<? extends PersonType>) toAdd);
    }

    public PersonType findById (Long id){
        Integer index = personList.indexOf(id);
        return personList.get(index);
    }

    public List<PersonType> findAll (){
        return this.personList;
    }

    @Override
    public Iterator<PersonType> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super PersonType> action) {

    }

    @Override
    public Spliterator<PersonType> spliterator() {
        return null;
    }
}
