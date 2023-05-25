package com.library;

// Import 
import com.library.Book.Book;
import com.library.Member.Member;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	// Data Members
	final String id;
	final String pass;
	List<Book> books;
	List<Member> members;
	Scanner sc;

	// Constructor of Main class.
	Main() {
		this.id = "devang";
		this.pass = "mittal";
		books = new ArrayList<Book>();
		members = new ArrayList<Member>();
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

	// Methhod to Display option for admin window or user window.
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

	// Method to display Admin window.
	// Returns int.
	int displayAdminWindow() {
		int choice;
		System.out.println("Choose an option to continue: ");
		System.out.println("Press 1 to Add a book in Library.");
		System.out.println("Press 2 to Add a Member in Library.");
		System.out.println("Press 3 to Remove a Book from Library.");
		System.out.println("Press 4 to Remove a Member from Library.");
		System.out.println("Press 5 to Update a Book from Library.");
		System.out.println("Press 6 to Update a Member from Library.");
		System.out.println("Press 7 to Show all Books available in Library.");
		System.out.println("Press 8 to Show all Members of Library.");
		System.out.println("Press any other key to Exit our Library.");
		try {
			choice = sc.nextInt();
			return choice;
		} catch (Exception e) {
			System.out.println("Please type integer only");
		}
		return -1;
	}

	// Add a book object to books arraylist.
	void addBook() {

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
			System.out.println("Hello.");
			while (true) {
				int choiceForAdminAndUser = m.displayAdminUserOption();
				if (choiceForAdminAndUser == 1) {
					int choiceForAdminWindow = m.displayAdminWindow();
					if (choiceForAdminWindow == 1) {

					} else if (choiceForAdminWindow == 2) {
					} else if (choiceForAdminWindow == 3) {

					} else if (choiceForAdminWindow == 4) {
					} else if (choiceForAdminWindow == 5) {

					} else if (choiceForAdminWindow == 6) {
					} else if (choiceForAdminWindow == 7) {

					} else if (choiceForAdminWindow == 8) {
					} else {
						System.out.println("Thank you for using our Library System Admin Window.");
						break;
					}
				} else if (choiceForAdminAndUser == 2) {
				} else {
					System.out.println("Thank you for Visiting Us.");
					break;
				}
			}
		}

	}

}
