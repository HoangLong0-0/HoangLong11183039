package com.demo.service;

import com.demo.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    StudentEntity createStudent(StudentEntity product);
    List<StudentEntity> getAllStudent();
    StudentEntity getStudentByID(int id);
    StudentEntity getStudentByStudentID(String studentid);
    List<StudentEntity> getStudentByName(String name);
}