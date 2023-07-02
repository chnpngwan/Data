package com.book.model;

/**
 * @author ChnpngWng
 *
 * @date   Mar 6, 20238:43:10 PM
 */
public class Book {
	private int ingid  ;
	private String name   ;
	private String author ;
	private double price  ;
	private String type   ;
	/**
	 * 
	 */
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param ingid
	 * @param name
	 * @param author
	 * @param price
	 * @param type
	 */
	public Book(int ingid, String name, String author, double price, String type) {
		super();
		this.ingid = ingid;
		this.name = name;
		this.author = author;
		this.price = price;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Book [ingid=" + ingid + ", name=" + name + ", author=" + author + ", price=" + price + ", type=" + type
				+ "]";
	}
	/**
	 * @return the ingid
	 */
	public int getIngid() {
		return ingid;
	}
	/**
	 * @param ingid the ingid to set
	 */
	public void setIngid(int ingid) {
		this.ingid = ingid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
}
