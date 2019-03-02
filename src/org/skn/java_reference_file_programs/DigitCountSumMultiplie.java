package org.skn.java_reference_file_programs;

public class DigitCountSumMultiplie {
	int b = 1234;

	public void digitCount() {

		int a = b;
		int count = 0;
		int i = 0;
		while (a > 0) {
			a = a / 10;
			count++;
		}
		System.out.println("Digit count of " + b + " is " + count);
	}

	public void digitSum() {
		int a = b;
		int sum = 0;
		int i = 0;
		while (a > 0) {
			i = a % 10;
			sum = sum + i;
			a = a / 10;
		}
		System.out.println("Digit sum of " + b + " is " + sum);
	}

	public void didgitMultiplie() {
		int a = b;
		int multi = 1;
		int i = 1;
		while (a > 0) {
			i = a % 10;
			multi = multi * i;
			a = a / 10;
		}
		System.out.println("Digit multiple of " + b + " is " + multi);
	}

	public static void main(String[] args) {
		DigitCountSumMultiplie obj = new DigitCountSumMultiplie();
		obj.digitCount();
		obj.digitSum();
		obj.didgitMultiplie();
	}
}