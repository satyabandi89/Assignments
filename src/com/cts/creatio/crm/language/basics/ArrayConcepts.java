package com.cts.creatio.crm.language.basics;

import java.io.PrintStream;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		String [][][] semisters = new String[5][2][6];
		
		
		semisters[1][0][4] = "Basic electronics";
		semisters[1][0][5] = "Engineering Physics";
		semisters[3][1][2] = "fail 19";
		semisters[3][1][5] = "pass 87"; 
		
		System.out.append(semisters[1][0][4] ).append(semisters[1][0][5]);
		System.out.println();
		System.out.append(semisters[3][1][2] )	 .append(semisters[3][1][5]);
		
		
	}

}
