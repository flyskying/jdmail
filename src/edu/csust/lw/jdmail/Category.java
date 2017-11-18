package edu.csust.lw.jdmail;
/**
 * 产品分类
 * @author lwiii
 *
 */

import java.util.ArrayList;

public class Category {
	/**
	 * 分类名
	 */
	private String title;
	/**
	 * 属于分类的产品
	 */

	private ArrayList<Product> products = new ArrayList<>();

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

	public Category(String title) {

		this.title = title;
	}

	public void addProduct(Product product) {
		product.setCategory(this);
		products.add(product);
	}

	@Override
	public String toString() {
		return String.format("%s", getTitle());
	}

	public void showProduct() {
		System.out.println(products);
	}

}
