package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product3;

public class ProgramLambda3 {

	public static void main(String[] args) {
		
		List<Product3> list = new ArrayList<>();

		list.add(new Product3("Tv", 900.00));
		list.add(new Product3("Mouse", 50.00));
		list.add(new Product3("Tablet", 350.50));
		list.add(new Product3("HD Case", 80.90));

		//list.forEach(new PriceUpdate());
		//list.forEach(Product::staticPriceUpdate);
		//list.forEach(Product::nonStaticPriceUpdate);
		//Consumer<Product> cons = p -> { p.setPrice(p.getPrice() * factor)};
		
		double factor = 1.1;
		
		list.forEach(p -> p.setPrice(p.getPrice() * factor));

		list.forEach(System.out::println);

	}

}
