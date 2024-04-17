import java.util.Scanner;

public class MainAluno {
    public static void main(String[] args) throws Exception {

        Aluno aluno = new Aluno("Junior",18,"202001","Ciência");
        Aluno alunos[] = new Aluno[3];

        Aluno junior = new Aluno("Junior",18,"202001","Ciência");
        alunos[0] = junior;

        Aluno ricardo = new Aluno("Ricardo",20,"202001","EC");
        alunos[1] = ricardo;

        Aluno farias = new Aluno("Farias",17,"202001","Ciência");
        alunos[2] = farias;

        
        aluno.exibirInformacoes();
        System.out.println();
        aluno.alterarCurso("Engenharia");
        aluno.exibirInformacoes();
        System.out.println();
        aluno.menorIdade();
        System.out.println();
        


     }

        
    

}

