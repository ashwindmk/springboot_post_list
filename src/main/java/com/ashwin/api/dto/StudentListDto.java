package com.ashwin.api.dto;

import com.ashwin.domain.model.Student;

import java.util.List;

public class StudentListDto {
    private List<Student> studentList;

    public StudentListDto() {
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
