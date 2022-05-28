package com.example.demo.controller;

import com.example.demo.common.ResponseCommon;
import com.example.demo.payload.StudentRequest;
import com.example.demo.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api/v1")
public class StudentController {
    public final StudentService studentService;

    @GetMapping("/student")
    public ResponseEntity<?> getStudent() {
        try {
            return ResponseEntity.ok(ResponseCommon.success(studentService.getStudent()));
        } catch (Error ex) {
            log.error("API /api/v1/student =  getStudent", ex);
            return ResponseEntity.ok(ResponseCommon.fail(ex.getMessage()));
        }
    }

    @PostMapping
    public ResponseEntity<?> createStudent(@RequestBody StudentRequest studentRequest) {
        try {
            return ResponseEntity.ok(ResponseCommon.success(studentService.create(studentRequest)));
        } catch (Error ex) {
            log.error("API /api/v1 -  createStudent", ex);
            return ResponseEntity.ok(ResponseCommon.fail(ex.getMessage()));
        }
    }
    @DeleteMapping("/{studentId}")
    public ResponseEntity<?> deleteStudent(@PathVariable String id) {
        try {
            studentService.delete(id);
            return ResponseEntity.ok(ResponseCommon.success(""));
        } catch (Error ex) {
            log.error("API /api/v1 -  deleteStudent", ex);
            return ResponseEntity.ok(ResponseCommon.fail(ex.getMessage()));
        }
    }
}
