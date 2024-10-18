package aplicacao;

import entidade.Pedido;

public class Principal {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.adicionarItem("Air Max TN Plus Triple White",1299.00);
        pedido.adicionarItem("Air Max TN Plus Killer Whale",1299.00);

        System.out.println("O valor total do seu pedido R$ é de  " + pedido.calcularTotal());

    }
}
