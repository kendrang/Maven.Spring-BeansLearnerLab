package com.example.demo.classrooms;

import com.example.demo.interfaces.Teacher;
import com.example.demo.models.Instructors;
import com.example.demo.models.Students;

public class Classroom {
    Instructors instructors;
    Students students;

    public Classroom (Instructors instructors , Students students){
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture (Teacher teacher, Double numberOfHours){
        teacher.lecture(students, numberOfHours);
    }
}
