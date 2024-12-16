package com.example.contorolestudentv.dao.repositories;

import com.example.contorolestudentv.dao.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    
    List<Student> findByDateDeNaissance(String dateDeNaissance);

    List<Student> findStudentByName(String name);
}
