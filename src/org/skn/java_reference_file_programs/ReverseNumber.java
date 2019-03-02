package org.skn.java_reference_file_programs;

public class ReverseNumber {
	public void numberReverse() {
		int a = 123;
		int temp=a;
		int i = 0, j = 0;
		while (a > 0) {
			i = a % 10;
			j = (j * 10) + i;
			a = a / 10;
		}
		System.out.println("Reverse number of " + temp + " is " + j);
	}

	public static void main(String[] args) {
		ReverseNumber obj = new ReverseNumber();
		obj.numberReverse();
	}
}
