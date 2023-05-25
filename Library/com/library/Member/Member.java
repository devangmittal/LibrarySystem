package com.library.Member;

public class Member {
	private int mId;
	private static int m;
	private String name;
	private String email;
	private double fee;
	private double fine;

	public Member() {

	}

	public Member(String name, String email, double fee, double fine) {
		m++;
		this.mId = m;
		this.name = name;
		this.email = email;
		this.fee = fee;
		this.fine = fine;
	}

	public int getmId() {
		return mId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}

	@Override
	public String toString() {
		return "Member [mId=" + mId + ", name=" + name + ", email=" + email + ", fee=" + fee + ", fine=" + fine + "]";
	}

}
