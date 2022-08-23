package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramCambio {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o valor do dolar? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("Quantos dólares serão comprados? ");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReal(amount, dollarPrice);
		
		System.out.printf("Valor a ser pago em reais = %.2f%n", result);

		sc.close();
	}

}
