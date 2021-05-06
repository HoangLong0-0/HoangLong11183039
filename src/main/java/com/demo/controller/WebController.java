package com.demo.controller;

import com.demo.entity.StudentEntity;
import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class WebController {

    @Autowired
    StudentService studentService;

    @GetMapping({"/","/login"})
    public String login(Model model) {
//        String message = "Hello Spring Boot + jsp";
//        model.addAttribute("message", message);
//        List<StudentEntity> students = studentService.getAllStudent();
//        model.addAttribute("students", students);

        return "login";
    }

    @PostMapping("/login")
    public String login(Model model, @RequestParam Map<String, String> params) {
        String username = params.get("username");
        String password = params.get("password");
        if(username.isEmpty() || password.isEmpty()){
            String cause = "Username/password is empty";
            model.addAttribute("cause", cause);
            return "error";
        }
        else{
            StudentEntity p = studentService.getStudentByStudentID(username);
            if(p.getPassword() == password){
                return "index";
            }
            else {
                String cause = "Password is incorrect";
                model.addAttribute("cause", cause);
                return "error";
            }

        }
    }

    @PostMapping("/create")
    public String create(Model model, @RequestParam Map<String, String> params) {

        String studentid = params.get("studentid");
        String name = params.get("name");
        String gender = params.get("gender");
        String email = params.get("email");
        String phone = params.get("phone");
        String birth = params.get("birth");
        String nativeland = params.get("nativeland");
        String password = params.get("password");
        if(studentid.isEmpty()||name.isEmpty()||gender.isEmpty()||email.isEmpty()||phone.isEmpty()||birth.isEmpty()||nativeland.isEmpty()||password.isEmpty()){
            String result = "Some field are empty!";
            model.addAttribute("result", result);
            return "result";
        }
        else {
            StudentEntity p = new StudentEntity(name,studentid,gender,email,phone,password,birth,nativeland);
            studentService.createStudent(p);
            String result = "Success";
            model.addAttribute("result", result);
            return "result";
        }

    }
    @GetMapping("index")
    public String index(Model model) {
        List<StudentEntity> students = studentService.getAllStudent();
        model.addAttribute("students", students);

        return "index";
    }

    @GetMapping("/student")
    public String student(Model model, @RequestParam Map<String, String> params) {
        String id = params.get("id");
        StudentEntity p = studentService.getStudentByID(Integer.parseInt(id));
        model.addAttribute("student_detail", p);
        return "student";
    }

}
