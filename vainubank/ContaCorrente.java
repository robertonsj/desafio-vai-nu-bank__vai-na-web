package challange.desafionubank.vainubank;

public class ContaCorrente extends Conta {
	
	private double limiteCredito;

	public ContaCorrente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ContaCorrente(String numero, String agencia, String nomeTitular,
			String cpf) {
		super(numero, agencia, nomeTitular, cpf);
		this.limiteCredito = 1000;
		// TODO Auto-generated constructor stub
	}
	
	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}


	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		if(valor <= getSaldo() + getLimiteCredito()) {
			if(valor <= getSaldo()) {setSaldo(getSaldo() - valor);}
			else {
				double restante = valor - getSaldo();
				setLimiteCredito(getLimiteCredito() - restante);
				setSaldo(0);
			}
			System.out.println("\tSaque de " + valor + " realizado com sucesso.");
		} else {
			System.err.println("\tSaldo e limite de crédito insuficiente para o saque.");
		}
		
		
	}

	@Override
	public String toString() {
		StringBuilder infoConta = new StringBuilder("\n*** Conta Corrente de " 
				+ getNomeTitular().toUpperCase() + " ***\n");
		infoConta.append(super.toString()).append("\n")
		.append("Limite de crédito=" + getLimiteCredito());
		
		return infoConta.toString();
	}
	
	
	
}
