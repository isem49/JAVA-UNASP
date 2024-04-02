public class App {
    public static void main(String[] args) throws Exception {
      
        Carro carro = new Carro();

        carro.setAno(2002);
        carro.setMarca("Alguma ai");
        carro.setModelo("teste");
        carro.setCor("Azul");

        /* 
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Cor: " + carro.getCor());
        */

        carro.exibirInfo();

    }
}
