package com.example.demo.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class StudentPage {

    @GetMapping("student")
    public String getStudent() {
        System.out.println("going ...");
        return "student";
    }

    @GetMapping("detail")
    public String detailPage() {
        System.out.println("going ...");
        return "studentDetail";
    }

    @GetMapping("update")
    public String updatePage() {
        System.out.println("going ...");
        return "studentUpdate";
    }
}
