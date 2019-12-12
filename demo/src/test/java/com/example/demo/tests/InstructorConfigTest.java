package com.example.demo.tests;

import com.example.demo.models.Instructors;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorConfigTest {

    @Autowired
    @Qualifier("tcUSAInstructors")
    Instructors USAinstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    Instructors UKInstructors;

    @Autowired
    @Qualifier("instructors")
    Instructors zipInstructors;

    @Test
    public void testUS(){
        String expected = "TemsEgg";
        String actual = USAinstructors.findById(3L).getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testUK() {
        String expected = "Mary";
        String actual = UKInstructors.findById(2L).getName();

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testZIP() {
        String expected = "Roberto";
        String actual = zipInstructors.findById(2L).getName();

        Assert.assertEquals(expected, actual);

    }
}
