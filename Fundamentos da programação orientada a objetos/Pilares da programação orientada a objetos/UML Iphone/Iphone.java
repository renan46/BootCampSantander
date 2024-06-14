import aparelhoTelefonico.AparelhoTelefonico;
import midia.ReproduzirMidia;
import navegar.GaleriaDeFotos;
import navegar.internet;

public class Iphone implements AparelhoTelefonico, ReproduzirMidia, GaleriaDeFotos, internet {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.play();
    }

    public void criarListaDeContatos() {
        System.out.println("criando lista de contatos");
    }

    public void buscarListaDeContato() {
        System.out.println("Buscando contato");
    }

    public void sincronizarContatos() {
        System.out.println("sincornziandoContatos");
    }

    public void atender() {
        System.out.println("Atendendo");
    }

    public void ligar() {
        System.out.println("Ligando");
    }

    public void mutar() {
        System.out.println("Mutar ligação");
    }

    public void colocarEmEspera() {
        System.out.println("Colocar em espera");
    }

    public void fazerConferencia() {
        System.out.println("fazerConferencia");
    }

    public void redeMovelDisponivel() {
        System.out.println("Verificar rede movel");
    }

    public void play() {
        System.out.println("Reproduzindo musica");
    }

    public void pausar() {
        System.out.println("Pausando");
    }

    public void selecionarMidia() {
        System.out.println("Selecionando midia");
    }

    public void zoomIn() {
        System.out.println("Sistema de zoomIn");
    }

    public void zoomOut() {
        System.out.println("Sistema de zoomOut");
    }

    public void navegarNaInternet() {
        System.out.println("Navegando na internet");
    }

    public void abrirAbas() {
        System.out.println("Abrindo Abas");
    }

    public void criarAlbum() {
        System.out.println("criarAlbum");
    }

    public void selecionarFotos() {
        System.out.println("selecionarFotos");
    }

    public void definirPapelDeParede() {
        System.out.println("definindo papel de parede");
    }

    public void excluirFotos() {
        System.out.println("excluindo fotos");
    }

}
