package Section10_001;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String studentName;
    private int studentAge;
    private double score;

    //tao contructor
    public Student(String studentName, int studentAge,double score) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.score = score;
    }

    public Student() {
    }

    //toString
    @Override
    public String toString() {
        return "Ten:"+studentName+" \tTuoi:"+studentAge+"\tDiem:"+score;
    }
}

//inputData



