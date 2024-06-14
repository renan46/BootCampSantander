package lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA DOS ITENS");
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS");
	}
	void entregarIngredientes() { // a funcao ficou defoult
        //Agora nem todos tem acesso
		System.out.println("ENTREGANDO INGREDIENTES");
		controlarSaida();
	}
	void trocarGas() { // a funcao ficou defoult
        //Agora nem todos tem acesso
		System.out.println("ALMOXARIFE TROCANDO O GÁS");
	}
}