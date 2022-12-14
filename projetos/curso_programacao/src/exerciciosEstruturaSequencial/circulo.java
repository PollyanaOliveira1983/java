package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class circulo {

	public static void main(String[] args) {
		// Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do
		//círculo com três casas decimais. A fórmula da área do círculo é a seguinte: area = π. r2. Você pode
		//usar o valor de π fornecido pela biblioteca da sua linguagem de programação, ou então, se preferir, use
		//diretamente o valor 3.14159.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi, raio, area;
		
		pi = 3.14159;
		
		System.out.printf("Digite o valor do raio do circulo: ");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		
		System.out.printf("AREA = %.3f", area);
		
		sc.close();
	}

}
