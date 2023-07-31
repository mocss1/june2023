package Assignments;

import java.util.Scanner;

public class Ans14 {

	//Given a string print the reverse of the words string.(Input: Java Code Output: Code Java)
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
	    System.out.println("Enter a String");
	    
	    String enteredValue=input.nextLine();
	    
	    String [] splitValues=enteredValue.split(" ");
	    String output="";
	    for(int index=splitValues.length-1;index>=0;index--) {
	    	output=output+" "+splitValues[index];
	    }
	    System.out.println("Reverse order is:"+output);
		  
	    System.out.println("Reverse order is:"+output.trim()); 
	  
	    input.close();
	}
	
	}

