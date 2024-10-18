package entidade;

public class Motorista extends Trabalhador {

    private String nome;
    private String carro;

    @Override
    public void trabalhar() {
        System.out.println("Dirige!!");
    }


    public Motorista(String nome, String carro) {
        this.nome = nome;
        this.carro = carro;
    }
}
