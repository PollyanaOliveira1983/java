package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class ProgramTax {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<TaxPayer>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double heathExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, heathExpenditures));
						
			}
			else {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();	
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		
		for (TaxPayer tPayer : list) {
			System.out.println(tPayer.getName() 
					+ ": $"
					+ String.format("%.2f", tPayer.tax()));
		}
		
		System.out.println();
		double sum = 0.0;
		for (TaxPayer tPayer : list) {
			sum += tPayer.tax();
		}
		System.out.print("TOTAL TAXES: " + String.format("%.2f", sum));
		sc.close();
	}

}
