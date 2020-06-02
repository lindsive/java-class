package com.company;

public class Main {

    public static void main(String[] args) {
	    byte byteNum = 10;
	    short shortNum = 20;
	    int intNum = 50;

	    long longNum = ((byteNum + shortNum + intNum) * 10L + 50000L);

		System.out.println(longNum);

		short shortTotal = (short) (1000 + 10 * (byteNum + shortNum + intNum));
		System.out.println(shortTotal);

	}
}
