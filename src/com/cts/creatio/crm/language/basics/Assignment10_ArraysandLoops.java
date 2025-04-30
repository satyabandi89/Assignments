
package com.cts.creatio.crm.language.basics;

public class Assignment10_ArraysandLoops {

	public static void main(String[] args) {
		int[] Numbers = { 12, 34, 11, 36, 87, 98, 93 };

		for (int i = 0; i < Numbers.length;i++) {
			//System.out.println(Numbers[i]);
			for (int j = 0; j < Numbers.length - i -1; j++) // j=0, j<7-0-1

				if (Numbers[j] > Numbers[j + 1]) {
					//System.out.println(j);
					//System.out.println(j + 1);

					//System.out.println(Numbers[j]);
					//System.out.println(Numbers[j + 1]);

					int temp = Numbers[j]; // 34
					//System.out.println(temp);
					//System.out.println(j);

					Numbers[j] = Numbers[j + 1];
					//System.out.println(Numbers[j + 1]);
					//System.out.println(Numbers[j]);
					Numbers[j+1] = temp;
					//System.out.println(Numbers[j + 1]);
				}

			System.out.println(Numbers[i]);

		}

	}

}