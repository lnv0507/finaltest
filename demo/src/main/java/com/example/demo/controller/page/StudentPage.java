package com.example.demo.controller.page;

import com.example.demo.entity.Student;
import com.example.demo.payload.StudentResponse;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/")
public class StudentPage {
    private final StudentService studentService;
    @GetMapping("student")
    public String getStudent(Model model) {
        List<StudentResponse> students = studentService.getStudent();
        model.addAttribute("students", students);
        return "student";
    }

    @GetMapping("detail/{idStudent}")
    public String detailPage(@PathVariable String idStudent, Model model) {
        System.out.println("going ...");
        StudentResponse student = studentService.getStudentById(idStudent);
        model.addAttribute("student", student);
        return "studentDetail";
    }

    @GetMapping("update")
    public String updatePage() {
        System.out.println("going ...");
        return "studentUpdate";
    }
}
