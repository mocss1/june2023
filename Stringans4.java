package Assignments;

import java.util.Scanner;

public class Stringans4 {

	public static void main(String[] args) {
		// Given a string print the reverse of the String (Java - avaJ)
		
		Scanner inputstring = new Scanner(System.in);
		
		System.out.println("Enter input string:");
		String str=inputstring.nextLine();
		
		StringBuffer value = new StringBuffer(str);
		System.out.println(value.reverse());
		
        inputstring.close();
	}

}
