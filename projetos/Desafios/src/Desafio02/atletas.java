package Desafio02;

import java.util.Locale;
import java.util.Scanner;

public class atletas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n,i;
		String nome,nomeMaisAlto;
		char sexo;
		double altura,peso,pesoMedio,alturaMulher,maisAlto,homem,porcentagemHomem,contMulher,mediaMulher, somaPeso;

		System.out.print("Qual a quantidade de atletas? ");
		n = sc.nextInt();
		
		pesoMedio = 0;
		maisAlto = 0;
		homem = 0;
		alturaMulher = 0;
		contMulher = 0;
		mediaMulher = 0;
		porcentagemHomem = 0;
		nomeMaisAlto = null;
		somaPeso = 0;
		
		for (i=0; i<n; i++) {
			System.out.printf("Digite os dados do atleta numero %d\n",i+1);
		    System.out.print("Nome: ");
		    nome = sc.next();
		    
		    System.out.print("Sexo: ");
		    sexo = sc.next().charAt(0);
		    
		    while (sexo != 'F' && sexo != 'M') {
		    	System.out.print("Valor invalido! Favor digitar F ou M: ");
		    	sexo = sc.next().charAt(0);
		    }
		    
		    System.out.print("Altura: ");
		    altura = sc.nextDouble();
		    while (altura <= 0) {
		    	System.out.print("Valor invalido! Favor digitar um valor positivo: ");
		    	altura = sc.nextDouble();
			}
			
		    if (altura > maisAlto) {
		    	maisAlto = altura;
		    	nomeMaisAlto = nome;
		    }
		    
		    System.out.print("Peso: ");
		    peso = sc.nextDouble();
		    
		    while (peso <= 0) {
		    	System.out.print("Valor invalido! Favor digitar um valor positivo: ");
		    	peso = sc.nextDouble();
		    }
		    
		    somaPeso = somaPeso + peso;
		    pesoMedio = somaPeso / n;
		    
		    if (sexo == 'M') {
		    	homem++;
		    }
		    else {
				contMulher++;
				alturaMulher = alturaMulher + altura;
				mediaMulher = alturaMulher / contMulher;
			}
		    
		    porcentagemHomem = (homem / n ) * 100;
		    
		}
		
		System.out.println();
		System.out.println("RELATORIO: ");
		System.out.printf("Peso médio dos atletas: %.2f\n",pesoMedio);
		System.out.printf("Atleta mais alto: %s\n",nomeMaisAlto);
		System.out.printf("Porcentagem de homens: %.1f %%%n",porcentagemHomem);
		
		if (mediaMulher == 0.00) {
			System.out.println("Não há mulheres cadastradas");
		}
		else {
			System.out.printf("Altura média das mulheres: %.2f\n",mediaMulher);
		}
						
		sc.close();		
	}

}
