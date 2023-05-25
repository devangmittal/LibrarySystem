package com.Library.book;

public class Book {
	private int bNO;
	private int qty;
	private int qtyI;
	private String bName;
	private String genre;

	public Book() {
	}

	public Book(int bNo, int qty, String bName, String genre) {
		this.bNO = bNo;
		this.qty = qty;
		this.qtyI = 0;
		this.bName = bName;
		this.genre = genre;
	}

	public int getbNO() {
		return bNO;
	}

	public void setbNO(int bNO) {
		this.bNO = bNO;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getQtyI() {
		return qtyI;
	}

	public void setQtyI(int qtyI) {
		this.qtyI = qtyI;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Book [bNO=" + bNO + ", qty=" + qty + ", qtyI=" + qtyI + ", bName=" + bName + ", genre=" + genre + "]";
	}

}
