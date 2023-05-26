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
		int bNo;
		int qty;
		String bName;
		String genre;
		try {
			System.out.println("Enter Book Number: ");
			bNo = sc.nextInt();
			System.out.println("Enter Qty: ");
			qty = sc.nextInt();
			System.out.println("Enter Book Name: ");
			sc.nextLine();
			bName = sc.nextLine();
			System.out.println("Enter Book Genre");
			genre = sc.nextLine();
			Book b = new Book(bNo, qty, bName, genre);
			boolean flag = books.add(b);
			if (flag) {
				System.out.println("Book Added successfully.");
			} else {
				System.out.println("Please provide valid input.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// Add a member object to members list.
	void addMember() {
		String name;
		String email;
		double fee;
		double fine;
		try {
			System.out.println("Enter Member Name: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.println("Enter Member Email Address: ");
			email = sc.nextLine();
			System.out.println("Enter Member Fee: ");
			fee = sc.nextDouble();
			System.out.println("Enter Fine: ");
			fine = sc.nextDouble();
			Member m = new Member(name, email, fee, fine);
			boolean flag = members.add(m);
			if (flag) {
				System.out.println("Member Added successfully.");
			} else {
				System.out.println("Please provide valid input.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// check is a string is numeric or not.
	// return true if string is numeric.
	boolean isNumeric(String strNum) {
		if (strNum == null) {
			return false;
		}
		try {
			int i = Integer.parseInt(strNum);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	// search a Book.
	// returns a book object if found.
	Book searchBook() {
		sc.nextLine();
		String choice = sc.nextLine();
		if (isNumeric(choice)) {
			int bookNo = Integer.parseInt(choice);
			Book tBook = new Book();
			boolean flag = false;
			for (Book b : books) {
				if (b.getbNO() == bookNo) {
					tBook = b;
					flag = true;
					break;
				}
			}
			if (flag) {
				return tBook;
			} else {
				System.out.println("Book ID not found.");
				System.out.println("Please enter a valid Book ID.");
				return null;
			}
		} else {
			Book tBook = new Book();
			boolean flag = false;
			for (Book b : books) {
				if (b.getbName().equals(choice)) {
					tBook = b;
					flag = true;
					break;
				}
			}
			if (flag) {
				return tBook;
			} else {
				System.out.println("Book name not found.");
				System.out.println("Please enter a valid Book Name.");
				return null;
			}
		}
	}

	// Remove a book from books list
	void removeBook() {
		System.out.println("To remove a Book enter Book Name or Book ID: ");
		Book b = searchBook();
		if (b != null) {
			books.remove(b);
			System.out.println("Book removed");
		}
	}

	// Remove a member from member list.
	void removeMember() {
		System.out.println("To remove a Member from Library enter Member Name or Member ID: ");
		sc.nextLine();
		String choice = sc.nextLine();
		if (isNumeric(choice)) {
			int mId = Integer.parseInt(choice);
			Member tMember = new Member();
			boolean flag = false;
			for (Member m : members) {
				if (m.getmId() == mId) {
					tMember = m;
					flag = true;
					break;
				}
			}
			if (flag) {
				members.remove(tMember);
				System.out.println("Member removed.");
			} else {
				System.out.println("Member ID not found.");
				System.out.println("Please enter a valid Member ID.");
			}
		} else {
			Member tMember = new Member();
			boolean flag = false;
			for (Member m : members) {
				if (m.getName().equals(choice)) {
					tMember = m;
					flag = true;
					break;
				}
			}
			if (flag) {
				members.remove(tMember);
				System.out.println("Member removed.");
			} else {
				System.out.println("Member name not found.");
				System.out.println("Please enter a valid Member Name.");
			}
		}
	}

	// Update Book
	void updateBook() {

	}

	// Display all Books in Library.
	void showBooks() {
		for (Book b : books) {
			System.out.println(b.toString());
		}
	}

	// Display all Members of Library.
	void showMembers() {
		for (Member m : members) {
			System.out.println(m.toString());
		}
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
			System.out.println("==============================");
			System.out.println("Hello.");
			while (true) {
				int choiceForAdminAndUser = m.displayAdminUserOption();
				if (choiceForAdminAndUser == 1) {
					int choiceForAdminWindow = m.displayAdminWindow();
					if (choiceForAdminWindow == 1) {
						// Add book to books list.
						m.addBook();
					} else if (choiceForAdminWindow == 2) {
						// Add member in members list.
						m.addMember();
					} else if (choiceForAdminWindow == 3) {
						// Remove a Book from books list.
						m.removeBook();
					} else if (choiceForAdminWindow == 4) {
						// Remove a Member from members list.
						m.removeMember();
					} else if (choiceForAdminWindow == 5) {
						m.updateBook();
					} else if (choiceForAdminWindow == 6) {
					} else if (choiceForAdminWindow == 7) {
						// display all books in book list.
						m.showBooks();
					} else if (choiceForAdminWindow == 8) {
						// display all Members of Library.
						m.showMembers();
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
