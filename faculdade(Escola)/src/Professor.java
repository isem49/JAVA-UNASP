public class Professor extends Pessoa {

    private int salario;
    private String disciplina;
    private int qtdaAula;

    public Professor() {

    }

    public Professor(int salario, String disciplina, int qtdaAula) {
        this.salario = salario;
        this.disciplina = disciplina;
        this.qtdaAula = qtdaAula;
    }

    public Professor(String nome, int idade, String cpf, int salario, String disciplina, int qtdaAula) {
        super(nome, idade, cpf);
        this.salario = salario;
        this.disciplina = disciplina;
        this.qtdaAula = qtdaAula;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getQtdaAula() {
        return qtdaAula;
    }

    public void setQtdaAula(int qtdaAula) {
        this.qtdaAula = qtdaAula;
    }

    public void exibirDados() {

        System.out.println("------Informações---------");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Disciplina: " + this.getDisciplina());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Quantidade de Aulas: " + this.getQtdaAula());

    }

    public void darAula(int qtdaAula) {

       this.qtdaAula = qtdaAula;

    }

}
