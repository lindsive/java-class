package com.company;

import java.io.FileReader;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age <= 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        if ((firstName.isEmpty()) && (lastName.isEmpty())) {
            return "";
        } else if ((lastName.isEmpty())){
            return firstName;
        } else if (firstName.isEmpty()) {
            return lastName;
        } else {
            return firstName + " " + lastName;
        }
    }

    // validate
    public boolean isTeen() {
        if (this.age > 12 && this.age < 20) {
            return true;
        }
        return false;
    }

}
