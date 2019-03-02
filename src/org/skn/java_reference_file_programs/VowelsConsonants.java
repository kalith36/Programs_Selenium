package org.skn.java_reference_file_programs;

public class VowelsConsonants {
	public static void vowelsCount() {
		String name = "Welcome";
		int vowelsCount = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch

			== 'I' || ch == 'O' || ch == 'U') {

				vowelsCount++;
			}

		}
		System.out.println(vowelsCount);
	}

	public static void consonantsAndVowelsCount() {
		String name = "Welcome";
		int vowelsCount = 0;
		int consonantCount = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch

			== 'I' || ch == 'O' || ch == 'U') {

				vowelsCount++;
			} else {
				consonantCount++;
			}

		}
		System.out.println(vowelsCount);
		System.out.println(consonantCount);
	}

	public static void printVowelsAndConsonantsSeperately() {
		String name = "Welcome";
		String vowels = "";
		String consonant = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch

			== 'I' || ch == 'O' || ch == 'U') {

				vowels = vowels + ch;
			} else {
				consonant = consonant + ch;
			}

		}
		System.out.println(vowels);
		System.out.println(consonant);
	}

	public static void main(String[] args) {
		vowelsCount();
		consonantsAndVowelsCount();
		printVowelsAndConsonantsSeperately();
	}
}
