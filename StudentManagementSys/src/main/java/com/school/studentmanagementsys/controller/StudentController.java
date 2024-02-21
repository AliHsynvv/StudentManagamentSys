package com.school.studentmanagementsys.controller;

import com.school.studentmanagementsys.dto.StudentDto;
import com.school.studentmanagementsys.service.Student.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService service;

    @GetMapping("/findById/{id}")
    public StudentDto findStudent(@PathVariable long id) {
        return service.findStudentById(id);
    }
}
