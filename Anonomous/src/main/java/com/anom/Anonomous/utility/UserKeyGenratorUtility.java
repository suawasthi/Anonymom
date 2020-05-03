package com.anom.Anonomous.utility;

import java.util.Random;

public class UserKeyGenratorUtility {
	
	
	public static void main(String[] args) {
		for(int i=0;i<100;i++)
		System.out.println(generateUserIndentifier());
	}
	
	public static String generateUserIndentifier() {
		String user = new String();
		char ch[] = {'1' , '2', '3', 'v', 'w', 'x', 'y', 'z', 'B', 'C', 'D', '4', '5', '6', '7' , '8' , '9', '0','a', 'A', 'b', 'c', 'd', 'e', 'f', 'g','S', 'T', 'U', 'V', 'W', 'X', 'Y', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o'
				, 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'
				, 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		StringBuilder strb = new StringBuilder();
		Random rand = new Random();
		for(int i=0;i<12; i++) {
			strb.append(ch[rand.nextInt(ch.length)]);
		}
		user= strb.toString();
		return user;

		
	}

}
