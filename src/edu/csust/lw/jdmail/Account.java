package edu.csust.lw.jdmail;

import java.util.ArrayList;

public class Account {

	/**
	 * 用户名
	 */
	private String name;

	public Account(String name) {
		this.name = name;

	}

	/**
	 * 订单
	 */
	private ArrayList<Order> orders = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return String.format("%s", name);
	}

	public void orders(Order account, Order address) {
		orders.add(account);
		orders.add(address);
	}

	public void showOrder() {
		System.out.println(name);
		System.out.println("-------------------");
		System.out.printf("订单%d\n\n%s\n", orders.size(), getOrders());
		System.out.println("-------------------");
	}

	public void addOrder(Order o) {
		orders.add(o);

	}
}
