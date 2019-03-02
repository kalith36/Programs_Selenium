package org.skn.java_reference_file_programs;

public class ConvertAllSmallCaseIntoCapsAndReverse {
	public static void main(String[] args) {

		String name = "WelcomE";
		StringBuffer b = new StringBuffer(name);

		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isLowerCase(ch)) {
				b.setCharAt(i, Character.toUpperCase(ch));

			} else {
				b.setCharAt(i, Character.toLowerCase(ch));

			}
		}
		System.out.println(b.toString());

	}
}
