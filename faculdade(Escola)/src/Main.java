import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);

        List<String> cursos = new ArrayList<String>();
        String nomeCurso;
        String verificador;

       while(nomeCurso.equalsIgnoreCase("parar") ){

             verificador = "Sim";
            
            if(verificador.equalsIgnoreCase("Sim" ){
                System.out.println("Digite o nome do curso: ");  
                cursos.add(in.next());       
            }
                
            System.out.println("Deseja continuar com a matricula? ");
            verificador = in.next();
            

       }


       /* 
        Ger.add(g1);
        Ger.add(g2);

        for (var item : Ger) {
            item.exibirDetalhes();
            System.out.println();
        }

        */

        Aluno a1 = new Aluno();
        System.out.print("Digite seu nome: ");
        a1.setNome(in.next());
        System.out.print("Digite sua idade: ");
        a1.setIdade(in.nextInt());
        System.out.print("Digite sua matricula: ");
        a1.setMatricula(in.nextInt());
        System.out.print("Digite seu CPF: ");
        a1.setCpf(in.next());
        a1.setCurso(cursos);


    }
}
