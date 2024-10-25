package aplicacao;

import entidade.LojaComercial;

public class Main {
        public static void main(String[] args) {
            LojaComercial loja = new LojaComercial("12.345.678/0001-95", "Lolja");


            loja.abrir();
            loja.fechar();
            loja.fechar();
            loja.abrir();
            loja.abrir();
        }
    }

