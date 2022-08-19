import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 10.35784;
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println("Olá mundo!");
		System.out.println("Bom dia!");
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		System.out.println("RESULTADO = " + x + " METROS");
		
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		//exemplo 1
		int w, z;

		w = 5;

		z = 2 * w;
		System.out.println(w);
		System.out.println(z);
		
		//Exemplo 2
		int a;
		double b;
		a = 5;
		b = 2 * a;
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
