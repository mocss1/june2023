package Assignments;

import java.util.Scanner;

public class Ans23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //WJP to differentiate input as string, int or bool
		
		Scanner inputvalue = new Scanner(System.in);
		System.out.println("Enter input");
		
		if(inputvalue.hasNextBoolean())
		{
			System.out.println("value is boolean");
		}
		else if(inputvalue.hasNextInt()) {
			System.out.println("value is int");
		}
		else 
		{
			System.out.println("value is string");
		}
		inputvalue.close();
		
	}

}
