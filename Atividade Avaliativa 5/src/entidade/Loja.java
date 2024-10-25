package entidade;

abstract class Loja {
    public String cnpj;
    public String razaoSocial;
    public boolean aberta;

    public Loja(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.aberta = false; // Inicializa como fechada
    }

    public void abrir() {
        if (!aberta) {
            aberta = true;
            System.out.println("A loja " + razaoSocial + " está aberta.");
        } else {
            System.out.println("A loja " + razaoSocial + " já está aberta.");
        }
    }

    public void fechar() {
        if (aberta) {
            aberta = false;
            System.out.println("A loja " + razaoSocial + " está fechada.");
        } else {
            System.out.println("A loja " + razaoSocial + " já está fechada.");
        }
    }
}