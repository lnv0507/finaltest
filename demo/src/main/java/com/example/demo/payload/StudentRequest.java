package com.example.demo.payload;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequest {
    private String id;
    private String name;
    private boolean male;
    private String birthday;
    private String placeOfBirth;
    private String address;
    private String depName;
    private boolean active;
}
