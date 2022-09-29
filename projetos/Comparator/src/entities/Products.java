package entities;

public class Products {
	
	private String name;
	private Double price;
	
	public Products(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static boolean staticProductPredicate(Products p) {
		return p.getPrice() >= 100.0;
	}
	
	public boolean nonStaticProductPredicate() {
		return price >= 100.0;
	}
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

}
