package io.turntabl;

import java.util.List;

public class NaughtyStudent extends Student {

    public NaughtyStudent(List<Double> grades) {
        super(grades);
    }

    public NaughtyStudent(String name,List<Double> grades,Level level) {
        super(name,grades,level);
    }

    @Override
    public double getAverageGrade(){
        double actualGrade=super.getAverageGrade();
        return actualGrade+((0.1)*actualGrade);
    }
}
