package com.company;

import java.lang.reflect.AccessibleObject;

public class Main {

    public static void main(String[] args) {
//        BankAccount bobsAccount = new BankAccount(); // "12345", 0.00, "Bob Brown",
//                // "myemail@bob.com", "123-456-7890");
//
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdrawal(100.0);
//
//        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12345");
//        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", "bob@email.com");
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.0, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());
    }
}
