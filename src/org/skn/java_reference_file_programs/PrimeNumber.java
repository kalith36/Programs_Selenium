package org.skn.java_reference_file_programs;

public class PrimeNumber {
	public static void checkPrimeNumber() {
		int n = 10;

		int count = 0;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count = 1;
				break;
			}
		}
		if (count == 0) {
			System.out.println("prime no");
		} else {
			System.out.println("not a prime no");
		}
	}

	public static void printPrimeNumnber() {
		int count;
		for (int n = 1; n <= 10; n++) {
			count = 0;
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					count = 1;
					break;
				}
			}
			if (count == 0) {
				System.out.println(n);
			}
		}
	}

	public static void countPrimtNumber() {
		int count;
		int pCount = 0;
		for (int n = 1; n <= 10; n++) {
			count = 0;
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					count = 1;
					break;
				}
			}
			if (count == 0) {
				pCount++;
			}
		}
		System.out.println(pCount);
	}

	public static void main(String[] args) {
		checkPrimeNumber();
		printPrimeNumnber();
		countPrimtNumber();
	}
}
