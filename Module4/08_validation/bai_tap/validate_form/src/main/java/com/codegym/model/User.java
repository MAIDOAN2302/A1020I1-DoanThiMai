package com.codegym.model;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.lang.annotation.Annotation;

public class User implements Validated {

    @NotEmpty
    @Size(min = 5, max = 45)
    private String firstName;

    @NotEmpty
    @Size(min = 5, max = 45)
    private String lastName;

    @Min(18)
    private int age;


    @Override
    public Class<?>[] value() {
        return new Class[0];
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
