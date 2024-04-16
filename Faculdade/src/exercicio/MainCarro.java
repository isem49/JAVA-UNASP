package exercicio;

public class MainCarro {

	public static void main(String[] args) {
		
		//Instaciando carro
		Carro meuCarro = new Carro();
		
		//setando valores para o carro
        meuCarro.setAno(2002);
        meuCarro.setMarca("Alguma ai");
        meuCarro.setModelo("teste");
        meuCarro.setCor("Azul");
        
        //exibindo valores do carro
        meuCarro.exibirInformacoes();
        System.out.println();
        
        //Aumentar velocidade do carro
        meuCarro.acelerar(100);
        
        //exibindo carro com a velocidade aumentada
        meuCarro.exibirInformacoes();
        System.out.println();
        //diminuir velocidade
        meuCarro.frear(50);
        
        //exibindo carro com a velocidade diminuida
        meuCarro.exibirInformacoes();
        
	}

}
