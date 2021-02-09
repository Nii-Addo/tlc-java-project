package io.turntabl;

import java.util.ArrayList;
import java.util.List;

public class Student implements Nameable,HasLevel {

    private List<Double> grades;

    private String name;

    private Level level;

    public Student(List<Double> grades){
        this.grades=grades;
    }

    public Student(String name,List<Double> grades,Level level)
    {
        this.name=name;
        this.grades=grades;
        this.level=level;
    }

    public Student(){
        this.grades=new ArrayList<>();
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public double getAverageGrade() {
        double averageGrade = 0.0;

        if(!grades.isEmpty()) {
            double sum=0.0;
            for(Double grade : grades) {
                sum += grade;
            }
            averageGrade = sum / grades.size();
        }

        return averageGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Level getLevel() {
        return this.level;
    }
}
