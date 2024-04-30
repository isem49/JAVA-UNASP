package exercicio;

public class Aluno {

	String nome;
	String matricula;
	String curso;
	int anoDeIngresso;

	public Aluno() {

	}

	public Aluno(String nome, String matricula, String curso, int anoDeIngresso) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.anoDeIngresso = anoDeIngresso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getAnoDeIngresso() {
		return anoDeIngresso;
	}

	public void setAnoDeIngresso(int anoDeIngresso) {
		this.anoDeIngresso = anoDeIngresso;
	}

	public void imprimirInfo() {

		System.out.println("-----------Aluno------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Matricula: " + this.getMatricula());
		System.out.println("Curso: " + this.getCurso());
		System.out.println("Ano de ingresso: " + this.getAnoDeIngresso());

	}

	public void tempoDeCurso() {

		int tempo = 2024 - this.anoDeIngresso;
		System.out.println("Tempo de curso: " + tempo + " Anos");

	}

	
	
	
}
