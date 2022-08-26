package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMediaPares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
				
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			 
		}
		
		int contador = 0;
		double media = 0;
		int soma = 0;
		for(int i=0; i<n; i++) {
			if (vect[i] % 2 == 0) {
			contador++;
			soma = vect[i] + soma;
			}
		}
		
		media = (double)soma / contador;
		
		if (contador == 0) {
			System.out.println("NENHUM NUMERO PAR ");
		}
		else {
			
			System.out.printf("MEDIA DOS PARES:  %.1f\n", media);
		}
		
		
		sc.close();
	}

}
