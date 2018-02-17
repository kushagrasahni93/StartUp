package com.centilytics.Startup;

import java.io.BufferedReader;
// A Java program to print all subsets of a set
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;

public class SubsetPrint {

	static void printSubsets(ArrayList<Double> arrayList) throws JsonProcessingException {
		int n = arrayList.size();

		for (int i = 0; i < (1 << n); i++) {
			double sum = 0.0;
			ArrayList<Double> tempArray = new ArrayList<Double>();
			String numbersList = "";
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) > 0) {
					sum = sum + arrayList.get(j);
					tempArray.add(arrayList.get(j));
					numbersList = numbersList + " " + arrayList.get(j);
				}
			}
			if (sum == 0) {
				// arrayList.removeAll(tempArray);
				for (double x : tempArray) {
					arrayList.remove(x);
				}
				n = n - tempArray.size();
				System.out.println("Sum :- 0" + "|numbersList :- " + numbersList);
			}
		}
	}

	// Driver code
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter Quantity");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // No. Of Test Cases
		ArrayList<Double> arrayList = new ArrayList<Double>();
		for (int i = 0; i < n; i++) {
			double number = Double.parseDouble(br.readLine()); // No. Of Values
			arrayList.add(number);
		}
		printSubsets(arrayList);
	}
}
