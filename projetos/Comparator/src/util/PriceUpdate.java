package util;

import java.util.function.Consumer;

import entities.Product3;

public class PriceUpdate implements Consumer<Product3> {

	@Override
	public void accept(Product3 p) {
		p.setPrice(p.getPrice() * 1.1);
	}
}
