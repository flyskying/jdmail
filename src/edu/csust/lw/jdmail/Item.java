package edu.csust.lw.jdmail;

/**
 * 订单项
 * 
 * @author lwiii
 *
 */
public class Item {

	/**
	 * 商品
	 */
	private Product product;
	/**
	 * 数量
	 */
	private int quantity;

	public Item(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		// return "Item [product=" + product + ", quantity=" + quantity + "]";
		return String.format("%s 商品数量为%s\n", getProduct(), getQuantity());
	}

	public double addtotal() {
		double total = product.getPrice() * getQuantity();
		return total;
	}
}
