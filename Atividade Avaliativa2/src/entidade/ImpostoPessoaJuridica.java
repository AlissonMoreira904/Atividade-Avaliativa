package entidade;

public class ImpostoPessoaJuridica implements Imposto  {

    private double rendaAnual;

    public ImpostoPessoaJuridica(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    @Override
    public double calcularImposto() {
        return 0.1*rendaAnual;
    }
}
