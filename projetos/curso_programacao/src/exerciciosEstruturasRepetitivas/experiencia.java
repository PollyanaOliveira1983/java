package exerciciosEstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class experiencia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i,n,quantidade,totalCobaias,totalSapos,totalCoelhos,totalRatos;
		double ratos, sapos, coelhos;
		char cobaia;
		
		System.out.print("Quantos casos de teste serao digitados? ");
		n = sc.nextInt();
		
		totalRatos = 0;
		totalSapos = 0;
		totalCoelhos = 0;
		
		for (i=0; i<n; i++) {
			System.out.print("Quantidade de cobaias: ");
			quantidade = sc.nextInt();
			System.out.print("Tipo de cobaia: ");
			cobaia = sc.next().charAt(0);
			
			if (cobaia == 'C') {
				totalCoelhos = totalCoelhos + quantidade;
			}
			else if (cobaia == 'S') {
				totalSapos = totalSapos + quantidade;
			}
			else {
				totalRatos = totalRatos + quantidade;
			}
		}
		
		totalCobaias =  totalCoelhos + totalRatos + totalSapos;
		coelhos = ((double)totalCoelhos / totalCobaias) * 100;
		ratos = ((double)totalRatos / totalCobaias) * 100;
		sapos = ((double)totalSapos / totalCobaias) * 100;
		
		System.out.println();
		System.out.println("RELATORIO FINAL: ");
		System.out.printf("Total: %d cobaias\n",totalCobaias);
		System.out.printf("Total de coelhos: %d\n",totalCoelhos);
		System.out.printf("Total de ratos: %d\n",totalRatos);
		System.out.printf("Total de sapos: %d\n",totalSapos);
		System.out.printf("Percentual de coelhos: %.2f\n",coelhos);
		System.out.printf("Percentual de ratos: %.2f\n",ratos);
		System.out.printf("Percentual de sapos: %.2f\n",sapos);
		
		sc.close();
	}

}
