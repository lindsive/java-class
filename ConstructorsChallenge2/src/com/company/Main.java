package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("testing all default values");
	    VipCustomer defaultValues = new VipCustomer();
        System.out.println("the default name is " + defaultValues.getName());
        System.out.println("the default creditLimit is " + defaultValues.getCreditLimit() + " dollars");
        System.out.println("the default emailAddress is " + defaultValues.getEmailAddress());

        System.out.println(" ");

        System.out.println("testing 2 values with one default");
        VipCustomer newVipTim = new VipCustomer("tim", "tim@email.com");
        System.out.println("the new customer's name is " + newVipTim.getName());
        System.out.println(newVipTim.getName()+ "'s credit limit is the default of "
                + newVipTim.getCreditLimit() + " dollars");
        System.out.println(newVipTim.getName() + "'s email address is " + newVipTim.getEmailAddress());

        System.out.println(" ");

        System.out.println("testing major constructor - saving all fields");
        VipCustomer newVipMC = new VipCustomer("MC", 2000.0,
                "mc@email.com");
        System.out.println("the new customer's name is " + newVipMC.getName());
        System.out.println(newVipMC.getName() + "'s credit limit is " + newVipMC.getCreditLimit());
        System.out.println(newVipMC.getName() + "'s email address is " + newVipMC.getEmailAddress());
    }
}
