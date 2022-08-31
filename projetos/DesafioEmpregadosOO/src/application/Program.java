package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String departmentName = sc.next();
		
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		
		System.out.print("Email: ");
		String email = sc.next();
		
		System.out.print("Telefone: ");
		String phone = sc.next();
		
		Address address = new Address(email, phone);
		
		Department department = new Department(departmentName, payDay, address);
				
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Dados do funcionário " +( i + 1)+ " : \n");
			
			System.out.print("Nome: ");
			String employeeName = sc.next();
			
			System.out.printf("Salário: ");
			Double salary = sc.nextDouble();
						
			Employee employee = new Employee(employeeName, salary);
			department.addEmployee(employee);
			
		}
		
		showReport(department);
		
		sc.close();
	}

	private static void showReport(Department department){
		
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO: ");
		System.out.println(department);		
	}
}
