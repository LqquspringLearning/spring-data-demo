package com.thoughtworks.spring.learning.springwithaop.Domains.Class;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Table(name = "t_student")
@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private int height;
    @Column(name = "classroom_id")
    private int classroomId;
}
