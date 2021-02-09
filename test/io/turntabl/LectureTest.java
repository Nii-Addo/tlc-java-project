package io.turntabl;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {
    Lecture lecture=new Lecture();

    public List<Student> students;

    @Test
    public void addStudent(){
        Student newStudent=new Student(Arrays.asList(10.0,20.3,29.8));
        lecture.enter(newStudent);
        assertEquals(1,lecture.getStudents().size());
    }

    @Test
    void getHighestAverageGrade() {
        students=new ArrayList<Student>();
        students.add(new Student(Arrays.asList(10.4,23.5,34.6)));
        students.add(new Student(Arrays.asList(10.6,23.5,34.6)));
        students.add(new Student(Arrays.asList(10.2,23.5,34.6)));
        assertEquals(22.9,lecture.getHighestAverageGrade(students),0.1);
    }
}