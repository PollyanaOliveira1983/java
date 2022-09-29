package util;

import java.util.function.Predicate;

import entities.Products;

public class ProductPredicate implements Predicate<Products> {
	
	@Override
	public boolean test(Products p) {
		return p.getPrice() >= 100.0;
	}
	
}
