package exercicioEstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class aumento {

	public static void main(String[] args) {
		// Uma empresa vai conceder um aumento percentual de salário aos seus funcionários dependendo de quanto
		//cada pessoa ganha, conforme tabela ao lado. Fazer um programa para ler o salário de uma pessoa, daí mostrar
		//qual o novo salário desta pessoa depois do aumento, quanto foi o aumento e qual foi a porcentagem de
		//aumento.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, novoSalario, porcentagem, aumento;
		
		System.out.print("Digite o salario da pessoa: ");
		salario = sc.nextDouble();
		
		if(salario <= 1000.00) {
			porcentagem = 20;
			novoSalario = salario + (salario * porcentagem) / 100;
			aumento = novoSalario - salario;
		}
		else {
			if(salario <= 3000.00) {
				porcentagem = 15;
				novoSalario = salario + (salario * porcentagem) / 100;
				aumento = novoSalario - salario;
			}
			else {
				if(salario <= 8000.00) {
					porcentagem = 10;
					novoSalario = salario + (salario * porcentagem) / 100;
					aumento = novoSalario - salario;
				} 
				else {
					porcentagem = 5;
					novoSalario = salario + (salario * porcentagem) / 100;
					aumento = novoSalario - salario;
				}
			}
		}
		
		System.out.printf("Novo salario = R$ %.2f\n",novoSalario);
		System.out.printf("Aumento = R$ %.2f\n",aumento);
		System.out.printf("Porcentagem = %f%%\n",porcentagem);
		sc.close();
	}

}
