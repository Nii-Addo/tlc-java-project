package io.turntabl;

import java.util.*;
import java.util.stream.Collectors;

public class Register {

    private List<Student> studentNames;

    public Register(List<Student> studentNames) {
        this.studentNames =studentNames;
    }

    public Register(){
        this.studentNames =new ArrayList<>();
    }

    public List<Student> getRegister() {
        return studentNames;
    }

    public void setRegister(List<Student> itemList) {
        this.studentNames = itemList;
    }

    public Map<Level,List<Student>> getRegisterByLevel(Level studentLevel){
        Map<Level,List<Student>> result= new HashMap<>();
        List<Student> allLevelStudents=studentNames.stream().filter(s->s.getLevel()==studentLevel).collect(Collectors.toList());
          result.put(studentLevel,allLevelStudents);
          return result ;
    }

    public String printReport(){
        List<String> allLevel100Students=new ArrayList<>();
        List<String> allLevel200Students=new ArrayList<>();
        List<String> allLevel300Students=new ArrayList<>();
        List<String> allLevel400Students=new ArrayList<>();
        studentNames.stream().forEach(student -> {
                switch(student.getLevel()) {
                    case Level1:
                        allLevel100Students.add(student.getName());
                        break;
                    case Level2:
                        allLevel200Students.add(student.getName());
                        break;
                    case Level3:
                        allLevel300Students.add(student.getName());
                        break;
                    case Level4:
                        allLevel400Students.add(student.getName());
                        break;
                }
        });
        return "List of first year students: " + allLevel100Students.toString() + "\n" +
                "List of second year students: " + allLevel200Students.toString() + "\n" +
                "List of third year students: " + allLevel300Students.toString() + "\n" +
                "List of fourth year students: " + allLevel400Students.toString() + "\n" ;
    }

    public List<Student> sort(Comparator <Student> comparator){
        Collections.sort(studentNames, new StudentComparator());
        return studentNames;
    }

    public Student findStudentByName(String studentName){
        return studentNames.stream().filter(s -> s.getName().equals(studentName)).findAny().orElseThrow(()->new StudentNotFoundException("Student not found"));
    }

}

class StudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student fisrtStudent, Student secondStudent) {
        return fisrtStudent.getName().compareTo(secondStudent.getName());
    }
}