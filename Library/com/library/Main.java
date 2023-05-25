package com.library;

// Import 
import com.library.*;
import java.util.Scanner;

public class Main {
	// Data Members
	final String id;
	final String pass;
	Scanner sc;

	// Constructor of Main class.
	Main() {
		this.id = "devang";
		this.pass = "mittal";
		sc = new Scanner(System.in);

	}

	// Login form method to check the credentials of the user.
	// returns false if user id and password does not match.
	boolean loginForm() {
		// Ask user for ID.
		System.out.println("Enter your ID: ");
		String id = sc.nextLine();

		// converts user input to lower case.
		id = id.toLowerCase();

		// Ask user for Password.
		System.out.println("Enter your Password: ");
		String pass = sc.nextLine();

		// Checks if user id and password are matched.
		if (this.id.equals(id) && this.pass.equals(pass)) {
			return true;
		}

		return false;
	}

	// Display option for admin window or user window.
	// returns the selected option.
	int displayAdminUserOption() {
		int choice;
		System.out.println("Choose an option to continue: ");
		System.out.println("Press 1 for Admin Window.");
		System.out.println("Press 2 for User Window.");
		System.out.println("Press any other key to Exit our Library.");
		try {
			choice = sc.nextInt();
			return choice;
		} catch (Exception e) {
			System.out.println("Please type integer only");
		}
		return -1;

	}

	public static void main(String[] args) {
		// Create object of Main class.
		Main m = new Main();

		// Welcomes the user.
		System.out.println("Welcome to our Library System.");

		// Login form to validate user.
		boolean successful = m.loginForm();

		if (!successful) {
			System.out.println("User ID and password does not match.");
			System.out.println("Thank you for using out Library services.");
		} else {
			while (true) {
				int choice = m.displayAdminUserOption();
				if (choice == 1) {

				} else if (choice == 2) {
				} else {
					break;
				}
			}
		}

	}

}
