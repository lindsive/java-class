package com.company;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    // default constructor
    public Account() {
        this("56789", 2.50, "default name",
                "default address", "default phone number");
        System.out.println("empty constructor called");
    }

    // major constructor - updates all fields
    public Account(String number, double balance, String customerName, String customerEmailAddress,
                   String customerPhoneNumber) {
        System.out.println("account constructor w params called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    // lets say we only want to set 2 default params: number and balance
    // the rest (customerName, customerEmailAddress, and customerPhoneNumber) are going to
    // have values passed through
    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999", 100.55, customerName,
                customerEmailAddress, customerPhoneNumber);
    }

    //methods
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("deposit of " + depositAmount + " posted. new balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("only " + this.balance + " is available. withdrawal not processed.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("withdrawal amount " + withdrawalAmount + " processed. new balance is " + this.balance);
        }
    }

    // getters && setters
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
