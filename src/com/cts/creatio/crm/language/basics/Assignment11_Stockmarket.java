package com.cts.creatio.crm.language.basics;

public class Assignment11_Stockmarket {

	public static void main(String[] args) {
		int[] Prices = { 7, 1, 5, 3, 6, 4 };
		int maxProfit = 0;
		
		for (int i = 0; i < Prices.length - 1; i++) {

			for (int j = i + 1; j < Prices.length; j++) {
				int profit = Prices[j] - Prices[i];
				
				if (profit > maxProfit) {
					maxProfit = profit;
					int buyDay = i + 1;
					int sellDay = j + 1;

				}
			}

		}
		

		if (maxProfit > 0) {

			System.out.println(" maxProfit is " + maxProfit);
		
			
			int buyDay = 0;
			System.out.println("Buy the share on day " + buyDay);
			int sellDay = 0;
			System.out.println("Sell the share on day " + sellDay);
		} else {
			System.out.println("You will lose your money, don't buy this share");

		}
	}

}
