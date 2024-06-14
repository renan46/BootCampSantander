public class ComputadorPedrinho{

    public static void main(String[] args) {
        
        ServicoDeMensagem smi = null;
		
		
		String appEscolhido="fbm"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNmessenger();
        else if(appEscolhido.equals("fbm"))
		    smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();

            smi.enviarMensagem();
            smi.receberMensagem();
            smi.conectarInternet();
    }
}