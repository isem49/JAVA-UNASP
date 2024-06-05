import java.util.List;

public class Curso {

    private String nome;
    private int codigo;
    private String professorResponsavel;
    private List<Aluno> alunos;

    public Curso() {
        this.nome = nome;

    }

    public Curso(String nome, int codigo, String professorResponsavel) {
        this.nome = nome;
        this.codigo = codigo;
        this.professorResponsavel = professorResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(String professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public void adicionarAluno(Aluno aluno) {

    }

    public void removerAluno(Aluno aluno) {

    }

    public void listarAlunos(Aluno aluno) {

    }

}
