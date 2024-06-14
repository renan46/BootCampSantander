public class Mensagem{


    

    public void metodoGeral(){
        enviarMensagem();
        receberMensagem();
        validarConectadoInternet();
        salvarHistoricoMensagem();
    }

    private void enviarMensagem(){
        System.out.println("Mensagem enviada");
    }

    private void receberMensagem(){
        System.out.println("Recebendo mensagem");
    }

    private void validarConectadoInternet(){
        System.out.println("Conectado a internet");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("mensagem salva");
    }


}