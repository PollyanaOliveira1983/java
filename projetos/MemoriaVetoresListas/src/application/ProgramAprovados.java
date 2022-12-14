package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAprovados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
				
		 String[] nome = new String[n];
		 double[] nota01 = new double[n];
		 double[] nota02 = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n ", i+1);
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota01[i] = sc.nextDouble();
			nota02[i] = sc.nextDouble();
			
		}
		
		System.out.println("Alunos aprovados: ");
		double soma = 0;
		double media = 0;
		
		for (int i=0; i<n; i++) {
			soma = nota01[i] + nota02[i];
			media =  soma / 2;
			if (media >= 6.0) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();

	}

}
