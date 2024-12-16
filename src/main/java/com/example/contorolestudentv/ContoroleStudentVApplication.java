package com.example.contorolestudentv;

import com.example.contorolestudentv.dto.StudentDto;
import com.example.contorolestudentv.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ContoroleStudentVApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContoroleStudentVApplication.class, args);
    }

    @Bean
    CommandLineRunner start(StudentService studentService){
        return  args -> {
            studentService.saveStudents(
                    List.of(
                            StudentDto.builder().name("rihab").email("rihab@outlook.fr").dateDeNaissance("1997").build(),
                            StudentDto.builder().name("rihab2").email("rihab2@outlook.fr").dateDeNaissance("1997").build(),
                            StudentDto.builder().name("rihab3").email("rihab3@outlook.fr").dateDeNaissance("1997").build(),
                            StudentDto.builder().name("rihab4").email("rihab4@outlook.fr").dateDeNaissance("1997").build()
                    )

            );
        };
    }
}
