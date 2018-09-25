package com.thoughtworks.spring.learning.springwithaop.Domains.Class;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Table(name = "t_classroom")
@Entity
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "classroom_id")
    private List<Student> studentList;

}
