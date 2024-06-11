import java.util.ArrayList;

public class Aluno extends Pessoa {

    private int matricula;
    private ArrayList<String> curso;

    public Aluno() {

    }

    public Aluno(int matricula, ArrayList<String> curso) {
        this.matricula = matricula;
        this.curso = curso;
    }

    public Aluno(String nome, int idade, String cpf, int matricula, ArrayList<String> curso) {
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

    public ArrayList<String> getCurso() {
        return curso;
    }

    public void setCurso(ArrayList<String> curso) {
        this.curso = curso;
    }

    public void exibirDados() {

        System.out.println("------Informações do Aluno---------");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Curso: " + this.getCurso());

    }

    public void realizarMatricula(int matricula, ArrayList<String> curso) {

        this.matricula = matricula;
        this.curso = curso;

    }
}
