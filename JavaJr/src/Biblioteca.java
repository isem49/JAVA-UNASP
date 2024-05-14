public class Biblioteca {
    public static void main(String[] args) throws Exception {
        
        Livro l1 = new Livro();
        Revista r1 = new Revista();

        l1.setTitulo("Num sei");
        l1.setAutor("Sem nome");
        l1.setAnoPublicacao(2024);
        l1.setNumeroPaginas(19);

        r1.setTitulo("Revista: num sei");
        r1.setAutor("Sem nome 2");
        r1.setMesPublicacao("Maio");
        r1.setEdicao(2);
        r1.setAnoPublicacao(2024);

        l1.exibirDetalhes();
        System.out.println();
        r1.exibirDetalhes();
    }
}
