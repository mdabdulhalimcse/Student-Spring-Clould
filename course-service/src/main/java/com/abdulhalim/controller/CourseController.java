package com.abdulhalim.controller;

import com.abdulhalim.entity.Course;
import com.abdulhalim.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public boolean create(@RequestBody Course course) {
        return courseService.create(course);
    }

    @GetMapping
    public List<Course> getAll() {
        return courseService.getAll();
    }

    @GetMapping("/id")
    public Course getById(@RequestParam(value = "id", defaultValue = "1") Long id) {
        return courseService.getById(id);
    }

    @PutMapping
    public boolean update(@RequestBody Course course) {
        return courseService.update(course);
    }

    @DeleteMapping
    public boolean delete(@RequestParam Long id) {
        return courseService.delete(id);
    }
}
