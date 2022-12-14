package application;

import java.util.Locale;
import java.util.Scanner;

public class acimaDiagonal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		int [][] mat = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("Elemento [%d,%d]: ",i,j);
				mat[i][j] = sc.nextInt();
			}
		}
		
		int soma = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if (i < j) {
	                soma = soma + mat[i][j];
	            }
			}	
		}
		
		System.out.println();
		System.out.printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = %d\n", soma);
		
		sc.close();
	}

}
