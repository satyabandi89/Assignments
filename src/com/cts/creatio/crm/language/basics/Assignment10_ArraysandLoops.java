
package com.cts.creatio.crm.language.basics;

public class Assignment10_ArraysandLoops {

	public static void main(String[] args) {
		int[] Numbers = { 12, 34, 11, 36, 87, 98, 93 };

		for (int i = 0; i < Numbers.length;i++) {
			//System.out.println(Numbers[i]);
			for (int j = i+1; j < Numbers.length; j++)

				if (Numbers[i] < Numbers[j]) {
					//System.out.println(j);
					//System.out.println(j + 1);

					//System.out.println(Numbers[j]);
					//System.out.println(Numbers[j + 1]);

					int temp = Numbers[i]; // 12
				

					Numbers[i] = Numbers[j];
					//System.out.println(Numbers[j + 1]);
					//System.out.println(Numbers[j]);
					Numbers[j] = temp;
				
				}

			System.out.println("Second largest number is :"+Numbers[1]);
			System.out.println("Third largest number is :" + Numbers[2]);

		}

	}

}