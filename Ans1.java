package Assignments;

import java.util.Scanner;

public class Ans1 {
	
	public static void main(String[] args) {
		// Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true 
		
		Scanner input = new Scanner(System.in); 
	    
		System.out.println("Enter a boolean value");
	    boolean a = input.nextBoolean();
	    
	    System.out.println("Enter b boolean value");
	     boolean b = input.nextBoolean();
	     
	    System.out.println("Enter c boolean value");
	    boolean c = input.nextBoolean();
	    
	    int counter=0;
	   
	    if(a)
            counter=counter+1;
	    if(b) 
	        counter=counter+1;	    
	    if(c) 
	        counter=counter+1;

	    
	    if(counter>=2)
	    	System.out.println("two out of three Booleans are true");
	    else
	    	System.out.println("two out of three Booleans are not true");
	    
	    input.close();
	    
	}
      
        
}
