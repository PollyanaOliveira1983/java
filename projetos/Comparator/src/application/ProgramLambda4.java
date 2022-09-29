package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product4;

public class ProgramLambda4 {

	public static void main(String[] args) {
		
		List<Product4> list = new ArrayList<>();

		list.add(new Product4("Tv", 900.00));
		list.add(new Product4("Mouse", 50.00));
		list.add(new Product4("Tablet", 350.50));
		list.add(new Product4("HD Case", 80.90));

		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList();
		//List<String> names = list.stream().map(Product4::staticUpperCaseName).collect(Collectors.toList();
		//List<String> names = list.stream().map(Product4::nonStaticUpperCaseName).collect(Collectors.toList();
		
		//Function<Product4, String> func = p -> p.getName().toUpperCase();
		////List<String> names = list.stream().map(func).collect(Collectors.toList();
		
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println);

	}

}
