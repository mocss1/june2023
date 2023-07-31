package Assignments;

import java.util.Scanner;

public class Ans3 {

	public static void main(String[] args) {
		// Given an array of integers, sort the integer values.

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of integers in a array");
		int n=input.nextInt();
		
		System.out.println("Enter the integer values in a array");
		int inputvalues[] = new int[n]; 
		
		for(int i=0; i<n; i++) //for inputting the values in array
		{
			inputvalues[i]=input.nextInt();
		}
		int temp=0;
		for(int i=0;i<inputvalues.length;i++) {
			for(int j=i+1;j<inputvalues.length;j++) {
				if(inputvalues[j]<inputvalues[i]) {
					temp=inputvalues[i];
					inputvalues[i]=inputvalues[j];
					inputvalues[j]=temp;
					
				}
			}
		}
		System.out.println("Sorted array:");
		 for(int i=0;i<inputvalues.length;i++)
		 {
			 System.out.print(" "+inputvalues[i]);
		 }
		 
		 input.close();
	}

}
