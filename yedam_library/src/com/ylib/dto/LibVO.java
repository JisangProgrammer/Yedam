package com.ylib.dto;

public class LibVO {
	private int bId;
	private String bName;
	private String writer;
	private String publisher;
	private String location;
	private int amount;
	private String comments;
	
	public LibVO() {}
	public LibVO(int bId, String bName, String writer, String publisher, String location, int amount, String comments) {
		this.bId = bId;
		this.bName = bName;
		this.writer = writer;
		this.publisher = publisher;
		this.location = location;
		this.amount = amount;
		this.comments = comments;
	}
	
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
}
