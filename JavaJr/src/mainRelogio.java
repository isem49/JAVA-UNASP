public class mainRelogio {
    public static void main(String[] args) throws Exception {
      
        Relogio meuRelogio = new Relogio();

        //carro.setAno(2002);
        //carro.setMarca("Alguma ai");
        //carro.setModelo("teste");
       //carro.setCor("Azul");

        meuRelogio.setHoras(24, 60);
       
        meuRelogio.mostrarHora();
        meuRelogio.incrementarMinutos();
        meuRelogio.mostrarHora();

    }
}
