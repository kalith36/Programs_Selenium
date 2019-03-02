package org.skn.java_reference_file_programs;

public class NumberSwape {
	public void swapeTwoNumberWith3rdVariable() {
		int a = 10, b = 20, temp;
		System.out.println("Before swap the number a=" + a + " and b=" + b);
		temp = a;
		a = b;
		b = a;
		System.out.println("After swap the number a=" + a + " and b=" + b);

	}
	public void swapeTwoNumberWithout3rdVariable() {
		int a = 10, b = 20, temp;
		System.out.println("Before swap the number a=" + a + " and b=" + b);
		a=a+b;
		b =a-b;
		a =a-b;
		System.out.println("After swap the number a=" + a + " and b=" + b);

	}
	
	public static void main(String[] args) {
		NumberSwape obj=new NumberSwape();
		obj.swapeTwoNumberWith3rdVariable();
		obj.swapeTwoNumberWithout3rdVariable();
	}
}
