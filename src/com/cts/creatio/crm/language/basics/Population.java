package com.cts.creatio.crm.language.basics;

public class Population {

	public static void main(String[] args) {
		int Population = 12000;
		if (Population >= 1000000) {
			System.out.println("metrocity");
		} else if (Population >= 500000 && Population < 1000000) {
			System.out.println("City");
		} else if (Population >= 100000 && Population < 500000) {
			System.out.println("Town");
		} else if (Population >= 5000 && Population < 100000) {
			System.out.println("Mandal");
		} else {
			System.out.println("village");

		}
	}
}
