package org.skn.java_reference_file_programs;

public class MaxAndMinNumberInGivenArray {

	public static void maxMin() {
		int a[] = { 10, 100, 90, 20, 40 }, temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("Max no:" + a[0]);
		System.out.println("min no:" + a[a.length - 1]);
	}

	public static void main(String[] args) {
		maxMin();
	}
}
