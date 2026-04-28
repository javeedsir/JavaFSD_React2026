package com.wipro.bankapp.atm;

import java.util.Scanner;

/*
 * @Author: Swathika  UI Developer
 * Desp:  UI Desing for End user
 * Date: 28-04-2026
 * 
 */

public class AtmUI {

	public static void main(String[] args) {

		IBank bank = BankUtil.getBankObj(); // abstraction

		boolean flag = true;

		Scanner scanner = new Scanner(System.in);

		while (flag) {

			System.out.println("*******WELCOME TO ATM*******");
			System.out.println("1. DEPOSIT");
			System.out.println("2. WITHDRAW");
			System.out.println("3. EXIT");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:

				bank.deposit();

				break;

			case 2:

				bank.withdraw();

				break;

			case 3:

				flag = false;
				
				IBank.m1();
				
				bank.m2();
				

				System.out.println("Thank You Visit Again..");
				break;

			default:

				System.err.println("Invalid Option");

				break;
			}

		}

	}

}
