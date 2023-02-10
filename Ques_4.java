package com.Day_09_02_23;

import java.util.Scanner;

public class Ques_4{   
	
    public static void main(String[] args) {    
	    DChar();
    }  
    
    public static void DChar() {
    	Scanner sc = new Scanner(System.in);
	    System.out.print("Enter a string: ");
	    String s = sc.nextLine();
       char string[] = s.toCharArray();   
       int count; 
           
       System.out.println("Duplicate characters in a given string: ");    
       
       for(int i = 0; i <string.length; i++) {    
           count = 1;    
           for(int j = i+1; j <string.length; j++) {    
               if(string[i] == string[j] && string[i] != ' ') {    
                   count++;    
                       
                   string[j] = '0';    
               }    
           }    
               
           if(count > 1 && string[i] != '0')    
               System.out.print(string[i]+",");    
       }    
   }    
}     