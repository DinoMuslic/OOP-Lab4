package org.example.people;

import java.util.ArrayList;
import java.util.List;

public class Student1 {
    private int student_id;
    private String student_name;

    List<Double> grades = new ArrayList<>();

    public Student1(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public void addGrade(double grade) {
        this.grades.add(grade);
    }
}
