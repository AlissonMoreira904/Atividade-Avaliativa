package principal;

import entidade.Livro;

public class Aplicacao {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setAnoPublicacao(1500);
        System.out.println(livro.getAnoPublicacao());

        livro.setAutor("Machado de Assis");
        System.out.println(livro.getAutor());

        livro.setTitulo("Memórias póstumas de Brascubas");
        System.out.println(livro.getTitulo());

        







    }
}
