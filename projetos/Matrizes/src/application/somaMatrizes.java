package application;

import java.util.Locale;
import java.util.Scanner;

public class somaMatrizes {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int m = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int n = sc.nextInt();
				
		int [][] matA = new int[m][n];
		int [][] matB = new int[m][n];
		int [][] matC = new int[m][n];
		
		
		System.out.println("Digite os elementos da matriz A: ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				matA[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite os elementos da matriz B: ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				matB[i][j] = sc.nextInt();
			}
		}
		
			
		for (int i = 0; i<m; i++) {
			for(int j=0; j<n; j++) {
				matC[i][j] = matA[i][j] + matB[i][j];
			}
			
		}		
		System.out.println("MATRIZ SOMA: ");
		
		for(int i=0; i<m; i++) {
			for (int j=0; j<n;j++) {
			System.out.printf("%d ", matC[i][j]);					
		
			}
			System.out.println();
		}
		
		sc.close();


	}

}
