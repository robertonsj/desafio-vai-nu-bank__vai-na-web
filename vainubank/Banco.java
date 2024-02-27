package challange.desafionubank.vainubank;

import java.util.Map;
import java.util.HashMap;

public class Banco {
	private String nome;
	private Map<String, Conta> contas;
	
	public Banco() {
		this.contas = new HashMap<>();
		this.nome = "Vai Nu Bank";
	}
	
	public void adicionarConta( Conta conta) {
		contas.put(conta.getNumero(), conta);
		System.out.println("\tConta de " + conta.getNomeTitular() 
		+ " foi adicionada.");
	}
	
	public Conta buscarConta(String numero) {
		return contas.get(numero);
	}
	
	public void removerConta(Conta conta) {
		
	}

	@Override
	public String toString() {
		StringBuilder infoBanco = new StringBuilder("Banco " + nome + "{\n");
		contas.forEach((numeroConta, conta) -> infoBanco.append("\t")
				.append("[numero=" + numeroConta + ", contas=" 
		+ conta.getNomeTitular() + "]").append("\n"));
		infoBanco.append("}");
		return infoBanco.toString();
	}
	
	
}
