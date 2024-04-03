public class Carro {

    private String marca; 
    private String modelo;
    private int ano;
    private String cor;

    //Construtores
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    //metodos Gets
    public String getModelo() {
        return this.modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public String getCor() {
        return this.cor;
    }

    public String getMarca() {
        return this.marca;
    }

    //Metodos Sets
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    
    

    public void exibirInfo(){

        System.out.println("Ano: " + this.getAno());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());


    }

}
