package exercicioEstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class dardo {

	public static void main(String[] args) {
		// No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior distância que conseguir.
		//Você deve criar um programa para, dadas as medidas das três tentativas de lançamento, informar qual
		//foi a maior.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double distancia1, distancia2, distancia3;
		
		System.out.println("Digite as tres distancias: ");
		distancia1 = sc.nextDouble();
		distancia2 = sc.nextDouble();
		distancia3 = sc.nextDouble();
		
		if(distancia1 > distancia2 && distancia1 > distancia3) {
			System.out.printf("MAIOR DISTANCIA = %.2f", distancia1);
		}
		else if (distancia2 > distancia1 && distancia2 > distancia3) {
			System.out.printf("MAIOR DISTANCIA = %.2f", distancia2);
		}
		else {
			System.out.printf("MAIOR DISTANCIA = %.2f", distancia3);
		}
			
		sc.close();
	}

}
