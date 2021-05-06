package com.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "studentid")
    private String studentid;

    @Column(name = "gender")
    private  String gender;

    @Column(name = "email")
    private  String email;

    public StudentEntity(String name, String studentid, String gender, String email, String phone, String password, String birth, String nativeland) {
        this.name = name;
        this.studentid = studentid;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.birth = birth;
        this.nativeland = nativeland;
    }

    @Column(name = "phone")
    private  String phone;

    @Column(name = "password")
    private  String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public StudentEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getNativeland() {
        return nativeland;
    }

    public void setNativeland(String nativeland) {
        this.nativeland = nativeland;
    }

    @Column(name = "birth")
    private  String birth;

    @Column(name = "nativeland")
    private  String nativeland;


}
