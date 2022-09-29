package util;

import java.util.function.Function;

import entities.Product4;

public class UpperCaseName implements Function<Product4, String> {

	@Override
	public String apply(Product4 p) {
		return p.getName().toUpperCase();
	}

}
