package Assignments;

import java.util.Scanner;

public class Stringans3 {

	public static void main(String[] args) {
		// WJP to replace each substring Stirng "Dog chases cat , cat chases rat" replace cat with rat.
		
		Scanner inputstring = new Scanner(System.in);
		
		System.out.println("Enter input string");
		String str=inputstring.nextLine();
		
		System.out.println("word to be replaced:");
		String str2=inputstring.nextLine();
	
		System.out.println("replace with:");
		String str3=inputstring.nextLine();
		
		String str4=str.replace(str2, str3);
		
		System.out.println("Input string after Replace is:" +str4);
		
	    inputstring.close();
		
	}

}
