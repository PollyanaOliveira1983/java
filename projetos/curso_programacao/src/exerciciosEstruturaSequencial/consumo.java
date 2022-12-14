package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class consumo {

	public static void main(String[] args) {
		// Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de
		//combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo
		//médio do carro, com três casas decimais.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double distancia, combustivelGasto, totalCombustivel;
		
		System.out.printf("Distancia percorrida: ");
		distancia = sc.nextDouble();
		
		System.out.printf("Combustível gasto: ");
		combustivelGasto = sc.nextDouble();
		
		totalCombustivel =  distancia / combustivelGasto;
		
		System.out.printf("Consumo medio = %.3f",totalCombustivel);
		
		sc.close();
	}

}
