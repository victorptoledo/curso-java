package entities14;

public class PessoaFisica extends Pessoa {

    private Double gastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double calculaImposto() {
        double calculo = 0;
        if (rendaAnual < 20000) {
            calculo = (rendaAnual * 0.15) - (gastosSaude * 0.50);
        } else if (rendaAnual >= 20000) {
            calculo = (rendaAnual * 0.25) - (gastosSaude * 0.50);
        }
        return calculo;
    }

    @Override
    public String toString() {
        return nome + ": R$ " + String.format("%.2f", calculaImposto());
    }
}
