package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class idades {

	public static void main(String[] args) {
		// Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
		//nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome1, nome2;
		double idade1, idade2, media, soma;
		
		System.out.println("Dados da primeira pessoa: ");
		
		System.out.print("Nome: ");
		nome1 = sc.nextLine();
		
		System.out.print("Idade: ");
		idade1 = sc.nextDouble();
		
		System.out.println("Dados da segunda pessoa: ");
		
		System.out.print("Nome: ");
		nome2 = sc.nextLine();
		
		sc.nextLine(); // --------------> limpeza de buffer
				
		System.out.print("Idade: ");
		idade2 = sc.nextDouble();
		
		soma = idade1 + idade2;
		media = soma / 2;
		
		System.out.printf("A idade média de %s e %s é de %.1f anos",nome1, nome2, media);
		
		
		sc.close();
	}

}
