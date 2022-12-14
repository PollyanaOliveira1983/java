package exercicioEstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class trocoVerificado {
	
	public static void main(String[] args) {
		//Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
		//O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
		//e o valor em dinheiro dado pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido
		//ao cliente. Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem informando o
		//valor restante conforme exemplo.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidade;
		double precoProduto, dinheiroRecebido, troco, faltam, totalPagar;
		
		System.out.print("Preço unitário do produto: ");
		precoProduto = sc.nextDouble();
		
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		
		System.out.print("Dinheiro recebido: ");
		dinheiroRecebido = sc.nextDouble();
		
		totalPagar = precoProduto * quantidade;
		
		if(totalPagar > dinheiroRecebido) {
			faltam = totalPagar - dinheiroRecebido;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f\n REAIS",faltam);
		}else {
			troco = dinheiroRecebido - totalPagar;
			System.out.printf("TROCO = %.2f\n",troco);
		}
		
		sc.close();
	}
}
