package entidade;

public interface PedidoRestaurante {

    public void adicionarItem(String item,double preco);

    abstract double calcularTotal();
}
