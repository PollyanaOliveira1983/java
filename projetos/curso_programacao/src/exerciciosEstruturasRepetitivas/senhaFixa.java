package exerciciosEstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class senhaFixa {

	public static void main(String[] args) {
		//Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de
		//senha incorreta informada, escrever a mensagem "Senha Invalida! Tente novamente:". Quando a senha
		//for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo
		//encerrado. Considere que a senha correta é o valor 2002.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.printf("Digite a senha: ");
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.print("Senha Invalida! Tente novamente:");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		
		sc.close();
	}

}
