package application;

import java.util.Locale;
import java.util.Scanner;

public class somaLinhas {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int m = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int n = sc.nextInt();
				
		double [][] mat = new double[m][n];
		double []vetor = new double[m];
		double somaLinhas;
		
		for(int i=0; i<m; i++) {
			System.out.printf("Digite os elementos da %d a. linha:\n ",i+1);
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		
		for (int i = 0; i < vetor.length; i++) {
			somaLinhas = 0;
			for(int j=0; j<n; j++) {
				somaLinhas  = somaLinhas + mat[i][j];
			}
			vetor[i] = somaLinhas;
		}		
		System.out.println("VETOR GERADO: ");
		for(int i=0; i<m; i++) {
			System.out.printf("%.1f\n", vetor[i]);					
		}
		
		
		sc.close();

	}

}
