package com.Day_09_02_23;

public class Ques_2 {

	public static void main(String[] args) {
		
			    String[] arr1 = {"Hello"," ", "Ankit"," ", "!"};
			    String[] arr2 = {" ", "Namaste"," ", "!"};
			    String[] arr3 = null;

			    System.out.println("Concatenated string 1: " + conStrings(arr1));
			    System.out.println("Concatenated string 2: " + conStrings(arr2));
			    System.out.println("Concatenated string 3: " + conStrings(arr3));
			  }

			  public static String conStrings(String[] arr) {
			    if (arr == null) {
			      return "";
			    }
			    StringBuilder sb = new StringBuilder();
			    for (String str : arr) {
			      sb.append(str);
			    }
			    return sb.toString();
			  }

}
