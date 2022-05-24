package com.example.demo.service;

import com.example.demo.convert.StudentConvert;
import com.example.demo.entity.Student;
import com.example.demo.payload.StudentResponse;
import com.example.demo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    public final StudentRepository studentRepository;
    public final StudentConvert studentConvert;

    public List<StudentResponse> getStudent() {
        List<Student> student = studentRepository.findAll();
        List<StudentResponse> list = new ArrayList<>();
        for (int i = 0; i < student.size(); i++) {
            list.add(studentConvert.toResponse(student.get(i)));
        }
        return list;
    }

}
