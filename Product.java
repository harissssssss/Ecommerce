package com.array;

import java.util.Scanner;

public class Product {
	private int ProductId;
	private String ProductName;
	private double price;
	public int choice;
	Scanner sc = new Scanner(System.in);
	
	public Product() {
		this.ProductId=0;
		this.ProductName="Na";
		this.price=0.0;
		}	
	public Product(int ProductId , String ProductName , double price) {
		this.ProductId=ProductId;
		this.ProductName=ProductName;
		this.price=price;
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	void ProductList() {
		System.out.println("hello welcom to online shopping app ");
		System.out.println("list of the product");
		System.out.println("1. mobile=27000 ");
		System.out.println("2. laptop=50000 ");
		System.out.println("3. Tv=60000 ");
		System.out.println("1. Xbox=20000 ");
	}
	void GetCart() {
		boolean flag=false;
		
		while(flag!=true) {
			System.out.println("choose the product you want to buy");
			choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("mobile 'samsung galaxy s20+'=27000rs");
				price+=27000;
				System.out.println("mobile");
				break;
			case 2:System.out.println("laptop 'lenovo gaming laptop'=50000rs");
				price+=50000;
				System.out.println("laptop");
				break;
			case 3:System.out.println("Tv 'samsung tv'=60000rs");
				price+=60000;
				System.out.println("Tv");
				break;
			case 4:System.out.println("Xbox 'Xbox one s xtreame edition'=20000rs");
				price+=20000;
				System.out.println("Xbox");
				break;
			case 5:flag=true;
			default: System.out.println("thank you");
			}		
	}
		System.out.println("total bill="+price);
	}
	
}
