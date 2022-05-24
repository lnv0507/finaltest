package com.example.demo.convert;

import com.example.demo.entity.Student;
import com.example.demo.payload.StudentResponse;
import org.springframework.stereotype.Component;

@Component
public class StudentConvert {

    public StudentResponse toResponse(Student entity) {
        return StudentResponse.builder()
                .address(entity.getAddress())
                .birthday(entity.getBirthday())
                .id(entity.getId())
                .depName(entity.getDepName())
                .name(entity.getName())
                .placeOfBirth(entity.getPlaceOfBirth())
                .male(entity.isMale())
                .build();
    }
}
