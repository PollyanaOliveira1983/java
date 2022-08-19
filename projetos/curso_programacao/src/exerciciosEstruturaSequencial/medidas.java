package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class medidas {

	public static void main(String[] args) {
		// Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar (imprimir os dados
		//com quatro casas decimais):
		//	a) a área do quadrado que tem lado A
		//	b) a área do triângulo retângulo que base A e altura B
		//	c) a área do trapézio que tem bases A e B, e altura C
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaTriangulo, areaQuadrado, areaTrapezio;
		
		System.out.printf("Digite a medida A: ");
		A = sc.nextDouble();
		
		System.out.printf("Digite a medida B: ");
		B = sc.nextDouble();
		
		System.out.printf("Digite a medida C: ");
		C = sc.nextDouble();
		
		areaQuadrado = A * A;
		
		System.out.printf("AREA DO QUADRADO = %.4f\n", areaQuadrado);
				
		areaTriangulo = A * B / 2;
		
		System.out.printf("AREA DO TRIANGULO = %.4f\n", areaTriangulo);
		
		areaTrapezio = (A + B) * C / 2;
		
		System.out.printf("AREA DO TRAPEZIO = %.4f\n", areaTrapezio);
		
		sc.close();
	}

}
