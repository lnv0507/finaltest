package com.example.demo.payload;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class StudentResponse {
    private String id;
    private String name;
    private boolean male;
    private String birthday;
    private String placeOfBirth;
    private String address;
    private String depName;
}
