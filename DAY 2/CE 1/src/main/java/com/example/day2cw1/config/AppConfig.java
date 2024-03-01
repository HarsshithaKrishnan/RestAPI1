package com.example.day2cw1.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Configuration

public class AppConfig {

    @Value("${app.name}")
    public String studentName;;
    
    @Value("${app.version}")
    public String studentDepartment;

    public AppConfig(String studentName, String studentDepartment) {
        this.studentName = studentName;
        this.studentDepartment = studentDepartment;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentDepartment() {
        return studentDepartment;
    }
    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }
    
}
