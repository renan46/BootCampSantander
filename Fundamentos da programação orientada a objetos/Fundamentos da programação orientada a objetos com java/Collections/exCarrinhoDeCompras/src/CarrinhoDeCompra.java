import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra{

    private List<Item> itemList;

    public CarrinhoDeCompra() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){

       Item item = new Item(nome, preco, quantidade);
       this.itemList.add(item);
        
    }

    public void removerItem(String nome){
        List<Item> removerItems = new ArrayList<>();
        if(!itemList.isEmpty()){
        for ( Item i : itemList) {

            if(i.getNome().equalsIgnoreCase(nome)){
                removerItems.add(i);
            }
        }
        itemList.removeAll(removerItems);
    }else{
        System.out.println("Sua lista esta vazia");
    }

    }



    public double calcularValorTotal(){

        double valorTotal = 0.0;
        for (Item item : itemList) {     
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem;  
        }
        return valorTotal;
    }   


    public void exibirItem(){
        System.out.println(this.itemList);
    }

    


    @Override
    public String toString() {
      return "CarrinhoDeCompras{" +
          "itens=" + itemList +
          '}';
  }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinhoDeCompras = new CarrinhoDeCompra();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);
        carrinhoDeCompras.removerItem("Lápis");
        carrinhoDeCompras.exibirItem();    
        System.out.println("O valor total eh + " + carrinhoDeCompras.calcularValorTotal());
    }
}

