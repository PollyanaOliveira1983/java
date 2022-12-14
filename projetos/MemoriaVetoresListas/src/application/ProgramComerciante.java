package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramComerciante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Serao digitados dados de quantos produtos? ");
		int n = sc.nextInt();
				
		String[] nomes = new String[n];
		double[] precoCompra = new double[n];
		double[] precoVenda = new double[n];
		double[] porcentagemLucro = new double[n];
		
		for (int i=0; i<n; i++) {
			System.out.printf("Produto %d: \n ", i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.printf("Preco de compra: ");
			precoCompra[i] = sc.nextDouble();
			System.out.printf("Preco de venda: ");
			precoVenda[i] = sc.nextDouble();
		}
				
		for (int i=0; i<n; i++) {
			porcentagemLucro[i] = (precoVenda[i] - precoCompra[i]) / precoCompra[i] * 100.0;
		}
		
		int abaixo = 0;
		int entre = 0;
		int maior = 0;
		
		for (int i=0; i<n; i++) {
			if (porcentagemLucro[i] < 10.0) {
				abaixo++;
			}	
			else if (porcentagemLucro[i] < 20.0) {
				entre++;
			}
			else {
				maior++;
			}
		}
		
		double totalCompra = 0;
		double totalVenda = 0;
		
		for (int i=0; i<n; i++) {
			totalCompra = totalCompra + precoCompra[i];
			totalVenda = totalVenda + precoVenda[i];
		}
		
		double lucrototal = totalVenda - totalCompra;
		
		
		System.err.println();
		System.out.println("RELATORIO:");
		System.out.printf("Lucro abaixo de 10%%: %d\n", abaixo);
	    System.out.printf("Lucro entre 10%% e 20%%: %d\n", entre);
	    System.out.printf("Lucro acima de 20%%: %d\n", maior);
	    System.out.printf("Valor total de compra: %.2f\n", totalCompra);
	    System.out.printf("Valor total de venda: %.2f\n", totalVenda);
	    System.out.printf("Lucro total: %.2f\n", lucrototal);

		sc.close();
	}

}
