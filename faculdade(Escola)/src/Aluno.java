import java.util.List;

public class Aluno extends Pessoa {

    private int matricula;
    private List<String> curso;

    public Aluno() {

    }

    public Aluno(int matricula, List<String> curso) {
        this.matricula = matricula;
        this.curso = curso;
    }

    public Aluno(String nome, int idade, String cpf, int matricula, List<String> curso) {
        super(nome, idade, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public List<String> getCurso() {
        return curso;
    }

    public void setCurso(List<String> curso) {
        this.curso = curso;
    }

    public void exibirDados() {

        System.out.println("------Informações---------");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());

    }

    public void realizarMatricula() {

        System.out.println("Se matricular");

    }

}
