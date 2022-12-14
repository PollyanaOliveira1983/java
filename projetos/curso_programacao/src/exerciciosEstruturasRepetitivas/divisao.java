package exerciciosEstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class divisao {

	public static void main(String[] args) {
		//Escreva um algoritmo que leia um número inteiro N, e depois repita N vezes: ler dois números e
		//imprimir o resultado da divisão do primeiro pelo segundo. Caso não for possível, mostre a mensagem
		//“DIVISAO IMPOSSIVEL”.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double numerador, denominador, resultado;
		
		resultado = 0; 
		
		System.out.print("Quantos casos voce vai digitar? ");
		n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.print("Entre com o numerador: ");
			numerador = sc.nextDouble();
			
			System.out.print("Entre com o denominador: ");
			denominador = sc.nextDouble();
			
			if (denominador == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			}
			else {
				resultado = numerador / denominador;
				System.out.printf("DIVISAO %.2f\n",resultado);
			}
		}
		
		sc.close();
	}

}
