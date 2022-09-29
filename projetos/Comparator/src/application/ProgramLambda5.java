package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product5;
import services.ProductService;

public class ProgramLambda5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product5> list = new ArrayList<>();

		list.add(new Product5("Tv", 900.00));
		list.add(new Product5("Mouse", 50.00));
		list.add(new Product5("Tablet", 350.50));
		list.add(new Product5("HD Case", 80.90));

		ProductService ps = new ProductService();
		
		//double sum = ps.filteredSum(list);
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
 
		System.out.println("Sum = " + String.format("%.2f", sum));

	}

}
