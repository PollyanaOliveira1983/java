package Desafio01;

import java.util.Locale;
import java.util.Scanner;

public class imposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double rendaAnual, prestacaoServico, ganhoCapital, gastoMedico, gastoEducacional, impostoSalario, salario,
				porcentagem, impostoServico, impostoCapital, abatimento, impostoBruto, maximoDedutivel, gastoDedutivel,
				impostoPagar;

		// Calculo do imposto sobre salario

		System.out.print("Renda anual com salário: ");
		rendaAnual = sc.nextDouble();

		System.out.print("Renda anual com prestação de serviço: ");
		prestacaoServico = sc.nextDouble();

		System.out.print("Renda anual com ganho de capital: ");
		ganhoCapital = sc.nextDouble();

		System.out.print("Gastos médicos: ");
		gastoMedico = sc.nextDouble();

		System.out.print("Gastos educacionais: ");
		gastoEducacional = sc.nextDouble();

		salario = rendaAnual / 12;

		if (salario < 3000.00) {
			porcentagem = 0.00;
		} else if (salario <= 5000.00) {
			porcentagem = 0.1;
		} else {
			porcentagem = 0.2;
		}
		impostoSalario = 12 * (salario * porcentagem);

		// Calculo imposto sobre o serviços

		impostoServico = prestacaoServico * 0.15;

		// Calculo imposto sobre ganho de capital

		impostoCapital = ganhoCapital * 0.2;

		// Calculo abatimento medico e educacional

		impostoBruto = impostoSalario + impostoServico + impostoCapital;

		gastoDedutivel = gastoMedico + gastoEducacional;

		maximoDedutivel = impostoBruto * 0.3;

		if (gastoDedutivel > maximoDedutivel) {
			abatimento = maximoDedutivel;
		} else {
			abatimento = gastoDedutivel;
		}

		impostoPagar = impostoBruto - abatimento;

		System.out.println();
		System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
		System.out.println();

		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre salário: %.2f%n", impostoSalario);
		System.out.printf("Imposto sobre serviços: %.2f%n", impostoServico);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoCapital);
		System.out.println();

		System.out.println("DEDUÇÕES:");
		System.out.printf("Máximo dedutível: %.2f%n", maximoDedutivel);
		System.out.printf("Gastos dedutíveis: %.2f%n", gastoDedutivel);

		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f%n", impostoBruto);
		System.out.printf("Abatimento: %.2f%n", abatimento);
		System.out.printf("Imposto devido: %.2f%n", impostoPagar);
		sc.close();
	}

}
