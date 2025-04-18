package com.cts.creatio.crm.language.basics;

import javax.xml.crypto.Data;

public class Assignment6_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] Studentnames = {"Suresh","Mahesh","Naresh"};
		int[] X = {75,80,82};
		
		
		X[0]+= 10;
		X[1]+= 10;
		X[2]+= 10;
		
		System.out.println(X[0]);
		System.out.println(X[1]);
		System.out.println(X[2]);
		
		int[] Y = {X[0],X[1],X[2]};
		
		double Average = (Y[0]+Y[1]+Y[2])/3.0;
		
		System.out.println("Average marks of all students:"+Average);
		
		
		
		

	}

}
