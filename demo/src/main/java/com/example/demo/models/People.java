package com.example.demo.models;

import java.util.*;
import java.util.function.Consumer;

public abstract class People <PersonType extends Person> implements Iterable<PersonType>{

    private List<PersonType> personList;

    public People(List<PersonType> people) { this.personList = people;
    }

    public void add (PersonType person){
        personList.add(person);
    }

    public void remove (PersonType person){
        personList.remove(person);
    }

    public Integer size (List<PersonType> personList){
        return personList.size();
    }

    public void clear (List<PersonType> personList){
        personList.clear();
    }

    public void addAll(List<PersonType>personList , Iterable<PersonType> toAdd){
        personList.addAll((Collection<? extends PersonType>) toAdd);
    }

    public PersonType findById (Long id){
       for (PersonType p : personList){
           if(p.getId().equals(id)){
               return p;
           }
       }return null;
    }

    public List<PersonType> findAll (){
        return this.personList;
    }

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }

    @Override
    public void forEach(Consumer<? super PersonType> action) {

    }

    @Override
    public Spliterator<PersonType> spliterator() {
        return personList.spliterator();
    }
}
