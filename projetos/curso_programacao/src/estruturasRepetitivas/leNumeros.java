package estruturasRepetitivas;

import java.util.Scanner;

public class leNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		while (x != 0) {
			x = sc.nextInt();			
		}

		sc.close();
	}

}
