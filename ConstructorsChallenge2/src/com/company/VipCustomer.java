package com.company;

public class VipCustomer {
    // fields
    private String name;
    private double creditLimit;
    private String emailAddress;

    // default (empty constructor)
    public VipCustomer() {
        this("Default Name", 1000.0, "email@email.com");
        System.out.println("empty constructor called");
    }

    // major constructor - saves all fields
    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    // defaulting creditLimit to 1000.0
    // name and emailAddress will have values passed through
    public VipCustomer(String name, String emailAddress) {
        this(name, 1000.0, emailAddress);
    }

    //getters
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
