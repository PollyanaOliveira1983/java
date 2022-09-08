package model.services;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {

	private Double pricePerDay;
	private Double pricePerHour;
	
	private TaxService taxService;

	public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		//gettime pega o valor em milessegundos
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		//dif em horas  milessegundo em segundos / 1000 / minutos /60 horas /60
		double hours = (double)(t2 - t1) / 1000 / 60 / 60;
		
		double basicPayment;
		//Math.ceil() arredonda para mais as horas
		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours / 24);
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
