package com.example.contorolestudentv.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDto {
    String name;
    String email;
    String dateDeNaissance;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String email;
        private String dateDeNaissance;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder dateDeNaissance(String dateDeNaissance) {
            this.dateDeNaissance = dateDeNaissance;
            return this;
        }

        public StudentDto build() {
            StudentDto studentDto = new StudentDto();
            studentDto.name = this.name;
            studentDto.email = this.email;
            studentDto.dateDeNaissance = this.dateDeNaissance;
            return studentDto;
        }
    }
}