package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		// Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes
		//números.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y, soma;
		
		System.out.printf("Digite o valor de X: ");
		x = sc.nextInt();
		
		System.out.printf("Digite o valor de Y: ");
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.printf("SOMA = %d",soma);
		
		sc.close();
	}

}
