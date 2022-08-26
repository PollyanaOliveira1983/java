package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMaiorPosicao {

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
		
		double maior = 0;
		int indice = 0;
		for(int i=0; i<n; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
				indice = i;
			}
		}
		
		System.out.println();
		
		System.out.printf("MAIOR VALOR =  %.1f\n" ,maior);
		
		System.out.printf("POSICAO DO MAIOR VALOR = %d", indice);
		sc.close();

	}

}
