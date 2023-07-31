package Assignments;

import java.util.Scanner;

public class Ans2 {

	public static void main(String[] args) {
		// write a program to find factorial (Non Recursive)
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number");
		
		int enteredvalue= input.nextInt();
		
		int fact=1;
		 
		 for(int i=1;i<=enteredvalue;i++){
			 fact=fact*i;
			 
		 }
		 System.out.println("factorial of entered number is "+ fact);
		
		 input.close();

	}

}
