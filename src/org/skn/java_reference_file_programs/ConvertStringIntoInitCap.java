package org.skn.java_reference_file_programs;

public class ConvertStringIntoInitCap {
	public static void main(String[] args) {
		String name = "Welcome to java sql java to java sql plsql";
		String[] x = name.split(" ");
		String res = "";
		for (String v : x) {
			String first = v.substring(0, 1);
			String after = v.substring(1);
			res = res + first.toUpperCase() + after + " ";

		}
		System.out.println(res.trim());
	}
}
