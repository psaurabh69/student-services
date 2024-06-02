package com.ms.student_services.services;

import com.ms.student_services.Entity.Student;
import com.ms.student_services.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student addSchool(Student student){
        return studentRepository.save(student);
    }
    public List<Student> fetchSchools(){
        return studentRepository.findAll();
    }
    public Student fetchSchoolById(int id){
        return studentRepository.findById(id).orElse(null);
    }
}
