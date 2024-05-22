import java.util.ArrayList;

public class Gerente extends Funcionario {

    private double bonus;

    public Gerente() {

    }

    public Gerente(String nome, String cPF, double salario, double bonus) {
        super(nome, cPF, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    
    public void exibirDetalhes() {
        System.out.println("------Informações---------");
        System.out.println("Nome: " + super.getNome());
        System.out.println("CPF: " + super.getCPF());
        System.out.println("Salario: " + super.getSalario());
        System.out.println("Bonus: " + this.getBonus());
    }

}