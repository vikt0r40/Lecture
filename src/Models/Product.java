package Models;

public class Product {
	
	public int quantity;
	public String name;
	public double price;
	public int type;
	
	public Product(String name, int quantity, double price, int type) {
		this.quantity = quantity;
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	
	//return the name of the product + detects what kind of product is and if it is drink then checks should it put ml or glass or bottle depending on type and quantity
	public String toString() {
		String measurement = "";
		
		if(this.quantity > 0) {
			if(this.type == 1 || this.type == 2) {
				//Whiskey and Vodka
				measurement = "ml";
			} else if(this.type == 3) {
				//Wine
				if(quantity == 7) {
					measurement = "Bottle";
				} else {
					measurement = "Glass";
				}
			}
		}
		
		if(measurement.length() > 0) {
			return "<html>"+this.name + " </br>" + Integer.toString(quantity) + measurement + "</html>";
		} else {
			return this.name;
		}
		
	}
	
}
