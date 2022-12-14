package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
		// Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
		//da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double baseRetangulo, alturaRetangulo, areaRetangulo, perimetroRetangulo, diagonalRetangulo;
		
		System.out.printf("Base do retangulo: ");
		baseRetangulo =  sc.nextDouble();
		
		System.out.printf("Altura do retangulo: ");
		alturaRetangulo = sc.nextDouble();
		
		areaRetangulo = baseRetangulo * alturaRetangulo;
		
		System.out.printf("AREA = %.4f\n", areaRetangulo);
		
		perimetroRetangulo = 2 * (baseRetangulo + alturaRetangulo);
		
		System.out.printf("PERIMETRO = %.4f\n", perimetroRetangulo);
		
		diagonalRetangulo = Math.sqrt(Math.pow(alturaRetangulo, 2) + Math.pow(baseRetangulo, 2));
				
		System.out.printf("DIAGONAL = %.4f\n", diagonalRetangulo);
		
		sc.close();
	}

}
