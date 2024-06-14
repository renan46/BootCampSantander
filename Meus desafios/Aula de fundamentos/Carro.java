public class Carro{
    private String chassi;
    public String getChassi(){
        return chassi;
    }    

    public void setChassi(String chassi){
        this.chassi = chassi;
    }


    public Carro(){
        acelerar();
        freiar();
    }

    private void acelerar (){
        System.out.println("Acelerar");
    }

    public void freiar(){
        System.out.println("freiar");
    }
    public void confereCambio(){
        System.out.println("Cambio ok!");
    }

    public void ligar(){
        confereCambio();
    }
}