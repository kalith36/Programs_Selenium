package org.skn.java_reference_file_programs;

public class ReverseString {
	public static void main(String[] args) {
		String name = "Welcome";
		String res = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			char ch = name.charAt(i);
			res = res + ch;
		}
		System.out.println("Reverse of " + name + " is " + res);

	}
}
