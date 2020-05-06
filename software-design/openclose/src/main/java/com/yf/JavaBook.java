package com.yf;

/**
 * @author yf
 */
public class JavaBook implements Book {

	private String name;
	private Double price;
	private String type;

	public JavaBook(String name, Double price, String type){
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public Double getPrice() {
		return this.price;
	}

	public String getType() {
		return this.type;
	}
}
