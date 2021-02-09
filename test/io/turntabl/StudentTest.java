package io.turntabl;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student student;

    @Test
    void getAverageGrade() {
        List<Double> gradeList=new ArrayList<>();
        gradeList.add(40.5);
        gradeList.add(60.6);
        gradeList.add(100.0);
        student=new Student(gradeList);
        assertEquals(67.03,(double)student.getAverageGrade(),0.1);
    }

}