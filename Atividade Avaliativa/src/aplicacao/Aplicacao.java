package aplicacao;
import entidade.Medico;
import entidade.Motorista;
import entidade.Professor;
import entidade.Trabalhador;

public class Aplicacao {
    public static void main(String[] args) {
        Medico doutor = new Medico("Alisson","Neurologista");
        doutor.trabalhar();

        Professor educador = new Professor("Alisson","Matemática");
        educador.trabalhar();

        Trabalhador motorista = new Motorista();
        motorista.trabalhar();
    }

}
