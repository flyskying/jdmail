package edu.csust.lw.jdmail;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * 订单
 * 
 * @author lwiii
 *
 */
public class Order {

	private Account account;
	private Date time;
	/**
	 * 送货地
	 */
	private String address;
	/**
	 * 总金额
	 */
	private double total;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Order(Account account, String address) {
		this.account = account;
		this.address = address;
		time = new Date();
	}

	// 订单项
	private ArrayList<Item> items = new ArrayList<>();

	public String getTime() {
		return new SimpleDateFormat("MM/dd:HH/mm").format(time);
	}

	@Override
	public String toString() {
		return String.format("姓名：%s\n 订单时间：%s\n 发货地址：%s\n 总金额：%s\n 商品：%s\n\n\n", getAccount(), getTime(), getAddress(),
				total, items);
	}

	public void addItem(Item i) {
		items.add(i);
		total = total + i.addtotal();
	}

}
