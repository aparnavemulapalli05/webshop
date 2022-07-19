package com.advance.collections.arraylist;

import java.util.Objects;

public class Product {
	
	private String name;
	private double price;
	private String description;
	
	
	public Product(String name, double price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean equals(Object o) {
		if (this==o)return true;
		if(o == null|| getClass() !=o.getClass()) return false;
		Product product=(Product) o;
		return Double.compare(product.price, price)==0 && Objects.equals(name, product.name)&& Objects.equals(description, product.description);
	}
	
	public int hashCode() {
		return Objects.hash(name,price,description);
	}
	
	public String toString() {
		return "product{"+
	"name='" +name+ '\''+
	 ", price="+  price +
	 ", description='"+description+'\''+
	 '}';
	 
	}
	
	
	

}
