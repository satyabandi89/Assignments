package com.cts.creatio.crm.language.basics;

public class Assignment4_Numbers {

	public static void main(String[] args) {
		int[] numbers = {55,23,56,25,16,20,35,65,78,64};
	 
		int[] number = new int[10];
	  number[0] = 55;
	  number[1] = 23;
	  number[2] = 56;
	  number[3] = 25;
	  number [4] = 16;
	  number[5] = 20;
	  number[6] = 35;
	  number[7] = 65;
	  number[8] = 78;
	  number[9] = 64;
	  int fifthvalue = number[4];
	  int sixthvalue = number[5];
	double average = (fifthvalue + sixthvalue) /2.0;
	
	 System.out.printf("Average of 5th and 6th values:"+average);

	}

}
