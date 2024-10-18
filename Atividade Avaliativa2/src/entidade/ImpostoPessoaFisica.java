package entidade;

public class ImpostoPessoaFisica implements Imposto{

    private double rendaAnual;

    public ImpostoPessoaFisica(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }


    @Override
    public double calcularImposto() {
        return 0.2*rendaAnual;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }
}
