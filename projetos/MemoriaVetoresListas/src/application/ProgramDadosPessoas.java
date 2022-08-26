package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramDadosPessoas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
				
		char[] generos = new char[n];
		double[] altura = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Altura da %da pessoa:  ", i+1);
			sc.nextLine();
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa:  ", i+1);
			generos[i] = sc.next().charAt(0);
			
		}
		
		double menorALtura = altura[0];
		for (int i=1; i<n; i++) {
			if(altura[i] < menorALtura) {
				menorALtura = altura[i];
			}
		}
		
		double maiorAltura = altura[0];
		for (int i=1; i<n; i++) {
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
		}
		
		int contadorMulheres = 0;
		double soma = 0;
		double media = 0;
		for (int i=0; i<n; i++) {
			if(generos[i] == 'F') {
				soma = soma + altura[i];
				contadorMulheres++;
			}
		}
		media = soma / contadorMulheres;
		
		int contadorHomens = 0;
		for (int i=0; i<n; i++) {
			if(generos[i] == 'M') {
				contadorHomens++;
			}
		}
		
		System.out.printf("Menor altura = %.2f\n", menorALtura);
		System.out.printf("Maior altura = %.2f\n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f\n", media);
		System.out.printf("Numero de homens = %d\n", contadorHomens);
		sc.close();
	}

}
