package org.skn.java_reference_file_programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class FewStringCharacterWordEtc {
	public static void countOfEachCharacterInGivenString() {
		String name = "Welcome";
		Map<Character, Integer> emp = new LinkedHashMap<>();
		char[] ch = name.toCharArray();
		for (char c : ch) {
			if (emp.containsKey(c)) {
				int count = emp.get(c);
				emp.put(c, count + 1);
			} else {
				emp.put(c, 1);

			}

		}
		System.out.println(emp);
	}

	public static void counOfWordAnAGivenString() {
		String name = "Welcome to java sql java to java sql plsql";
		String[] x = name.split(" ");

		Map<String, Integer> emp = new LinkedHashMap<>();
		for (String v : x) {
			if (emp.containsKey(v)) {
				int count = emp.get(v);
				emp.put(v, count + 1);
			} else {
				emp.put(v, 1);
			}

		}
		System.out.println(emp);
	}

	public static void printWordCountInGivenString() {
		String name = "Welcome to java sql java to java sql plsql";
		String[] x = name.split(" ");
		System.out.println(x.length);
	}

	public static void main(String[] args) {
		countOfEachCharacterInGivenString();
		counOfWordAnAGivenString();
		printWordCountInGivenString();
	}
}
