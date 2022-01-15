package com.abdulhalim.service;

import com.abdulhalim.entity.Student;
import com.abdulhalim.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public boolean saveStudent(Student student){
        studentRepository.save(student);
        return true;
    }
    public Student getById(Long id){
        Student student = studentRepository.findById(id).orElse(null);
        return student;
    }

    public Student findByName(String name){
        Student student = studentRepository.findByName(name);
        return student;
    }
}
