package org.skn.java_reference_file_programs;

public class FactorialNumber {
	/** Factorial number from 1 to 5 **/
	public void findFactorialNumber() {
		int z = 1;
		for (int i = 1; i <= 5; i++) {
			z = z * i;
		}
		System.out.println("Factorial number of 5 is " + z);
	}
	public static void main(String[] args) {
		FactorialNumber obj=new FactorialNumber();	
		obj.findFactorialNumber();
	}

}
