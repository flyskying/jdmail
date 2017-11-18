package edu.csust.lw.jdmail;
/**
 * 产品的生产商
 * @author lwiii
 *
 */

import java.util.ArrayList;

public class Company {
	/**
	 * 生产商
	 */
	private String title;
	/**
	 * 产品列表
	 */
	private ArrayList<Product> products=new ArrayList<>();

	public Company(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
//		return "Company [title=" + title + ", products=" + products + "]";
		return String.format("%s", getTitle());
	}

	
	public void addProduct(Product product) {

		products.add(product);
	}
	public void showCompany() {
		System.out.println(products);
		
	}
	
}
