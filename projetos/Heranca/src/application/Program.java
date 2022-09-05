package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001," Alex ", 0.00);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.00, 500.0);
		
		//UPCASTING CONVERTE UM OBJETO DA SUBCLASSE PARA SUPER CALSSE
		//UPCASTING OBJETO DO TIPO  BusinessAccount E ATRIBUIR PRA UM VARIAVEL ACCOUNT
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.00, 200.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.00, 0.01);
		
		// DOWNCASTING CONVERTE UM OBJETO DA SUPER CLASSE PARA SUBCLASSE 
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
			}
			if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	
		System.out.println();	
		Account acc7 = new Account(1007, "Thyago", 1000.0);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
		
		Account acc8 = new SavingsAccount(1008, "Polly", 1000.0, 0.01);
		acc8.withdraw(200.0);
		System.out.println(acc8.getBalance());
		
		Account acc9 = new BusinessAccount(1009, "Edu", 1000.0, 500.0);
		acc9.withdraw(200.0);
		System.out.println(acc9.getBalance());
	}

}
