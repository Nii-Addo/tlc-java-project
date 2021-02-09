package io.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Lecture {

    private List<Student> students=new ArrayList<Student>();

    public void enter(Student student){
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public double getHighestAverageGrade(List<Student> students) {
        double highestAverageGrade=0.0;
        for(Student student:students){
            if(student.getAverageGrade()>highestAverageGrade){
                highestAverageGrade= student.getAverageGrade();
            }
        }
        return highestAverageGrade;
    }
}
