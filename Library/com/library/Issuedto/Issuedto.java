package com.library.Issuedto;

import com.library.Book.Book;
import com.library.Member.Member;

public class Issuedto {
	Member m;
	Book b;

	Issuedto() {

	}

	Issuedto(Member m, Book b) {
		this.m = m;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Issuedto [Member = " + m.toString() + ", Book =" + b.toString() + "]";
	}

}
