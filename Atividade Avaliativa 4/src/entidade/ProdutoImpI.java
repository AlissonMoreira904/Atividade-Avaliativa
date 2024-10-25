package entidade;

public class ProdutoImpI implements Produto{

    String nome;
    int quantidade;

    public ProdutoImpI(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionarQuantidade(int quantidade){
        this.quantidade += quantidade;
        System.out.println("A quantidade atual é : " + quantidade);
    }

    public void removerQuantidade(int quantidade){
        if (this.quantidade > quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("A quantidade é insuficiente : " +  quantidade);
        }


    }
}
