package com.thoughtworks.spring.learning.springwithaop.Repositorys;

import com.thoughtworks.spring.learning.springwithaop.Domains.Class.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
