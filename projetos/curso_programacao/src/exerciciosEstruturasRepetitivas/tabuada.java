package exerciciosEstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		//Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10, conforme exemplo.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i,n,resultado;
		
		System.out.print("Deseja a tabuada para qual valor? ");
		n = sc.nextInt();
		
		for (i = 1; i < 10;i++) {
			resultado = n * i;
			System.out.printf("%d x %d = %d\n", n, i, resultado);
		}
		
		sc.close();
	}

}
