package hiringchallenges.lenskart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Question3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()); // No. Of Test Cases
		for (int i = 0; i < t; i++) {
			ArrayList<Integer> result = new ArrayList<Integer>();
			int n = Integer.parseInt(br.readLine()); // No. Of Values
			String[] tokens = br.readLine().split(" ");
			ArrayList<Integer> integerArray = new ArrayList<Integer>();
			int maxNoOfBagsWhichCanBeRobbed = 0;
			int limitOfBagsWhichCanBeTaken = 0;
			for (String token : tokens) {
				integerArray.add(Integer.parseInt(token));
			}
			int noOfSacks = 0;
			int baseQuantity = 0;
			for (int counter = 0; counter < integerArray.size()-1; counter++) {
				if(integerArray.get(counter)>integerArray.get(counter+1)) {
					if(noOfSacks==0) {
						result.add(integerArray.get(counter));
						continue;
					}
					else {
						//There is some number in noOfSacks;
					}
				} else {
					noOfSacks = noOfSacks + integerArray.get(counter);
				}
				int tempCounter = counter;
				while ((tempCounter+1)<integerArray.size()) {
					if (integerArray.get(counter) > integerArray.get(counter + 1)) {
						if(noOfSacks==0) {
						noOfSacks = noOfSacks + integerArray.get(counter + 1);
						baseQuantity = noOfSacks;
						} else {
							noOfSacks = noOfSacks + baseQuantity;
						}
					} else {
						if(noOfSacks!=0) {
							result.add(noOfSacks);
						}
					}
						noOfSacks = noOfSacks + integerArray.get(counter);
						tempCounter++;
					}
					//else {
//						result.add(integerArray.get(counter));
//						break;
//					}
			}
		}
	}
}
