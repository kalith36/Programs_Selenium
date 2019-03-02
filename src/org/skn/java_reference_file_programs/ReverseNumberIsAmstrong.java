package org.skn.java_reference_file_programs;

public class ReverseNumberIsAmstrong {
	public void amstrongNumber() {
		int a = 153;
		int temp = a;
		int i = 0, j = 0;
		while (a > 0) {
			i = a % 10;
			j = j + (i * i * i);
			a = a / 10;
		}
		if (temp == j) {
			System.out.println("Amstrong number 153=(1^3)+(5^3)+(3^3)=153");
			System.out.println("The number " + temp + " is a Amstrong Number");
		}
	}

	public void amstrongNumberPrint() {
		for (int k = 1; k < 500; k++) {
			int a = k, temp = a;
			int i = 0, j = 0;
			while (a > 0) {
				i = a % 10;
				j = j + (i * i * i);
				a = a / 10;
			}
			if (temp==j) {
				System.out.println("The number " + temp + " is a Amstrong Number");	
			}
		}

	}

	public static void main(String[] args) {
		ReverseNumberIsAmstrong obj = new ReverseNumberIsAmstrong();
		obj.amstrongNumber();
		obj.amstrongNumberPrint();

	}
}
