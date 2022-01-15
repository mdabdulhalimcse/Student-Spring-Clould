package com.abdulhalim.controller;

import com.abdulhalim.entity.Student;
import com.abdulhalim.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/id")
    public Student getById(@RequestParam(value = "id", defaultValue = "1") Long id) {
        return studentService.getById(id);
    }

    @GetMapping("/idwebclient")
    public Student getByIdUsingWebClient(@RequestParam(value = "id", defaultValue = "1") Long id) {
        return studentService.getById(id);
    }

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public Student getByName(@RequestParam(value = "name", defaultValue = "nakesh") String name) {
        return studentService.findByName(name);
    }

    @PostMapping("/save")
    public boolean saveStudent(@RequestBody(required = true) Student student) {
        return studentService.saveStudent(student);
    }

}
