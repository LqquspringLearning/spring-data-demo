package com.thoughtworks.spring.learning.springwithaop.Domains.Class;

import com.thoughtworks.spring.learning.springwithaop.Repositorys.ClassroomRepository;
import com.thoughtworks.spring.learning.springwithaop.Repositorys.StudentRepository;
import lombok.var;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)
//@ActiveProfiles("test")
public class ClassRoomTest {

    @Autowired
    ClassroomRepository classroomRepository;

    @Autowired
    StudentRepository studentRepository;

    @Test
    @Transactional
    void should_insert_class_to_db() {
        Classroom classroom = new Classroom();
        classroom.setName("grade one");
        Classroom result = classroomRepository.save(classroom);
        assertThat(result.getName()).isEqualTo("grade one");
    }

    @Test
    @Transactional
    void should_insert_Student_to_list() {
        Student student = new Student();
        student.setAge(18);
        student.setHeight(180);
        student.setName("zhangsan");
        student.setClassroomId(1);
        var result = studentRepository.save(student);
        assertThat(result.getName()).isEqualTo("zhangsan");
    }

    @Test
    //@Transactional
    void should_get_class_with_three_student() {
        Classroom classroom = new Classroom();
        classroom.setName("grade one");
        Classroom resultClassroom = classroomRepository.saveAndFlush(classroom);

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Student student = new Student();
            student.setAge(18 + i);
            student.setHeight(180 + i);
            student.setName("zhangsan" + i);
            student.setClassroomId(resultClassroom.getId());
            studentList.add(student);
        }
        List<Student> resultStudent = studentRepository.saveAll(studentList);
        Classroom dbClassroom = classroomRepository.getOne(resultClassroom.getId()); //classroomRepository.getOne(resultClassroom.getId());
        assertThat(dbClassroom.getStudentList().size()).isEqualTo(3);
        assertIterableEquals(resultStudent, dbClassroom.getStudentList());
    }
}
