package Assignments;

import java.util.Scanner;

public class Ans16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a method that will remove given character from the String
		
		Scanner inputstring = new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String enteredvalue=inputstring.nextLine();
		
		System.out.println("Enter the character to be removed");
		String str1=inputstring.nextLine();
		
		System.out.println("Enter the replace value");
		String str2=inputstring.nextLine();
		
        String str3=enteredvalue.replace(str1, str2);
		System.out.println("Input string after removing given character:" +str3);
		
		
		inputstring.close();		

	}

}
