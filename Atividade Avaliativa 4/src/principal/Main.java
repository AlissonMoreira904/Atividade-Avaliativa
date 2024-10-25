package principal;

import entidade.ProdutoImpI;

public class Main {
    public static void main(String[] args) {
        ProdutoImpI p1 = new ProdutoImpI("Pão de Forma", 1);

        System.out.println(p1.getQuantidade());
        p1.adicionarQuantidade(10);
        System.out.println(p1.getQuantidade());
        p1.removerQuantidade(3);
        System.out.println(p1.getQuantidade());
        p1.removerQuantidade(8);


    }
}
