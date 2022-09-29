package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Products;

public class ProgramLambda2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Products> list = new ArrayList<>();

		list.add(new Products("Tv", 900.00));
		list.add(new Products("Mouse", 50.00));
		list.add(new Products("Tablet", 350.50));
		list.add(new Products("HD Case", 80.90));

		//list.removeIf(new ProductPredicate());
		//list.removeIf(Products::staticProductPredicate());
		//list.removeIf(Products::nonStaticProductPredicate());
		//Predicate<Product> pred = p -> p.getPrice() >= 100.0;
		
		double min = 100.0;
		
		list.removeIf(p -> p.getPrice() >= min);

		for (Products p : list) {
			System.out.println(p);
		}

	}

}
