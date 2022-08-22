package exerciciosEstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class dentroFora {

	public static void main(String[] args) {
		//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo,
		//conforme exemplo

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, x, dentro, fora;
		
		System.out.println("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		dentro = 0;
		fora = 0;
		
		for (int i=0; i<n; i++) {
	    	System.out.print("Digite um numero: ");
	        x = sc.nextInt();

	        if (x < 10 || x > 20) {
	            fora++;
	        }
	        else {
	            dentro++;
	        }
	    }
		
		System.out.printf("%d DENTRO\n", dentro);
	    System.out.printf("%d FORA\n", fora);
	    
		sc.close();
	}

}
