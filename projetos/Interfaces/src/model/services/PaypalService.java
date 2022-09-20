package model.services;

public class PaypalService implements OnlinePaymentService{
	
	private static final double PAYMENT_FEE = 0.02;
	private static final double MONTLHY_INTEREST = 0.01;
	
	@Override
	public double paymentFee(double amount) {
		return amount * PAYMENT_FEE;
	}


	@Override
	public double interest(double amount, int months) {
		return amount * months * MONTLHY_INTEREST;
	}
}
