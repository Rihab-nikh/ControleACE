package com.example.contorolestudentv.web;

import com.example.contorolestudentv.dto.StudentDto;
import com.example.contorolestudentv.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentGraphQLController {

    private StudentService studentService ;

    @MutationMapping
    public StudentDto savestudent(@Argument StudentDto student){
        return studentService.saveStudent(student);
    }

    @MutationMapping
    public Boolean deletestudent(@Argument Long id){
        return studentService.deleteStudent(id);
    }


    @QueryMapping
    public List<StudentDto> getstudentByName(@Argument String model){
        return studentService.getStudentByName(model);
    }

    @QueryMapping
    public List<StudentDto> getstudentByDateDeNaissance(@Argument String dateDeNaissance){
        return studentService.getStudentByDateDeNaissance(dateDeNaissance);
    }
}