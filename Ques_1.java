package com.Day_09_02_23;

import java.util.Scanner;

public class Ques_1 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		    System.out.print("Enter a string: ");
		    String s = sc.nextLine();

		    String m = encryptedString(s);
		    System.out.println("Encrypted string: " + m);
		  }

		  public static String encryptedString(String str) {
			  
		    int len = str.length();
		    StringBuilder sb = new StringBuilder();
		    
		    for (int i = 0; i < len - 4; i++) {
		      sb.append("X");
		    }
		    
		    sb.append(str.substring(len - 4));
		    return sb.toString();
		  }
}