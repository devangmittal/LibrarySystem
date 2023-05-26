package com.library.Issuedto;

import com.library.Book.Book;
import com.library.Member.Member;

public class Issuedto {
	private Member m;
	private Book b;

	public Issuedto() {

	}

	public Issuedto(Member m, Book b) {
		this.m = m;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Issuedto [Member = " + m.getName() + ", Book =" + b.getbName() + "]";
	}

}
