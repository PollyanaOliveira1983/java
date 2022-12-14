package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Alturas;


public class ProgramAlturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		double menor, sum, media;
		
		Alturas[] vect = new Alturas[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa: \n ", i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			vect[i] = new Alturas(name, idade, altura);
		}
		
		sum = 0;
		for (int i=0; i<n; i++) {
			sum += vect[i].getAltura(); 
		}
		
		media = sum / n;
		System.out.printf("Altura média: %.2f\n", media);
		
		menor = 0;
		
		for (int i=0; i<n; i++) {
		if (vect[i].getIdade() < 16) {
			menor ++;
			}
		}
		double percentualDeMenores = (menor/ n) * 100;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualDeMenores);

		for (int i=0; i<n; i++) {
			if (vect[i].getIdade() < 16) {
				System.out.printf("%s\n", vect[i].getName());
			}
		}
		sc.close();
	}

}
