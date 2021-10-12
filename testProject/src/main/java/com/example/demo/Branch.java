package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Branch {
	private int bid;
	private String bname;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "Branch [bid=" + bid + ", bname=" + bname + "]";
	}
	public void show() {
		System.out.println("In Branch Show");
	}
}
