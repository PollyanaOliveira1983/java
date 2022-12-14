package application;

import java.util.Locale;
import java.util.Scanner;

public class cadaLinha {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		
		int [][] mat = new int[n][n];
		int[] maiorLinha = new int[n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("Elemento [%d,%d]: ",i,j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		int maior = 0;
				
		for(int i=0; i<mat.length; i++) {
			maior = mat[i][0];
			for(int j=0; j<mat[i].length; j++) {
				if (mat[i][j] > maior) {
					maior = mat[i][j];
				}
				
			}
			maiorLinha[i] = maior;
		}
		
		System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");
		for (int i=0; i<n; i++) {
			System.out.printf("%d\n", maiorLinha[i]);
	    }

		sc.close();
	}

}
