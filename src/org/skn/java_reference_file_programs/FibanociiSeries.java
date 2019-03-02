package org.skn.java_reference_file_programs;

public class FibanociiSeries {
	public static void fibanociiSeriesNumbers() {
		/** Print the FibanociiSeries from 1 to 10 **/
		int a = 0, b = 1, c = 0;
		for (int i = 1; i <= 10; i++) {
			c = a + b;// c=2
			System.out.println(c);
			/** sum of previous two consecutive number is FibanociiSeries **/
			a = b;// a=1
			b = c;// b=2
		}
	}

	public static void fibanociiSeriesNumbersPrint() {
		/** Print the FibanociiSeries series from 1 to 10 **/
		int a = 0, b = 1, c = 0;
		for (int i = 1; i <= 20; i++) {
			c = a + b;// c=2
			if (c <= 10) {
				System.out.println("Fibonacii sries from 1 to 10 is - " + c);
				a = b;// a=1
				b = c;// b=2
			}
		}
	}

	public static void main(String[] args) {
		// no object required for static method
		FibanociiSeries.fibanociiSeriesNumbers();
		fibanociiSeriesNumbersPrint();
	}
}
