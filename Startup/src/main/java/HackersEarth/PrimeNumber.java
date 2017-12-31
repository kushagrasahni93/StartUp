/**
 * Reference: https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/prime-number-8/
 * @author Kushagra
 */
package HackersEarth;

import java.util.Scanner;

/* IMPORTANT: Multiple classes and nested static classes are supported */

public class PrimeNumber {
	public static void main(String args[]) throws Exception {
		@SuppressWarnings("resource")
		int input = new Scanner(System.in).nextInt();

		for (int counter = 2; counter <= input; counter++) {
			boolean isPrime = true;
			for (int innerCounter = 2; innerCounter < counter; innerCounter++) {
				if (counter % innerCounter == 0 && counter > 2) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				// System.out.println(counter);
				System.out.print(counter + " ");
			}
		}

	}
}