package io.turntabl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Student> s=new ArrayList<>();
        s.add(new Student("a",new ArrayList<>(Arrays.asList(20.9)),Level.Level1));
        s.add(new Student("b",new ArrayList<>(Arrays.asList(20.9)),Level.Level1));
        s.add(new Student("b",new ArrayList<>(Arrays.asList(20.9)),Level.Level2));
        s.add(new Student("b",new ArrayList<>(Arrays.asList(20.9)),Level.Level3));
        Register r=new Register(s);
        r.getRegisterByLevel(Level.Level1);
        System.out.println(r.getRegisterByLevel(Level.Level1));
        System.out.println(r.printReport());
//        r.sort(s);
//        Student st=r.findStudentByName("c");
//        System.out.println(st.getName());

    }
}
