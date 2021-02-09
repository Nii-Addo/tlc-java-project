package io.turntabl;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    Register register;

    @BeforeEach
    void setUp(){
        List<Student> s=new ArrayList<>();
        s.add(new Student("a",new ArrayList<>(Arrays.asList(20.9)),Level.Level1));
        s.add(new Student("b",new ArrayList<>(Arrays.asList(20.9)),Level.Level1));
        s.add(new Student("c",new ArrayList<>(Arrays.asList(22.9)),Level.Level2));
        s.add(new Student("d",new ArrayList<>(Arrays.asList(23.9)),Level.Level3));
        register=new Register(s);
    }

    @Test
    void testGetRegister() {
        Student student= new Student("abena",new ArrayList<>(Arrays.asList(10.21,12.2,17.8)),Level.Level1);
        register.getRegister().add(student);
        assertEquals("abena",register.getRegister().get(4).getName());
    }

    @Test
    void testRegisterConstructor(){
        List<NaughtyStudent> nautyStudents= new ArrayList<>();
        nautyStudents.add(new NaughtyStudent("abena",Arrays.asList(10.0,20.3,29.8),Level.Level1));
        nautyStudents.add(new NaughtyStudent("kwame",Arrays.asList(10.6,20.3,29.8),Level.Level4));
        //find out why type erasure
    }

    @Test
    void testGetRegisterByLevel(){
        assertEquals(2,register.getRegisterByLevel(Level.Level1).get(Level.Level1).size());
    }


    @Test
    void testNameFinderOrThrowException(){
        assertEquals("a",register.findStudentByName("a").getName());
        Exception exception=Assertions.assertThrows(StudentNotFoundException.class, () -> {
            register.findStudentByName("d");
        });
    }
}