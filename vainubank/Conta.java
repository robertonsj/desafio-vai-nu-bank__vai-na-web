package challange.desafionubank.vainubank;

public abstract class Conta {
	private String numero;
	private String agencia;
	private String nomeTitular;
	private String cpf;
	private double saldo;
	
	
	public Conta() {}
	public Conta(String numero, String agencia, String nomeTitular, String cpf) {
		this.numero = numero;
		this.agencia = agencia;
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.saldo = 0.0;
	}

	
	//GETTERS AND SETTERS
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	public void depositar(double valor) {
		saldo+=valor;
	}
	
	public abstract void sacar(double valor);
	
	public void transferir(Conta destino, double valor) {
		if(valor <= saldo) {
			saldo -= valor;
			destino.depositar(valor);
			System.out.println("\tTransferência realizada com sucesso.");
		}else {
			System.out.println("\tSaldo insuficiente para transferência.");
		}
	}
	
	@Override
	public String toString() {
		return "[numero=" + numero + ", agencia=" + agencia 
				+ ", cpf=" + cpf + ", saldo=" + saldo + "]";
	}
	
}
