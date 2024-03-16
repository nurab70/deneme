package com.courserservice.courseservice.service.impl;

import com.courserservice.courseservice.dto.CourseDto;
import com.courserservice.courseservice.entity.Course;
import com.courserservice.courseservice.exception.ResourceNotFoundException;
import com.courserservice.courseservice.mapper.CourseMapper;
import com.courserservice.courseservice.repository.CourseRepository;
import com.courserservice.courseservice.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    private CourseRepository courseRepository;
    @Override
    public CourseDto createCourse(CourseDto courseDto) {
        Course course= CourseMapper.mapToUser(courseDto);
        Course savedCourse = courseRepository.save(course);

        return CourseMapper.mapToCourseDto(savedCourse);
    }

    @Override
    public CourseDto getCourseById(Long courseId) {
        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new ResourceNotFoundException("User is not exist with given id:" + courseId));

        return CourseMapper.mapToCourseDto(course);
    }

    @Override
    public List<CourseDto> getAllCourses() {
        List<Course> courses = courseRepository.findAll();

        return courses.stream().map((course) -> CourseMapper.mapToCourseDto(course))
                .collect(Collectors.toList());
    }

    @Override
    public CourseDto updateCourse(Long courseId, CourseDto updatedCourse) {
        Course course = courseRepository.findById(courseId).orElseThrow(
                () -> new ResourceNotFoundException("Course is not exists by the given id:" + courseId));
        course.setCourseName(updatedCourse.getCourseName());
        course.setCourseType(updatedCourse.getCourseType());
        course.setDescription(updatedCourse.getDescription());
        course.setType(updatedCourse.getType());
        course.setAttachmentPath(updatedCourse.getAttachmentPath());

        Course updatedCourseObj = courseRepository.save(course);

        return CourseMapper.mapToCourseDto(updatedCourseObj);

    }

    @Override
    public void deleteCourse(Long courseId) {
        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new ResourceNotFoundException("User is not exist with given id:" + courseId));
        courseRepository.deleteById(courseId);

    }
}
