package org.skn.java_reference_file_programs;

public class ReverseNumberIsPalindrome {
	public void numberPalindrome() {
		int a = 141;
		int temp = a;
		int i = 0, j = 0;
		while (a > 0) {
			i = a % 10;
			j = (j * 10) + i;
			a = a / 10;
		}
		System.out.println("Reverse number of " + temp + " is " + j);
		if (temp == j) {
			System.out.println("The number " + temp + " is Palindrome Number");
		}
	}


	public void numberPalindromePrint() {
		for (int k = 1; k <= 100; k++) {
			/**Don't use k directly since a value will change in each loop**/
			int a=k;
			int temp1 =a;
			int i = 0, j = 0;
			while (a > 0) {
				i = a % 10;
				j = (j * 10) + i;
				a = a / 10;
			}

			if (temp1 == j) {
				System.out.println("The number " + temp1 + " is Palindrome Number");
			}
		}
	}

	public static void main(String[] args) {
		ReverseNumberIsPalindrome obj = new ReverseNumberIsPalindrome();
		obj.numberPalindrome();
		obj.numberPalindromePrint();
	}

}
