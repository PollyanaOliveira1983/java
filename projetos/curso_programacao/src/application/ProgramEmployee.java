package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ProgramEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		Employee employee = new Employee();
		
		System.out.print("Nome: ");
		employee.name = sc.nextLine();
		
		System.out.print("Salario bruto: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Imposto: ");
		employee.tax = sc.nextDouble();
		
		System.out.printf("Funcionario: " + employee);
		System.out.println();
		
		System.out.printf("Qual a porcentagem para aumentar o salário? ");
		double percentage = sc.nextDouble();
		
		employee.increaseSalary(percentage);
		
		System.out.printf("Dados atulaizados: " + employee);
		
		sc.close();
	}

}
