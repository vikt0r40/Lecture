package Models;

import java.util.ArrayList;

public class Order {

	public int tableNumber;
	public ArrayList<Product> products;
	
	public Order(int tableNumber, ArrayList<Product> products) {
		this.tableNumber = tableNumber;
		this.products = products;
	}
	
	
	public String calculateBill() {
		
		double fullPrice = 0;
		for (int i = 0; i < this.products.size(); i++) {
			Product currentProduct = this.products.get(i);
			fullPrice += currentProduct.price;
		}
		
		return Double.toString(fullPrice) + " BGN";
	}
	public String calculateBillWithoutCurrency() {
		
		double fullPrice = 0;
		for (int i = 0; i < this.products.size(); i++) {
			Product currentProduct = this.products.get(i);
			fullPrice += currentProduct.price;
		}
		
		return Double.toString(fullPrice);
	}
	
}
