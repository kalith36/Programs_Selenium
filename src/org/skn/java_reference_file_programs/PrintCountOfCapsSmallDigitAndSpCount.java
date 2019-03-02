package org.skn.java_reference_file_programs;

public class PrintCountOfCapsSmallDigitAndSpCount {
	public static void main(String[] args) {

		String name = "Welcome@123456";
		int sCount = 0;
		int uCount = 0;
		int dCount = 0;
		int spCount = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isUpperCase(ch)) {
				uCount++;
			} else if (Character.isLowerCase(ch)) {
				sCount++;
			} else if (Character.isDigit(ch)) {
				dCount++;
			} else {
				spCount++;
			}

		}
		System.out.println("Caps count:" + uCount);
		System.out.println("small count:" + sCount);
		System.out.println("digit count:" + dCount);
		System.out.println("sp count:" + spCount);

	}

}
