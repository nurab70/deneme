package com.courserservice.courseservice.controller;

import com.courserservice.courseservice.dto.CourseDto;
import com.courserservice.courseservice.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    private CourseService courseService;
    @PostMapping
    public ResponseEntity<CourseDto> createCourse(@RequestBody CourseDto courseDto){
        CourseDto savedCourse = courseService.createCourse(courseDto);
        return new ResponseEntity<>(savedCourse, HttpStatus.CREATED);
}
    @GetMapping("{id}")
    public ResponseEntity<CourseDto> getCourseById(@PathVariable("id") Long courseId){
        CourseDto courseDto = courseService.getCourseById(courseId);
        return  ResponseEntity.ok(courseDto);
    }
    @GetMapping
    public ResponseEntity<List<CourseDto>> getAllCourses(){
        List<CourseDto> courses = courseService.getAllCourses();
        return ResponseEntity.ok(courses);
    }
    @PutMapping({"id"})
    public ResponseEntity<CourseDto> updateCourse(@PathVariable("id") Long courseId,
                                              @RequestBody CourseDto updatedCourse){
        CourseDto courseDto = courseService.updateCourse(courseId, updatedCourse);
        return ResponseEntity.ok(courseDto);
    }
    @DeleteMapping({"id"})
    public ResponseEntity<String > deleteCourse(@PathVariable("id") Long courseId){
        courseService.deleteCourse(courseId);
        return ResponseEntity.ok("Course deleted successfully!.");
    }
}
