package com.example.demo.tests;

import com.example.demo.models.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentConfigTests {

@Autowired
@Qualifier("currentStudents")
Students students;

@Autowired
@Qualifier("previousStudents")
Students prevStudents;


@Test
public void testCurrent(){
    String expected = "Kai";
    String actual = students.findById(1L).getName();

    Assert.assertEquals(expected, actual);
}

    @Test
    public void testPrev() {
        String expected = "Jennifer";
        String actual = prevStudents.findById(5L).getName();

        Assert.assertEquals(expected, actual);

    }

}
