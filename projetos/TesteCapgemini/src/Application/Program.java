package Application;

import entities.Carro;
import entities.Veiculo;

public class Program {

	public static void main(String[] args) {
		
		//System.out.println(Math.round(-3.22));
		
		Veiculo veiculo = new Carro("Chevrolet", "Branco", "QNZ7471", 10);
		
		System.out.println(veiculo.acelerar());
		
		System.out.println(veiculo);
	}

}
