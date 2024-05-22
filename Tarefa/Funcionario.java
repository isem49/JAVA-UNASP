public abstract class Funcionario {

    private String nome;
    private String CPF;
    private double salario;

    public Funcionario() {

    }

    public Funcionario(String nome, String cPF, double salario) {
        this.nome = nome;
        CPF = cPF;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
