package soal3.solution;


/*
*
* Smell code			: Incomplete Abstraction. Ada method setStock tapi tidak ada method getStock
* potential cause(s)	: Developer lupa membuat pasangan dari sebuah method yang secara logika punya pasangan
* 						  atau menganggap belum ada requirement untuk membuatnya
* solution(s)			: Lengkapi abstraction dengan method pasangannya yaitu getStock()
*
*/


public class Product {
	private String productID;
	private String name;
	private int stock,price;
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	//solusi incomplete abstraction
	public int getStock() {
		return stock;
	}
}
