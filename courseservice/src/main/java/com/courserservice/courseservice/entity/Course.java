package com.courserservice.courseservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "courseName")
    private String courseName;
    @Column(name = "courseType")
    private String courseType;
    @Column(name = "description")
    private String description;
    @Column(name = "type")
    private String type;
    @Column(name = "attachment")
    private String attachmentPath;
}
