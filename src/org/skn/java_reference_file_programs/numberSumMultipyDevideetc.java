package org.skn.java_reference_file_programs;

public class numberSumMultipyDevideetc {

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

	/** Sum of 1 to 100 numbers **/
	public void sumOfNumbers() {
		int z = 0;
		for (int i = 0; i <= 100; i++) {
			z = z + i;
		}
		System.out.println("sum of 1 to 100 numbers is " + z);
	}

	public static void main(String[] args) {
		numberSumMultipyDevideetc obj = new numberSumMultipyDevideetc();
		obj.findEvenNumberSum();
		obj.findOddNumberSum();
		System.out.println("**sum of 1 to 100 number");
		obj.sumOfNumbers();
	}
}
