package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException {

    StudentNotFoundException(Long id) {
        super(String.format("Could not find student with ID %s", id));
    }
}
