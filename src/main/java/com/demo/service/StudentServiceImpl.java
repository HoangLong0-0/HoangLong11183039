package com.demo.service;

import com.demo.entity.StudentEntity;
import com.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Override
    public StudentEntity createStudent(StudentEntity product) {
        StudentEntity studentEntity = studentRepo.save(product);
        return studentEntity;
    }

    @Override
    public List<StudentEntity> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public StudentEntity getStudentByID(int id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public StudentEntity getStudentByStudentID(String studentid) {
        return null;
    }

    @Override
    public List<StudentEntity> getStudentByName(String name) {
        return studentRepo.findNameCustom(name);
    }

}
