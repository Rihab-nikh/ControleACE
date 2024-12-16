package com.example.contorolestudentv.mapper;


import com.example.contorolestudentv.dao.entities.Student;
import com.example.contorolestudentv.dto.StudentDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    private final ModelMapper mapper = new ModelMapper();

    public Student fromStudentDtoToStudent(StudentDto studentDto){
        return mapper.map(studentDto, Student.class);
    }

    public StudentDto fromStudentToStudentDTO(Student student){
        return mapper.map(student, StudentDto.class);
    }

}
