package com.demo.controller;

import com.demo.entity.StudentEntity;
import com.demo.model.BaseResponse;
import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public BaseResponse getProduct(@RequestParam Map<String, String> params) {
        BaseResponse res = new BaseResponse();
        String id = params.get("id");
        String name = params.get("name");
        if (id != null) {
            res.data = studentService.getStudentByID(Integer.parseInt(id));
        }else if (name != null){
            res.data = studentService.getStudentByName(name);
        }else {
            res.data = studentService.getAllStudent();
        }
        return res;
    }

    @PostMapping
    public BaseResponse createProduct(@RequestBody StudentEntity product) {
        BaseResponse res = new BaseResponse();
        res.data = studentService.createStudent(product);
        return res;
    }

}
