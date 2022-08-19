package exercicioEstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		// Fazer um programa para ler dois números inteiros, e dizer se um número é múltiplo do outro. Os
		//números podem ser digitados em qualquer ordem.
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		
		System.out.println("Digite dois numeros inteiros: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x % y == 0 || y % x == 0) {
			System.out.println("São multiplos");
		}
		else {
			System.out.println("Não são multiplos");
		}
		sc.close();

	}

}
