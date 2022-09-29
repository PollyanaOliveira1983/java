package services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product5;

public class ProductService {

	public double filteredSum(List<Product5> list, Predicate<Product5> criteria) {
		double sum = 0.0;
		for (Product5 p : list) {
			if (criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
