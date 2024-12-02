package models;

public class Garcom {
    private String nome;
    private String telefone;
    private double salario;

    public Garcom(String nome, String telefone, double salario) {
        this.nome = nome;
        this.telefone = telefone;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format("Garçom:\n" +
                             "  Nome: %s\n" +
                             "  Telefone: %s\n" +
                             "  Salário: R$ %.2f",
                             nome, telefone, salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
