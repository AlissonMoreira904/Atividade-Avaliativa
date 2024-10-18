package aplicacao;

import entidade.Imposto;
import entidade.ImpostoPessoaFisica;
import entidade.ImpostoPessoaJuridica;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {

        Imposto[] impostos = {
                new ImpostoPessoaFisica(1000),
                new ImpostoPessoaJuridica(4000)
        };

        for (Imposto imposto : impostos) {
            System.out.println("Seu imposto total é : " + imposto.calcularImposto());

        }
    }
}
