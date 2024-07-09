public class ContaInvestimento extends Conta{
    
    
    public ContaInvestimento(Cliente cliente) {
        super(cliente);
        
    }

    @Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta de Investimento ===");
		super.imprimirInfosComuns();
	}

    public void investimentoRendaFixa(){
        System.out.println("Investimento em renda fixa");
    }
    
    public void invesitmentoRendaVariavel(){
        System.out.println("Investimento em renda variavel");
    }

}
