package Assignments;

import java.util.Scanner;

public class Stringans2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Check the given word is present in a give String . String S = "I am learning qa automation testing" word ="qa"
		
		Scanner inputstring = new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String str = inputstring.nextLine();
		
		System.out.println("Check the given word:");
		String str1 = inputstring.nextLine();
		
		boolean bool = str.contains(str1);
		System.out.println(bool);
 		
		
		inputstring.close();

	}

}
