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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                age == student.age &&
                height == student.height &&
                classroomId == student.classroomId &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, height, classroomId);
    }
}
