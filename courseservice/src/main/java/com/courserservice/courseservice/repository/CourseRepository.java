package com.courserservice.courseservice.repository;

import com.courserservice.courseservice.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
