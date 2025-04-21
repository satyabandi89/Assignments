package com.cts.creatio.crm.language.basics;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment8_LoopsConditionalStatements {

	public static void main(String[] args) {

		Integer[] Amount = new Integer[8];
		Amount[0] = 5000;
		Amount[1] = -2000;
		Amount[2] = 3000;
		Amount[3] = -15000;
		Amount[4] = -200;
		Amount[5] = -300;
		Amount[6] = 4000;
		Amount[7] = -3000;

		System.out.println("Total number of credit and debit transactions:" + Amount.length);
		int Total_Credited = 0;
		int Total_Debited = 0;
		for (int i = 0; i < Amount.length; i++) {

			if (Amount[i] > 0) {
				Total_Credited += Amount[i];

			} else {
				Total_Debited += Amount[i];
			}
			if (Amount[i] >= 10000 || Amount[i] <= -10000) {

				System.out.println("Suspicious credit debit Transaction with Amount: " + Amount[i]);
				int j = 0;
				j = j + 1;
				System.out.println("Total Suspicious Transactions : " + j);
			}

		}
		System.out.println("Total credit Amount: " + Total_Credited);
		System.out.println("Total debit Amount: " + Total_Debited);
		System.out.println("Total Remaining Bank Balance: " + (Total_Debited + Total_Credited));

	}

}
