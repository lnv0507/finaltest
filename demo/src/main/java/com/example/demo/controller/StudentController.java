package com.example.demo.controller;

import com.example.demo.common.ErrorResponse;
import com.example.demo.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Slf4j
@AllArgsConstructor
@RequestMapping("/")
public class StudentController {
    public final StudentService studentService;

    @GetMapping("student")
    public String getStudent() {
        System.out.println("going ...");
        return "student";
    }

    @GetMapping("/")
    public ResponseEntity<?> getStudentt() {
        try {
            return ResponseEntity.ok(studentService.getStudent());
        } catch (Error ex) {
            log.error("API /api/v1/boards: ", ex);
            return ResponseEntity.badRequest().body(ErrorResponse.builder().message(ex.getMessage()).build());
        }
    }
}
