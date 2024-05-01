public class Main {
    public static void main(String[] args) throws Exception {
        
        Pessoa p1 = new Pessoa();
        p1.setNome("Júnior");
        p1.setIdade(21);
        p1.setAltura(10);
        
        p1.exibirInfo();
        System.out.println();

        p1.fazerAniversario();

        p1.exibirInfo();
        System.out.println();

        Aluno a1 = new Aluno();
        a1.setNome("Ricardo");
        a1.setIdade(21);
        a1.setAltura(1.6);
        a1.setCurso("CC");
        a1.setMatricula(202001);
        
        a1.exibirInfo();



    }
}
