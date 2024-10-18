package entidade;

public class Professor extends Trabalhador{

    private String nome;
    private String materia;

    @Override
    public void trabalhar() {
        System.out.println("Ganha pouco!!");
    }

    public Professor(String nome, String materia) {
        this.nome = nome;
        this.materia = materia;
    }
}
