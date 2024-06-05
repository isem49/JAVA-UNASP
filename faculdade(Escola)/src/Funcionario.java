public abstract class Funcionario extends Pessoa {

    private String cargo;
    private String setor;

    public Funcionario() {

    }

    public Funcionario(String cargo, String setor) {
        this.cargo = cargo;
        this.setor = setor;
    }

    public Funcionario(String nome, int idade, String cpf, String cargo, String setor) {
        super(nome, idade, cpf);
        this.cargo = cargo;
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void exibirDados() {

        System.out.println("------Informações---------");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Setor: " + this.getSetor());
        System.out.println("Cargo: " + this.getCargo());

    }

}
