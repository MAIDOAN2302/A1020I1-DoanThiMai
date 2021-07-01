package com.codegym.model;

import javax.validation.constraints.*;

public class User {
    @NotEmpty(message = "Name is mandatory")
    @Size(min = 2, max = 30)
    private String firstName;

    @NotEmpty(message = "Name is mandatory")
    @Size(min = 2, max = 30)
    private String lastName;

    @Min(18)
    private int age;

    @NotBlank(message = "Email is mandatory")
    private String email;

    @NotEmpty(message = "Phone not null")
    @Pattern(regexp = "\\d{10}", message = "Phone number is mandatory")
    private String phoneNumber;

    public User() {
    }

    public User(@NotEmpty(message = "Name is mandatory") @Size(min = 2, max = 30) String firstName,
                @NotEmpty(message = "Name is mandatory") @Size(min = 2, max = 30) String lastName,
                @NotBlank(message = "Email is mandatory") String email,
                @Pattern(regexp = "\\d{10}", message = "Phone number is mandatory") String phoneNumber,
                @Min(18) int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
