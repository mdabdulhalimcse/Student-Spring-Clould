package com.abdulhalim.service;

import com.abdulhalim.entity.Course;
import com.abdulhalim.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public boolean create(Course course) {
        // INSERT INTO course (name, duration) values ('BTech', 4);
        courseRepository.save(course);
        return true;
    }


    public Course getById(Long courseId) {
  Course course = courseRepository.findById(courseId).orElse(null);
  return course;
    }

    public List<Course> getAll() {
        // SELECT * FROM course;
        List<Course> courseList = courseRepository.findAll();
        return courseList;
    }


    public boolean update(Course course) {
        // UPDATE course SET name='MTech', duration=5 WHERE id = 1;
        courseRepository.save(course);
        return true;
    }


    public boolean delete(Long courseId) {
        // DELETE FROM course where id = 1;
        courseRepository.deleteById(courseId);
        return true;
    }
}
