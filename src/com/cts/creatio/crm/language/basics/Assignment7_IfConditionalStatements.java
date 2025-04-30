package com.cts.creatio.crm.language.basics;

public class Assignment7_IfConditionalStatements {

	public static void main(String[] args) {

		String CustomerName = "John Doe";
		int creditscore = 680;
		double Customer_Income = 55000.0;
		boolean isemployed = true;
		double debtToIncomeRatio = 35.0;

		if (creditscore >= 750) {
			// If the credit score is above 750, the loan is automatically approved
			System.out.println("The loan is approved");
		} else if (creditscore >= 650 && creditscore < 750) {
			// If the credit score is between 650 and 750, additional checks are performed.

			if (Customer_Income >= 50000) {
				// If the customer’s income is 50,000, the system checks employee status

				if (isemployed = true) {
					// Check debt-to-income ratio
					// }
					if (debtToIncomeRatio < 40.0) {
						// If DTI ratio is less than 40%, loan is approved
						System.out.println("Loan approved: Above all criteria");
					} else {
						// If the DTI ratio is 40% or greater, the loan is denied.
						System.out.println("The loan is denied: due to high DTI ratio");
					}

				}
			}
		} else {
			// If the credit score is below 650, the loan is denied.
			System.out.println("loan denied: credit score is below 650");

		}

	}
}
