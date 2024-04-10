public class MainLivro {
    public static void main(String[] args) throws Exception {
       
        Livro meuLivro = new Livro();

        meuLivro.setAutor("Junior");
        meuLivro.setTitulo("Um livro sobre algo");
        meuLivro.setAnoPublicacao(2024);
        System.out.println("Exibir 1: ");
        meuLivro.exibirInformacoes();
        meuLivro.emprestar();
        System.out.println();
        System.out.println("Exibir 2: ");
        meuLivro.exibirInformacoes();
        meuLivro.devolver();
        System.out.println();
        System.out.println("Exibir 3: ");
        meuLivro.exibirInformacoes();


    }
}
