package exerciciosEstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class validacaoDeNota {

	public static void main(String[] args) {
		//Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a
		//média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao
		//intervalo [0,10]). Cada nota deve ser validada separadamente.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Digite a primeira nota:");
		nota1 = sc.nextDouble();
		
		while (nota1 < 0 || nota1 > 10) {
			System.out.println("Valor invalido! Tente novamente:");
			nota1 = sc.nextDouble();
		}
		
		System.out.println("Digite a segunda nota:");
		nota2 = sc.nextDouble();
		while (nota2 < 0 || nota2 > 10) {
				System.out.println("Valor invalido! Tente novamente:");
				nota2 = sc.nextDouble();
		}
		
		media = 0;
		media = (nota1 + nota2) / 2.0;
	
		System.out.printf("MEDIA = %.2f\n",media);
		sc.close();
	}

}
