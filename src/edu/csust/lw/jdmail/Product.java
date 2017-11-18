package edu.csust.lw.jdmail;

/**
 * 商品
 * 
 * @author lwiii
 *
 */
public class Product {

	/**
	 * 商品名
	 */
	private String title;

	// BigDecimal
	/**
	 * 价格
	 */
	private double price;
	private Company company;
	private Category category;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Product(String title, double price, Company company, Category category) {
		this.title = title;
		this.price = price;
		this.company = company;
		company.addProduct(this);
		this.category = category;
		category.addProduct(this);

	}

	@Override
	public String toString() {

		return String.format(" 商品名：%6s 单价:%6s 原产公司：%6s 商品分类：%6s\n", getTitle(), getPrice(), getCompany(),
				getCategory());
	}

}
