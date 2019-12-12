package com.example.demo.tests;

import com.example.demo.classrooms.Classroom;
import com.example.demo.models.Instructors;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassroomConfigTest {

    @Autowired
    @Qualifier("currentClassroom")
    Classroom currentclass;

    @Autowired
    @Qualifier("previousClassroom")
    Classroom prevclass;

    @Test
    public void currentclassTest() {

    }

    @Test
    public void prevclassTest() {

    }


}
