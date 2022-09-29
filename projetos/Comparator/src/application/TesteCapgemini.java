package application;

import java.util.Scanner;

public class TesteCapgemini {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

		 int numero = sc.nextInt();

		  if(numero > 100 && numero <= 200){

		       System.out.println("Número OK");
		 }else{

		     if(numero == 0){

		             System.out.println("Número Inválido");

		     }

		    if(numero  < 0){
		             System.out.println("Número Inválido");

		 }

		    else if(numero > 0 && numero < 100){

		             System.out.println("Número OK");

		    }
		    sc.close();
		 }

	}

}
