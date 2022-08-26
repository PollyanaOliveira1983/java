package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAbaixoDaMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt(); 
		
		double[] vect = new double[n];
				
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for (int i=0; i<n; i++) {
			soma = vect[i] + soma; 
		}
		
		double media = soma / n;
		
		System.out.printf("MEDIA DO VETOR = %.3f%n" , media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for(int i=0; i<n; i++) {
			if (vect[i] < media) {
				System.out.printf(" %.1f%n" , vect[i]);
			}
		}
		sc.close();

	}

}
