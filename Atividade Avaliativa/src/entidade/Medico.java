package entidade;

public class Medico extends Trabalhador implements PessoaJuridica{

     private String nome;
     private String especialidade;
     @Override
     public void trabalhar(){
          System.out.println("Faz cirurgias!!");
     }

     @Override
     public void cadastrarCNPJ() {

     }

     public Medico(String nome, String especialidade) {
          this.nome = nome;
          this.especialidade = especialidade;
     }
}
