public class Livro extends Material {
    
    private int numeroPaginas;

    public Livro() {
        
    }

    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas) {
        super(titulo, autor, anoPublicacao);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void exibirDetalhes(){
        System.out.println("------Informações---------");
        System.out.println("Autor: " +  super.getAutor());
        System.out.println("Tituloi: " +  super.getTitulo());
        System.out.println("Ano da Publicação: " +  super.getAnoPublicacao());
        System.out.println("Número de Paginas: " +  this.getNumeroPaginas());
        
        
    }
    

}
