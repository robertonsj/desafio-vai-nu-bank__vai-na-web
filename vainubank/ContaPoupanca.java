package challange.desafionubank.vainubank;

public class ContaPoupanca extends Conta {
	
//	private double jurosDeSaque; //juros de 2% em reais aplicado a cada saque
	
	public ContaPoupanca() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ContaPoupanca(String numero, String agencia, String nomeTitular, String cpf) {
		super(numero, agencia, nomeTitular, cpf);
		// TODO Auto-generated constructor stub
	}
	
	//Retornar juros de 2% em reais para ser aplicado a cada saque.
	public double getJurosAplicado() {
		return getSaldo() * 0.02;
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		if((valor + getJurosAplicado()) <= getSaldo()) {
			setSaldo(getSaldo() - (valor + getJurosAplicado()));
			System.out.println("\tSaque de " + valor + " realizado com sucesso.");
		} else {
			System.err.println("\tSaldo insuficiente para o saque com juros.");
		}
	}
	
	

}
