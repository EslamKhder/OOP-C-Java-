package com.java.model;

import java.util.ArrayList;
import java.util.List;

public class Course extends BaseEntity{

    public List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
