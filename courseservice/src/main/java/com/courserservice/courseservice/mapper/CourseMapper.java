package com.courserservice.courseservice.mapper;

import com.courserservice.courseservice.dto.CourseDto;
import com.courserservice.courseservice.entity.Course;

public class CourseMapper {
    public  static CourseDto mapToCourseDto(Course course){
        return new CourseDto(
                course.getId(),
                course.getCourseName(),
                course.getCourseType(),
                course.getType(),
                course.getDescription(),
                course.getAttachmentPath()
        );
    }
    public static Course mapToUser(CourseDto courseDto){
        return new Course(
                courseDto.getId(),
                courseDto.getCourseName(),
                courseDto.getCourseType(),
                courseDto.getType(),
                courseDto.getDescription(),
                courseDto.getAttachmentPath()
        );
    }
}
