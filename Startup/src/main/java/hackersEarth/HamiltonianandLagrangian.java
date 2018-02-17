/**
 * Hamiltonian and Lagrangian
 * Reference: https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/hamiltonian-and-lagrangian/
 * @author Kushagra
 * 
 * Status Update: Try running this code, seems to work fine :-)
 */
package hackersEarth;

import java.util.ArrayList;
import java.util.Scanner;

public class HamiltonianandLagrangian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> marks = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			marks.add(sc.nextInt());
			if(i!=0 && i!= (n-1) && marks.get(i)>marks.get(i-1)) {
				 result.add(marks.get(i));
			}
			if(i==(n-1)) {
				result.add(i);
			}
			System.out.println(result);
		}

	}

}
