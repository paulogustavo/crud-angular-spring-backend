package com.paulgustavo.controller;

import com.paulgustavo.model.Course;
import com.paulgustavo.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/courses")
public class CourseController {

    public final CourseService courseService;

    @GetMapping
    public List<Course> list(){
        return courseService.getCourses();
    }

}
