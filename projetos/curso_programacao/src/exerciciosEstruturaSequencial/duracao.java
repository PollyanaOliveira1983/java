package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class duracao {

	public static void main(String[] args) {
		// Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no
		//formato horas:minutos:segundos.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int duracao, h, m, s, resto;
		
		System.out.print("Digite a duracao em segundos: ");
		duracao = sc.nextInt();
		
		h = duracao / 3600;
		resto = duracao % 3600;
		
		m = resto / 60;
		s = resto % 60;
		
		System.out.printf("%d : %d : %d ", h, m, s);
		
		sc.close();
	}

}
