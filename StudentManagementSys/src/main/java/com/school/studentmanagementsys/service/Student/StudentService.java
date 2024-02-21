package com.school.studentmanagementsys.service.Student;

import com.school.studentmanagementsys.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.List;
public interface StudentService {
    //CRUD - Create,Read,Update,Delete

    void createStudent(StudentDto studentDto);
    StudentDto findStudentById(long id);

    List<StudentDto> getAllStudent();

    StudentDto updateStudent(StudentDto studentDto);

    void deleteStudent(long id);
}
