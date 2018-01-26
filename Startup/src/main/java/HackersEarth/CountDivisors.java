//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/count-divisors/
/**
 * Count The No. OF Divisors divisisble by k in the range from l to r.
 */
package HackersEarth;

import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class CountDivisors {
	@SuppressWarnings("resource")
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt(), r = sc.nextInt(), k = sc.nextInt();
		System.out.println((r / k) - ((l - 1) / k));
	}
}
