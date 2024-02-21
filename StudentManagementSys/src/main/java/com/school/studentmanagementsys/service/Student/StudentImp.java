package com.school.studentmanagementsys.service.Student;

import com.school.studentmanagementsys.dto.StudentDto;
import com.school.studentmanagementsys.model.Student;
import com.school.studentmanagementsys.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentImp implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public void createStudent(StudentDto studentDto) {

    }

    @Override
    public StudentDto findStudentById(long id) {
        Optional<Student> student=studentRepository.findStudentById(id);
        return student.map(student1 -> modelMapper.map(student1,StudentDto.class)).orElseThrow();
    }

    @Override
    public List<StudentDto> getAllStudent() {
        return null;
    }

    @Override
    public StudentDto updateStudent(StudentDto studentDto) {
        return null;
    }

    @Override
    public void deleteStudent(long id) {

    }
}
