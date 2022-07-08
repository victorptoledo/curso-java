package entities14;

public class PessoaJuridica extends Pessoa {

    private int numeroEmpregados;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, int numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroEmpregados = numeroFuncionarios;
    }

    public int getNumeroEmpregados() {
        return numeroEmpregados;
    }

    public void setNumeroEmpregados(int numeroEmpregados) {
        this.numeroEmpregados = numeroEmpregados;
    }

    @Override
    public Double calculaImposto() {
        double calculo = 0;
        if (numeroEmpregados <= 10) {
            calculo = (rendaAnual * 0.16);
        } else if (rendaAnual > 10) {
            calculo = (rendaAnual * 0.14);
        }
        return calculo;
    }

    @Override
    public String toString() {
        return nome + ": R$ " + String.format("%.2f", calculaImposto());
    }
}
