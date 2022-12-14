package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Digite o nome e as notas do Aluno: ");
		student.name = sc.nextLine();
		student.note1 = sc.nextDouble();
		student.note2 = sc.nextDouble();
		student.note3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL = %.2f%n", student.finalNote());
		
		if (student.finalNote() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("FALTARAM %.2f PONTOS%n", student.missingNote());
		}
		else {
			System.out.printf("PASS");
		}
		;
		sc.close();
	}

}
