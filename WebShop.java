package com.advance.collections.arraylist;

import java.util.ArrayList;

public class WebShop {

	public static void main(String[] args) {
		ArrayList<Product> products=new ArrayList();
		

		products.add(new Product( "iphone",  10.0,  "nice product"));
		products.add(new Product( "ipod",  11.0,  "useful product"));
		products.add(new Product( "ipod",  11.0,  "useful product"));
		
		
		products.add(1,(new Product( "video player",  20.0,  "thinks fast"))); 
		
		products.remove(2);
		
		products.set(0,(new Product( "laptop",  130.0, " writing the programs"))); 
		
		System.out.println("products");
		for(Product product:products) {
		System.out.println("Product");
		}
		
		System.out.println("the third element in the list:");
		System.out.println(products.get(2));
		
		System.out.println(products.size() + "products can be found in the list");

	}

}
