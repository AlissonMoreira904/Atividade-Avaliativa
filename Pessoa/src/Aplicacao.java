public class Aplicacao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setEndereco("rua legal");
        System.out.println("Seu endereço é : " + pessoa.getEndereco());

        pessoa.setNome("Alisson");
        System.out.println("Seu nome é : " + pessoa.getNome());

    }
}
