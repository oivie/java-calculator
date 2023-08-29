/**
 * Name: Elena Pashkova, N01587121;
 * This class is calculating savings in 6 months;
 */

package com.humber.java.assignment1;

import java.util.Scanner;

public class FinancialCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter a monthly saving amount: ");
		double savings = scanner.nextInt();
		double interestRate = 1 + (0.0375/12);

		
		double firstAmount = savings * interestRate;
		System.out.println("\nAfter the first month, the account value is " + firstAmount);
		
		double secondAmount = (savings + firstAmount) * interestRate;
		System.out.println("After the second month, the account value is " + secondAmount);
		
		double thirdAmount = (savings + secondAmount) * interestRate;
		System.out.println("After the third month, the account value is " + thirdAmount);
		
		double fourthAmount = (savings + thirdAmount) * interestRate;
		System.out.println("After the fourth month, the account value is " + fourthAmount);
		
		double fifthAmount = (savings + fourthAmount) * interestRate;
		System.out.println("After the fifth month, the account value is " + fifthAmount);
		
		double sixAmount = (savings + fifthAmount) * interestRate;
		System.out.println("After the six month, the account value is " + sixAmount);
	}
}




