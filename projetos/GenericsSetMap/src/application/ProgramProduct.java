package application;

import java.util.HashMap;
import java.util.Map;

import entities.ProductMap;

public class ProgramProduct {

	public static void main(String[] args) {

		Map<ProductMap, Double> stock = new HashMap<>();
		
		ProductMap p1 = new ProductMap("Tv", 900.0);
		ProductMap p2 = new ProductMap("Notebook", 1200.0);
		ProductMap p3 = new ProductMap("Tablet", 400.0);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);
		
		ProductMap ps = new ProductMap("Tv", 900.0);
		
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

	}

}
