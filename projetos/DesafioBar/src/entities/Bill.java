package entities;

public class Bill {
	
	public static double COUVERT = 4.0;
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double cover() {
		return COUVERT;
	}
	
	public double feeding() {
		return (beer * 5.00) + (softDrink * 3.00) + (barbecue * 7.00);
	}
	
	public double ticket() {
		if (gender == 'F') {
			return 8.00;
		}
		else {
			return 10.00;
		}
	}
	
	public double total() {
		if(feeding() > 30.00) {
			return feeding() + ticket();
		}	
		else {
			return feeding() + cover() + ticket();
		}
	}
}
