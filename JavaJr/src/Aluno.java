public class Aluno {

   
    private String nome;
    private int idade;
    private String ra;
    private String curso;

    public Aluno(String nome) {
        this.nome = nome;

    }

    public Aluno(String nome, int idade, String ra, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.ra = ra;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void exibirInformacoes(){

            System.out.println("Nome: " + this.nome );
            System.out.println("Idade: " + this.idade );
            System.out.println("RA: " + this.ra );
            System.out.println("Curso: " + this.curso );

    }

    public void alterarCurso(String novoCurso){
            this.curso = novoCurso;
    }

    public void menorIdade(){
        if(this.idade < 18){
            System.out.println("O aluno é menor de idade");
        }
        else{
            System.out.println("O aluno é maior de idade"); 
    	   }
    }

    public void alunoMenorIdade(Aluno alunos[]){

        int menor = 0;
        String alunoMenor = "teste";

        for(int i = 0; i < 3; i++){
        
            if(alunos[i].getIdade() < menor && alunos[i].getIdade() != 0 ){

                menor = alunos[i].getIdade();
                alunoMenor = alunos[i].getNome();

            }

        }

        System.out.println("O aluno com menor idade é: " + alunoMenor);
    }


}
