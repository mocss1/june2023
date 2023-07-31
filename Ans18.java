package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class Ans18 {

	public static void main(String[] args) {
		//  WJP to display duplicate character in string
		
		Scanner inputstr = new Scanner(System.in);
		System.out.println("Enter a String");
		
		String str=inputstr.nextLine();
		char[] ch=str.toCharArray();
		//System.out.println("Duplicate characters of string are:");
		
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.println("Duplicate characters are: "+ch[j]);
					break; 
				}
			}
		}
				
		inputstr.close();

	}

}
