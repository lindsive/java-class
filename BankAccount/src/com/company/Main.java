package com.company;

public class Main {

    public static void main(String[] args) {
	    BankAccount bankAccount = new BankAccount();

	    bankAccount.setBalance(300.55);
	    bankAccount.withdrawFunds(375.00);
		System.out.println("the new balance after withdraw is " + bankAccount.withdrawFunds(200.00));
		System.out.println("the new balance is " + bankAccount.depositFunds(400.90));

		bankAccount.setAccountNumber(794385);
		System.out.println("your account number is " + bankAccount.getAccountNumber());

		bankAccount.setCustomerName("Joe Pillow");
		System.out.println("Customer Name: " + bankAccount.getCustomerName());
		bankAccount.setEmail("email@email.com");
		System.out.println("the customer's email is " + bankAccount.getEmail());
		bankAccount.setPhoneNumber(9089089908L);
		System.out.println("the customer's phone number is " + bankAccount.getPhoneNumber());

    }
}
