package Assignments;

import java.util.Scanner;

public class Ans12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Write a program to check palindrome (MalayalaM)
		
		Scanner inputstring = new Scanner(System.in);
		System.out.println("Enter a String");
		
		String value=inputstring.nextLine();
		String orgstr=value;
		
		String rev="";
		int len = value.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+value.charAt(i);
		  }
		System.out.println("Reverse string is:"+rev);
		
		if(orgstr.equals(rev))
		//if(orgstr==rev)
		{
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
			
		inputstring.close();
	}

}
