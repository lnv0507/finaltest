package com.example.demo.service;

import com.example.demo.converter.StudentConverter;
import com.example.demo.entity.Student;
import com.example.demo.payload.StudentRequest;
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
    public final StudentConverter studentConvert;

    public List<StudentResponse> getStudent() {
        List<Student> student = studentRepository.findAll();
        List<StudentResponse> list = new ArrayList<>();
        for (int i = 0; i < student.size(); i++) {
            list.add(studentConvert.toResponse(student.get(i)));
        }
        return list;
    }

    public StudentResponse getStudentById(String idStudent) {
        Student student = studentRepository.findById(idStudent).orElseThrow(() -> new IllegalArgumentException("not found"));
        return studentConvert.toResponse(student);
    }

    public StudentResponse create(StudentRequest studentRequest) {
        Student student = studentRepository.save(Student.builder()
                .id(studentRequest.getId())
                .address(studentRequest.getAddress())
                .birthday(studentRequest.getBirthday())
                .depName(studentRequest.getDepName())
                .male(studentRequest.isMale())
                .placeOfBirth(studentRequest.getPlaceOfBirth())
                .name(studentRequest.getName())
                .build());
        return studentConvert.toResponse(student);
    }

    public void delete(String id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Task list is not exist"));
        if (student.isActive()) {
            student.setActive(false);
            studentRepository.save(student);
        } else {
            throw new IllegalArgumentException("Task list is not exist");
        }
    }
}
