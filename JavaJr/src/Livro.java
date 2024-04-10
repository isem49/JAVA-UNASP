public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean emprestado = false;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isEmprestado() {
        return emprestado;
    }


    public Livro() {
       
    }

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false;
    }

    public void emprestar(){
            this.emprestado = true;        
    }

    public void devolver(){
        this.emprestado = false;       
    }

    public void exibirInformacoes(){

        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Ano da Publicação: " + this.getAnoPublicacao());
        System.out.println("Emprestado: " + this.isEmprestado());


    }



    
}
