package com.courserservice.courseservice.service;

import com.courserservice.courseservice.dto.CourseDto;

import java.util.List;

public interface CourseService {
    CourseDto createCourse(CourseDto courseDto);

    CourseDto getCourseById(Long courseId);

    List<CourseDto> getAllCourses();
    CourseDto updateCourse(Long courseId, CourseDto updatedCourse);

    void deleteCourse(Long courseId);


}
