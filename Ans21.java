package Assignments;

import java.util.Scanner;

public class Ans21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//  WJP to convert string to int
		
		Scanner input = new Scanner(System.in); 
	    System.out.println("Enter a String");
	    
	    String enteredValue=input.nextLine();
	    
	    try {
	    	int convertedValue=Integer.parseInt(enteredValue);
		    System.out.println(convertedValue);	
		    System.out.println(convertedValue+1);
	    }
		    //NumberFormatException
	    catch(Exception e) {                  
	    	System.out.print("Not a number");
	    }
	    
	    
	}

}
