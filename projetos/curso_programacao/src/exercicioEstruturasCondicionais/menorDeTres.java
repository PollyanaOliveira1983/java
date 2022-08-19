package exercicioEstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class menorDeTres {

	public static void main(String[] args) {
		// Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre os três
		//números lidos. Em caso de empate, mostrar apenas uma vez.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.print("Primeiro valor: ");
		n1 = sc.nextInt();
		
		System.out.print("Segundo valor: ");
		n2 = sc.nextInt();
		
		System.out.print("Terceiro valor: ");
		n3 = sc.nextInt();
				
		if (n1 < n2 && n1 < n3) {
			System.out.printf("MENOR = %d",n1);
		}else {
			if(n2 < n1 && n2 < n3) {
				System.out.printf("MENOR = %d",n2);
			}else {
				System.out.printf("MENOR = %d",n3);
			}
		}
			
		sc.close();		
	}

}
