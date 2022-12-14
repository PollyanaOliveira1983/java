package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramMaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
				
		 String[] nome = new String[n];
		 int[] idades = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa: \n ", i+1);
			System.out.print("Nome: ");
			nome[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			
		}
		
		int maisVelha = idades[0];
		int posicao = 0;
		
		for (int i=1; i<n; i++) {
			if (idades[i] > maisVelha) {
				maisVelha = idades[i];
				posicao = i;
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s\n", nome[posicao]);
		
		sc.close();
	}

}
