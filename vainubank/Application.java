package challange.desafionubank.vainubank;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banco banco = new Banco();
		
		banco.adicionarConta(new ContaPoupanca("111", "222", "roberto","333"));
		banco.adicionarConta(new ContaCorrente("444", "666", "jose","999"));
		banco.adicionarConta(new ContaCorrente("888", "666", "maria","999"));

		
		System.out.println("\n\tTESTE");
		Conta contaC = banco.buscarConta("444");
		
		contaC.depositar(1000);
		System.out.println(contaC);
		contaC.sacar(2500);
		contaC.sacar(1500);
		System.out.println(contaC);
		
		System.out.println();
		System.out.println(banco);
		
		
	}

}
