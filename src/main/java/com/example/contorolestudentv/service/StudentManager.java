package com.example.contorolestudentv.service;

import com.example.contorolestudentv.dto.StudentDto;
import com.example.contorolestudentv.mapper.StudentMapper;
import lombok.AllArgsConstructor;
import com.example.contorolestudentv.dao.entities.Student;
import com.example.contorolestudentv.dao.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentManager implements StudentService {
    private final StudentMapper studentMapper = new StudentMapper();
    
    @Autowired
    private StudentRepository studentRepository;

    private List<Student> students = new ArrayList<>();

    @Override
    public StudentDto saveStudent(StudentDto StudentDto) {
        Student Student = studentMapper.fromStudentDtoToStudent(StudentDto);
        Student = studentRepository.save(Student);
        StudentDto = studentMapper.fromStudentToStudentDTO(Student);
        return StudentDto;

    }

    @Override
    public boolean deleteStudent(Long id) {
        try {
            studentRepository.deleteById(id);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }

    @Override
    public List<StudentDto> getStudentByName(String name) {
        List<Student> Students = studentRepository.findStudentByName(name);
        List<StudentDto> studentdto = new ArrayList<>();
        for (Student student : Students) {
            studentdto.add(studentMapper.fromStudentToStudentDTO(student));
        }
        return studentdto;
    }

    @Override
    public List<StudentDto> getStudentByDateDeNaissance(String dateDeNaissance) {
        return List.of();
    }


    @Override
    public void saveStudents(List<StudentDto> studentdto) {
        List<Student> students = new ArrayList<>();
        for (StudentDto studentDto : studentdto) {
            students.add(studentMapper.fromStudentDtoToStudent(studentDto));
        }

        Iterable<Student> savedStudentsIterable = studentRepository.saveAll(students);
        List<Student> savedStudents = new ArrayList<>();
        savedStudentsIterable.forEach(savedStudents::add);

        studentdto = new ArrayList<>(studentdto); // Ensure this is a mutable list
        studentdto.clear();
        for (Student student : savedStudents) {
            studentdto.add(studentMapper.fromStudentToStudentDTO(student));
        }
    }
}
