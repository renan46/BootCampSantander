public class Main {

	public static void main(String[] args) {
		Cliente renan = new Cliente();
		renan.setNome("Renan");
		
		Conta cc = new ContaCorrente(renan);
		Conta investimento = new ContaInvestimento(renan);
        
		cc.depositar(150);
		cc.transferir(100, investimento);
		
		cc.imprimirExtrato();
		investimento.imprimirExtrato();
	}

}