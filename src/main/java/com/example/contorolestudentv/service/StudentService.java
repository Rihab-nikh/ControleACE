package com.example.contorolestudentv.service;

import com.example.contorolestudentv.dto.StudentDto;

import java.util.List;

public interface StudentService {
    public StudentDto saveStudent(StudentDto StudentDto);

    public boolean deleteStudent(Long id);

    public List<StudentDto> getStudentByName(String name);

    public List<StudentDto> getStudentByDateDeNaissance(String dateDeNaissance);

    public void saveStudents(List<StudentDto> StudentDto);

}
