package edu.csust.lw.jdmail;

public class App {

	public static void main(String[] args) {
		// 初始化
		// TODO 9个商品、四个厂商、三个分类

		// TODO 2个用户买东西
		Company ca1 = new Company("西门小卖部");
		Company ca2 = new Company("南门小卖部");
		Company ca3 = new Company("北门小卖部");
		Company ca4 = new Company("东门小卖部");
		Category ce1 = new Category("茶饮");
		Category ce2 = new Category("碳酸饮料");
		Category ce3 = new Category("零食");
		Account a1 = new Account("Alice");
		Account a2 = new Account("Bob");
		Product p1 = new Product("红茶", 5.5, ca1, ce1);
		Product p2 = new Product("绿茶", 4.0, ca1, ce1);
		Product p3 = new Product("可口可乐", 3.0, ca2, ce2);
		Product p4 = new Product("雪碧", 3.5, ca2, ce2);
		Product p5 = new Product("糕点", 29.9, ca3, ce3);
		Product p6 = new Product("辣条", 2.5, ca3, ce3);
		Product p7 = new Product("百事可乐", 2.5, ca4, ce2);
		Product p8 = new Product("薯片", 8.5, ca4, ce3);
		Product p9 = new Product("芬达", 3.5, ca4, ce2);

		Order o1 = new Order(a1, "北京");
		o1.addItem(new Item(p7, 7));
		o1.addItem(new Item(p3, 3));
		a1.addOrder(o1);
		a1.showOrder();
		
		Order o2 = new Order(a2, "上海");
		o2.addItem(new Item(p7, 7));
		o2.addItem(new Item(p3, 3));
		o2.addItem(new Item(p8, 9));
		Order o3 = new Order(a2, "上海");
		o3.addItem(new Item(p2, 7));
		o3.addItem(new Item(p3, 3));
		o3.addItem(new Item(p5, 9));
		o3.addItem(new Item(p9, 9));
		a2.addOrder(o2);
		a2.addOrder(o3);
		a2.showOrder();

		ca1.showCompany();
		ca4.showCompany();
		ce2.showProduct();
	}

}
