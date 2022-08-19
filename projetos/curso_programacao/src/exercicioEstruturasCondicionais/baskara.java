package exercicioEstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class baskara {

	public static void main(String[] args) {
		// Fazer um programa para ler os três coeficientes de uma equação do segundo grau. Usando a fórmula
		//de Baskara, calcular e mostrar os valores das raízes x1 e x2 da equação com quatro casas decimais,
		//conforme exemplo. Se a equação não possuir raízes reais, mostrar uma mensagem.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, x1, x2, delta;
		
		System.out.print("Coeficiente a: ");
		a = sc.nextDouble();
		
		System.out.print("Coeficiente b: ");
		b = sc.nextDouble();
		
		System.out.print("Coeficiente c: ");
		c = sc.nextDouble();
		
		delta = Math.pow(b, 2) - 4 * a * c;
		
		if (delta < 0) {
			System.out.println("Esta equacao nao possui raizes reais");
		}
		else {
		x1 = (-b + Math.sqrt(delta)) / 2 * a;
		
		System.out.printf("X1 =  %.4f\n", x1);
			
		
		x2 = (-b - Math.sqrt(delta)) / 2 * a;
		
		System.out.printf("X2 = %.4f\n", x2);
		}
		sc.close();
	}

}
