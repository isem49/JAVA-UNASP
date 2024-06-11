import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        ArrayList<String> cursos = new ArrayList<String>();
        String nomeCurso = "";
        String verificador = "Sim";
        int i = 0;

        Aluno a1 = new Aluno();
        System.out.println("--------Dados do Aluno------- ");
        System.out.println();
        System.out.print("Digite o nome: ");
        String nome = in.next();
        a1.setNome(nome);
        System.out.print("Digite a idade: ");
        a1.setIdade(in.nextInt());
        System.out.print("Digite a matricula: ");
        int m = in.nextInt();
        System.out.print("Digite o CPF: ");
        a1.setCpf(in.next());

        while (verificador.equalsIgnoreCase("Sim")) {
            System.out.print("Digite o nome do curso: ");
            nomeCurso = in.next();
            System.out.println();

            cursos.add(nomeCurso);
            i++;

            System.out.println("Deseja continuar com a matrícula? (Sim/Não)");
            verificador = in.next();
            System.out.println();

            try {
                if (i > 4) {
                    throw new MatriculaInvalidaException("Não é possível adicionar mais do que 5 cursos.");
                }
            } catch (MatriculaInvalidaException e) {
                System.out.println();
                System.out.println("Erro: " + e.getMessage());
                break;
            }
        }

        a1.realizarMatricula(m, cursos);
        System.out.println();
        a1.exibirDados();

        System.out.println();
        Professor p1 = new Professor();
        System.out.println("--------Dados do Professor------- ");
        System.out.print("Digite o nome: ");
        p1.setNome(in.next());
        System.out.print("Digite a idade: ");
        p1.setIdade(in.nextInt());
        System.out.print("Digite o CPF: ");
        p1.setCpf(in.next());
        System.out.print("Digite o salario: ");
        p1.setSalario(in.nextInt());
        System.out.print("Digite a disciplina: ");
        p1.setDisciplina(in.next());
        System.out.print("Digite a quantidade de aulas: ");
        int aulas = in.nextInt();
        p1.setQtdaAula(aulas);
        System.out.println();
        p1.exibirDados();
        System.out.println();

        Funcionario f1 = new Funcionario();
        System.out.println("--------Dados do Funcionario------- ");
        System.out.print("Digite o nome: ");
        f1.setNome(in.next());
        System.out.print("Digite a idade: ");
        f1.setIdade(in.nextInt());
        System.out.print("Digite o CPF: ");
        f1.setCpf(in.next());
        System.out.print("Digite o cargo: ");
        f1.setCargo(in.next());
        System.out.print("Digite o Setor: ");
        f1.setSetor(in.next());
        System.out.print("Digite a tarefa: ");
        String tarefa = in.next();

        f1.tarefaExecutada(tarefa);
        System.out.println();
        f1.exibirDados();

        in.close();

    }
}
