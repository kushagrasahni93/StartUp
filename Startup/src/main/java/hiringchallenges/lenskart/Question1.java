package hiringchallenges.lenskart;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Question1 {

	@SuppressWarnings("resource")
	public static void main(String args[]) throws Exception {

		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine()); // No. Of Test Cases
		boolean player1Chance = true, player2Chance = false;
		
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			int count = 0;
			while (s.isEmpty()==false) {
				if (count % 2 == 0) {
					player1Chance = true;
					player2Chance = false;
				} else {
					player1Chance = false;
					player2Chance = true;
				}
				count++;
				s= s.replace("" + s.charAt(0), "");
			}
			if(player1Chance) {
				System.out.println("Player1");	
			} else {
				System.out.println("Player2");
			}
			
		}
	}
}
