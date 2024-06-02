package com.ms.student_services.Controller;

import com.ms.student_services.Entity.Student;
import com.ms.student_services.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return studentService.addSchool(student);
    }

    @GetMapping("/fetchStudent")
    public List<Student> fetchStudent(){
        return  studentService.fetchSchools();
    }
}
