public class Funcionario extends Pessoa {

    private String cargo;
    private String setor;
    private String tarefaExecutada;

    public Funcionario() {

    }

    public Funcionario(String cargo, String setor, String tarefaExecutada) {
        this.cargo = cargo;
        this.setor = setor;
        this.tarefaExecutada = tarefaExecutada;
    }

    public Funcionario(String nome, int idade, String cpf, String cargo, String setor, String tarefaExecutada) {
        super(nome, idade, cpf);
        this.cargo = cargo;
        this.setor = setor;
        this.tarefaExecutada = tarefaExecutada;
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

    public void tarefaExecutada(String tarefaExecutada) {

        this.tarefaExecutada = tarefaExecutada;
    }

    public String getTarefaExecutada() {
        return tarefaExecutada;
    }

    public void setTarefaExecutada(String tarefaExecutada) {
        this.tarefaExecutada = tarefaExecutada;
    }

    public void exibirDados() {

        System.out.println("------Informações---------");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Setor: " + this.getSetor());
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Tarefa: " + this.getTarefaExecutada());

    }

}
