package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class troco {

	public static void main(String[] args) {
		// Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
		//O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
		//e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
		//mostrar o valor do troco a ser devolvido ao cliente.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double precoUnitario, dinheiro, troco;
		int quantidade;
		
		System.out.printf("Preço unitário do produto: ");
		precoUnitario = sc.nextDouble();
		
		System.out.printf("Quantidade comprada: ");
		quantidade = sc.nextInt();
		
		System.out.printf("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		
		troco = dinheiro - (precoUnitario * quantidade) ;
		
		System.out.printf("TROCO = %.2f",troco);
		
		sc.close();
	}

}
