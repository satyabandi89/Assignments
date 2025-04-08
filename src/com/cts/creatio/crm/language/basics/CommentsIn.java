package com.cts.creatio.crm.language.basics;

public class CommentsIn {
	

	public static void main(String[] args) {
		
		//This is the print statement in java,it will print next line.(single line comment)
		System.out.println("Hello World!");
		
		/* This also another print statement in java 
		   This will print all the content mentioned inside()
		   And,It will maintain on same line in the console(multi-line comments)
		 */
		System.out.print("Hello, ");
		System.out.print("World !");
		System.out.println();
		
		/* This is one more print statement in java
		 * This will print format the digits and it cut down the decimal points using %f
		 * Then print formated content and then stay on same line 
		 */
		
		System.out.format("Total Bill is %.2f",100.93453657);
	    System.out.println();
		
		/** This is another print statement in java
		 * This will print the content mentioned inside()
		 * And combined add multiple additional values and 
		 * It will print the multiple statements in one line in the console
		 * 
		 * @author Satya reddy (dsatyat@gmail.com)
		 * 
		 * @version 0.1
		 * 
		 * @param Satya reddy ,My address is banglore
		 * 
		 * @return Satya reddy, My address is banglore
		 */
		
		System.out.append("Satya reddy") .append(", My address is banglore");
		System.out.println();
		
		
		
		
	}

}

