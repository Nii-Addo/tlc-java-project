package io.turntabl;

import java.util.List;

public class BagOfStudents<T> {

    List<Student> studentGroup;

    public BagOfStudents(List<Student> studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<Student> getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(List<Student> studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void addStudent(Student student){
        studentGroup.add(student);
    }

    public void removeStudent(Student student){
        studentGroup.remove(student);
    }

    public void clearAllStudents(){
        studentGroup.clear();
    }
}
