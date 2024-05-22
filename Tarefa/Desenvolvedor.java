import java.util.ArrayList;

public class Desenvolvedor extends Funcionario {

    private String linguagemPrincipal;

    public Desenvolvedor() {
       
    }

    public Desenvolvedor(String nome, String cPF, double salario, String linguagemPrincipal) {
        super(nome, cPF, salario);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }
    
    public void exibirDetalhes(){
        System.out.println("------Informações---------");
        System.out.println("Nome: " + super.getNome()  );
        System.out.println("CPF: " +  super.getCPF());
        System.out.println("Salario: " +  super.getSalario());
        System.out.println("linguagem Principal: " +  this.getLinguagemPrincipal());
    }
         

    
}
