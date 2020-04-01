import java.util.ArrayList;

import GUI.AcademyBar;
import Models.Product;
import Models.Weitress;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AcademyBar barFrame = new AcademyBar();
		barFrame.products = setupProducts();
		barFrame.weitreses = setupWeitreses();
		barFrame.setVisible(true);
		
	}
	
	
	private static ArrayList<Product> setupProducts() {
		//CREATE AND FILL ARRAY LIST WITH PRODUCTS
		ArrayList<Product> products = new ArrayList<>();
		
		
		//Whiskey
		Product a1 = new Product("Whiskey", 50, 6.0, 1);
		Product a2 = new Product("Whiskey", 100, 12.0, 1);
		Product a3 = new Product("Whiskey", 700, 80.0, 1);
		
		products.add(a1);
		products.add(a2);
		products.add(a3);
		
		//Vodka
		Product a4 = new Product("Vodka", 50, 4.0, 2);
		Product a5 = new Product("Vodka", 100, 8.0, 2);
		Product a6 = new Product("Vodka", 700, 56.0, 2);
		
		products.add(a4);
		products.add(a5);
		products.add(a6);
		
		//Water
		Product a7 = new Product("Water", 0, 2, 4);
		products.add(a7);
		
		//Coca-Cola
		Product a8 = new Product("Coca-Cola", 0, 3, 5);
		products.add(a8);
		
		//Nuts
		Product a9 = new Product("Nuts", 0, 5, 6);
		products.add(a9);
		
		//Beer
		Product a10 = new Product("Beer", 0, 4, 7);
		products.add(a10);
		
		//Wine
		Product a11 = new Product("Wine", 1, 4, 3);
		Product a12 = new Product("Wine", 7, 28, 3);
		products.add(a11);
		products.add(a12);
		
		
		return products;
	}
	
	private static ArrayList<Weitress> setupWeitreses() {
		//CREATE AND FILL ARRAY LIST WITH WEITRESES
		ArrayList<Weitress> weitreses = new ArrayList<>();
		
		Weitress a1 = new Weitress("0101", "Sydney", "Lohan");
		Weitress a2 = new Weitress("0102", "Mike", "Tyson");
		
		weitreses.add(a1);
		weitreses.add(a2);
		
		return weitreses;
	}

}
