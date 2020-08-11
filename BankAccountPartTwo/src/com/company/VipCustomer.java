package com.company;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    // constructors
        // empty constructor; calls the constructor w the default values
        public VipCustomer() {
            this("default name", 50000.0, "default@email.com");
        }
        // 2 passed through values and 1 default value
        public VipCustomer(String name, String email) {
            this(name, 2000.0, email);
    }

        // save all fields
        public VipCustomer(String name, double creditLimit, String email) {
            this.name = name;
            this.creditLimit = creditLimit;
            this.email = email;
        }

    // getters
    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
