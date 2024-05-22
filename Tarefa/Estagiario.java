import java.util.ArrayList;

public class Estagiario extends Funcionario {

    private String supervisor;

    public Estagiario() {

    }

    public Estagiario(String nome, String cPF, double salario, String supervisor) {
        super(nome, cPF, salario);
        this.supervisor = supervisor;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public void exibirDetalhes() {
        System.out.println("------Informações---------");
        System.out.println("Nome: " + super.getNome());
        System.out.println("CPF: " + super.getCPF());
        System.out.println("Salario: " + super.getSalario());
        System.out.println("Supervisor: " + this.getSupervisor());

    }

}
