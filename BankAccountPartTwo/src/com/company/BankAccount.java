package com.company;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // constructors

    // empty constructor (has no params)
    // can be used to set default values
    // default has to be first line
    public BankAccount() {
        this("56789", 2.50, "Default Name", "default email",
                "default phone number");
        System.out.println("empty constructor");
    }

    // major constructor (initializes values)
    public BankAccount(String number, double balance, String customerName, String email,
                       String phoneNumber) {
        System.out.println("BankAccount constructor w params called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        // number and balance are default values
        this("9999999", 100.55, customerName, email, phoneNumber);
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // setters
    public void setAccountNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // getters
    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // additional methods
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("deposit of " + depositAmount + " processed. new balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Insufficient funds. There is only " + this.balance + " available");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("withdrawal of " + withdrawalAmount + " processed. Reminaing balance is " + this.balance);
        }
    }
}
