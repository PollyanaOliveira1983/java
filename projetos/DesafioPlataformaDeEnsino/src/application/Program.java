package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;
import entities.Task;
import entities.Video;



public class Program {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();
		
		List<Lesson> list = new ArrayList<Lesson>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Dados da "+ i + " a aula: ");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char option = sc.next().charAt(0);
			System.out.print("Título: ");
			String title = sc.next();
						
			if (option == 'c') {
				System.out.print("URL do vídeo: ");
				String url = sc.nextLine();
				sc.nextLine();
				System.out.printf("Duração em segundos: ");
				Integer seconds = sc.nextInt();
				list.add(new Video(title, url, seconds));
				
			}
			else {
				System.out.print("Descrição: ");
				String description = sc.nextLine();
				sc.nextLine();
				System.out.printf("Quantidade de questões: ");
				Integer questionCount = sc.nextInt();
				list.add(new Task(title, description, questionCount));
				
			}
			
		}
		
		System.out.println();
		Integer sum = 0;
		for (Lesson less : list) {
			sum += less.duration(); 
		}
		System.out.println("DURAÇÃO TOTAL DO CURSO = " + sum + " segundos ");
		sc.close();
	}
}
