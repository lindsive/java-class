package com.company;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private long phoneNumber;

    // setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
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

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // getters
    public int getAccountNumber() {
        return accountNumber;
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

    public long getPhoneNumber() {
        return phoneNumber;
    }

    // methods
    public double depositFunds(double deposit) {
        double newBalance = this.balance + deposit;
        return newBalance;
    }

    public double withdrawFunds(double withdraw) {
        if (this.balance < 0 || this.balance < withdraw) {
            System.out.println("not enough funds, cannot withdraw");
            return -1;

        }
            double newBalanceAmount = this.balance - withdraw;
            newBalanceAmount = Math.round((newBalanceAmount * 100.00) / 100.00);
            return newBalanceAmount;
    }
}
