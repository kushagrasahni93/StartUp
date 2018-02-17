package hiringchallenges.lenskart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Question2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()); // No. Of Test Cases
		for (int i = 0; i < t; i++) {
			boolean doOnce = true;
			int n = Integer.parseInt(br.readLine()); // No. Of Values
			String[] tokens = br.readLine().split(" ");
			ArrayList<Integer> integerArray = new ArrayList<Integer>();
			for (String token : tokens) {
				if (doOnce && integerArray.size() != 0
						&& integerArray.get(integerArray.size() - 1) > Integer.parseInt(token)) {
					int temp = integerArray.get(integerArray.size() - 1);
					integerArray.set(integerArray.size() - 1, Integer.parseInt(token));
					integerArray.add(temp);
					doOnce = false;
				} else {
					integerArray.add(Integer.parseInt(token));
				}

			}
			ArrayList<Integer> tempIntegerArray = new ArrayList<Integer>();
			for (int counter = 1; counter < integerArray.size(); counter++) {
				tempIntegerArray.add(Math.abs(integerArray.get(counter - 1) - integerArray.get(counter)));
			}
			System.out.println(Collections.max(tempIntegerArray));
		}
	}

}
