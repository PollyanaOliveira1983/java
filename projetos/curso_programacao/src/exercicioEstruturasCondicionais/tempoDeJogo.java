package exercicioEstruturasCondicionais;

import java.util.Locale;
import java.util.Scanner;

public class tempoDeJogo {

	public static void main(String[] args) {
		// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo
		//pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24
		//horas.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horaInicio, horaFim, duracao;
		
		System.out.print("Hora inicial: ");
		horaInicio =  sc.nextInt();
		
		System.out.print("Hora final: ");
		horaFim = sc.nextInt();
		
		if(horaFim > horaInicio) {
			duracao = horaFim - horaInicio;
		}
		else {
			duracao = (24 - horaInicio) + horaFim;
		}
		
		System.out.printf("O JOGO DUROU %d",duracao);
		sc.close();
	}

}
