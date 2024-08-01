package desafio_dio_banco;

public class Main {

	public static void main(String[] args) {

		Cliente josuel = new Cliente();
		josuel.setNome("Josuel");
		
		Conta cc = new ContaCorrente(josuel);
		Conta poupanca = new ContaPoupanca(josuel);
		
		cc.depositar(100);		
		cc.transferir(100, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
