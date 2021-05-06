package com.demo.repository;

import com.demo.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {
    List<StudentEntity> findAllByName(String name);
    StudentEntity findByStudentid(String studentid);

    @Query("select p from StudentEntity p where p.name like %:name%")
    List<StudentEntity> findNameCustom(String name);
}
