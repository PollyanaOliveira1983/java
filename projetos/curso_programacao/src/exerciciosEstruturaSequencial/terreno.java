package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class terreno {

	public static void main(String[] args) {
		//Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
		//casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
		//o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com
		//duas casas decimais, conforme exemplo.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, valorMetro, areaTerreno, precoTerreno;
		
		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		
		System.out.print("Digite o valor do metro quadrado: ");
		valorMetro = sc.nextDouble();
		
		areaTerreno = largura * comprimento;
		
		System.out.printf("Area do terreno = %.2f\n",areaTerreno);
		
		precoTerreno = areaTerreno * valorMetro;
		
		System.out.printf("Preco do terreno = %.2f\n",precoTerreno);
		
		sc.close();
	}

}
