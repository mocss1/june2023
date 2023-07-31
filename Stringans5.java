package Assignments;

import java.util.Scanner;

public class Stringans5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WJP to find the number of Integers , uppercase, lowecase characters in a given String "Hello Java 8" 
        //Integer - 1 uppercase - 2 lowercase - 7
		
		Scanner inputstring = new Scanner(System.in);
		System.out.println("Enter a String:");
		
		String enteredvalue=inputstring.nextLine();
		
		int upper=0;
		int lower=0;
		int number=0;
		int special=0;
		
		for(int i=0;i<enteredvalue.length();i++) {
			char ch=enteredvalue.charAt(i);
			if(ch>='A' && ch<='Z')
				upper++;
			else if(ch>='a' && ch<='z')
				lower++;
			else if(ch>='0' && ch<='9')
				number++;
			else
				special++;
		     }
		
		System.out.println("Number of upper case letters:" +upper);
		System.out.println("Number of lower case letters:" +lower);
		System.out.println("Number of Intergers:" +number);
		
		
		inputstring.close();
	}
     
}
