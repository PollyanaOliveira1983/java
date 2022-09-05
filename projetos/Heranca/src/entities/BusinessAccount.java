package entities;

public class BusinessAccount extends Account {
	
		private Double loanLimit;
		
		// construtor da sub-classe
		public BusinessAccount() {
			//usa-se quando quer utilizar alguma logica que esta implementada no construtor padrao caso precise
			super(); //executa a logica da classe base
		}
		
		public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
			super(number, holder, balance);
			this.loanLimit = loanLimit;
		}
		
		public Double getLoanLimit() {
			return loanLimit;
		}

		public void setLoanLimit(Double loanLimit) {
			this.loanLimit = loanLimit;
		}

		public void loan(double amount) {
			if(amount <= loanLimit) {
				balance += amount - 10.0;
			}
		}
		
		@Override
		public void withdraw(double amount) {
			super.withdraw(amount);
			balance -= 2.0;
		}
}
