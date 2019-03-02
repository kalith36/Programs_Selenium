package org.skn.java_reference_file_programs;

public class EvenOddNumberPro {
	int n = 10, n1 = 11;

	/****** Validate the Number is ODD or Even **/
	public void oddNumber() {
		if (n % 2 == 0) {
			System.out.println(n + " is Even Number");
		}
	}

	/******* Validate the Number is ODD or Even **/
	public void evenNumber() {
		if (n1 % 2 == 1) {
			System.out.println(n1 + " is Odd Number");
		}
	}

	/******** Print all Even and Odd number form 1 to 100 **/
	public void evenNumberPrint() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is Even Number");
			} else {
				System.out.println(i + " is Odd Number");
			}
		}
	}

	/******** Count Even Number Count number **/
	public void findEvenNumberCount() {
		int x = 0;
		for (int j = 1; j <= 100; j++) {
			if (j % 2 == 0) {
				x++;
			}
		}
		System.out.println("1 to 100 Even number count is " + x);
	}

	/******** Count Even Number Count number **/
	public void findOddNumberCount() {
		int y = 0;
		for (int k = 1; k <= 100; k++) {
			if (k % 2 == 1) {
				y = y + 1;
			}
		}
		System.out.println("1 to 100 Odd Number count is " + y);
	}

	/********* Get sum of even number from 1 to 100 **/
	public void findEvenNumberSum() {
		int z = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				z = z + i;
			}
		}
		System.out.println("Sum of all even number form 1 to 100 is " + z);
	}

	/********* Get sum of odd number from 1 to 100 **/
	public void findOddNumberSum() {
		int z = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 1) {
				z = z + i;
			}
		}
		System.out.println("Sum of all odd number form 1 to 100 is " + z);
	}


	public static void main(String[] args) {
		EvenOddNumberPro obj = new EvenOddNumberPro();
		System.out.println("**Find even number**");
		obj.oddNumber();
		System.out.println("**Find odd number**");
		obj.evenNumber();
		System.out.println("**Find all even and odd  number**");
		obj.evenNumberPrint();
		System.out.println("**Find all even number count**");
		obj.findEvenNumberCount();
		System.out.println("**Find all odd number count**");
		obj.findOddNumberCount();
		System.out.println("**Find all even number sum**");
		obj.findEvenNumberSum();
		System.out.println("**Find all odd number sum**");
		obj.findOddNumberSum();

	}
}
