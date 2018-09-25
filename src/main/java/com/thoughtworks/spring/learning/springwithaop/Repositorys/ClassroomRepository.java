package com.thoughtworks.spring.learning.springwithaop.Repositorys;

import com.thoughtworks.spring.learning.springwithaop.Domains.Class.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom,Integer> {
}
