package Assignments;

import java.util.Scanner;

public class Ans28 {
	
	//WJP to find factorial of a number using recursion
	
	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in); 
	    System.out.println("Enter factorial number");
	    
	    int enteredvalue=input.nextInt();
	    
	    
	    int num = enteredvalue;
	    long factorial = fact(num);
	    
	    System.out.println("Factorial of "+enteredvalue+" =" + factorial );
	    
	}
	
	    public static long fact(int enteredvalue)
	    {
	    	if (enteredvalue==1)
	    	{
	    		return 1;
	    	}
	    	else 
	    		return enteredvalue*fact(enteredvalue-1);
	    	
	    }
	    
	}
	    


