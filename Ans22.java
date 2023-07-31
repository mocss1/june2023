package Assignments;

import java.util.Scanner;

public class Ans22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WJP to convert int to string
		
		Scanner inputvalue=new Scanner(System.in);
		System.out.println("Enter a interger value");
		
		try {
			int intvalue= inputvalue.nextInt();
		    String strvalue= String.valueOf(intvalue);
		
		    System.out.println("string value =" + strvalue);
		    System.out.println("string value =" + strvalue+1); 
		}
		
		//InputMismatchException
		catch(Exception e) {
			System.out.println("Not a integer value");
			
		}
		
	}

}
