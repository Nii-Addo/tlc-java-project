package io.turntabl;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {
    NaughtyStudent naughtyStudent;
    Lecture lecture=new Lecture();

    @Test
    public void checkIfStudent(){
        assertTrue(naughtyStudent instanceof Student);
    }

    @Test
    void testGetAverageGrade() {
        naughtyStudent =new NaughtyStudent(Arrays.asList(10.0,20.3,29.8));
        assertEquals(22.036666,naughtyStudent.getAverageGrade(),0.1);
    }

    @Test
    void naughtyStudentScoringMore(){
        lecture.enter(new NaughtyStudent(Arrays.asList(10.2,2.5,13.2)));
        lecture.enter(new NaughtyStudent(Arrays.asList(10.2,12.5,13.2)));
        lecture.enter(new NaughtyStudent(Arrays.asList(10.2,2.5,16.2)));
        assertEquals(9.4966666,lecture.getStudents().get(0).getAverageGrade(),0.1);
    }

}