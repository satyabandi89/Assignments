package com.cts.creatio.crm.language.basics;

public class Assignment14_diamondshapednumbers {

	public static void main(String[] args) {
		// System.out.println("Enter the value of n: ");

		int n = 5;
		// upper half
		for (int i = 1; i <=n; i++) {
			// print the space between numbers
			for (int x = 1; x <= n - i; x++) {
				System.out.print(" ");
               	   
           }
			// print numbers from 1 to i
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		    }
		
		
		
	
		   for (int i = n - 1; i >= 1;i--) {
				// print the space between numbers
				   
				for (int x = 1; x <= n - i; x++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(j +" ");
				}
				System.out.println();
			}
	}

}
