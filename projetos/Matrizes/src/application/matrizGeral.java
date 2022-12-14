package application;

import java.util.Locale;
import java.util.Scanner;

public class matrizGeral {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = sc.nextInt();
		double [][] mat = new double[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("Elemento [%d,%d]: ",i,j);
				mat[i][j] = sc.nextDouble();
			}
		}
		
		
		double soma = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
			if(mat[i][j] > 0) {
				soma = mat[i][j] + soma;
			}
			}
		}
		System.out.println();
		System.out.printf("SOMA DOS POSITIVOS: %.1f\n",soma);
		System.out.println();
		
		System.out.print("Escolha uma linha: ");
		int linha = sc.nextInt();
		
		System.out.printf(" LINHA ESCOLHIDA: ");
		for(int i=0; i<n; i++) {
			System.out.printf("%.1f " ,mat[linha][i]);
			
		}
		
		System.out.println();
		System.out.print("\n Escolha uma coluna: ");
		int coluna = sc.nextInt();
		
		System.out.printf(" COLUNA ESCOLHIDA: ");
		for(int i=0; i<n; i++) {
			System.out.printf("%.1f " ,mat[i][coluna]);
		}
		
		
		System.out.println();
		System.out.print(" \nDIAGONAL PRINCIPAL: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
				
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(mat[i][j] < 0) {
					 mat[i][j] = Math.pow(mat[i][j], 2);
				}
			}
		}
		
		System.out.println("\n\nMATRIZ ALTERADA:");

	    for (int i=0; i<n; i++) {
	        for (int j=0; j<n; j++) {
	        	System.out.printf("%.1f ", mat[i][j]);
	        }
			System.out.println();
	    }
		
		sc.close();
	}

}
