package entity10;

public class Empregado {

    private int id;
    private String nome;
    private double salario;

    public Empregado(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentaSalario(double porcentagem) {
        salario += salario * porcentagem / 100;
    }

    @Override
    public String toString() {
        return id + ", id = "
                + nome + ", nome = "
                + String.format("salario = R$ %.2f", salario);
    }
}
