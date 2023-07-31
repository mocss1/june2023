package Assignments;

import java.util.Scanner;

public class Ans13 {
	
	//Given a string print the reverse of the string.(Input: Java Code Output: edoC avaJ)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); 
	    System.out.println("Enter a String");
	    
	    String enteredValue=input.nextLine();
	    
		StringBuffer value = new StringBuffer(enteredValue);
		System.out.println(value.reverse());
		
		input.close();
	}

}
