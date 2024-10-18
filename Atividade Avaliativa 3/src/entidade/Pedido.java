package entidade;

public class Pedido implements PedidoRestaurante {

    private String item;
    private double preco;


    public Pedido() {
    }

    public Pedido(String item, double preco) {
        this.item = item;
        this.preco = preco;
    }

    @Override
    public void adicionarItem(String item, double preco) {

    }

    @Override
    public double calcularTotal() {
        return this.preco += preco;

    }
}
