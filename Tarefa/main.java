import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws Exception {

        Gerente g1 = new Gerente();
        g1.setNome("Gerente");
        g1.setCPF("111.111.111-11");
        g1.setSalario(10000);
        g1.setBonus(1000);

        Gerente g2 = new Gerente();
        g2.setNome("Gerente 2");
        g2.setCPF("222.222.222-22");
        g2.setSalario(20000);
        g2.setBonus(2000);

        ArrayList<Gerente> Ger = new ArrayList<Gerente>();
        ArrayList<Desenvolvedor> dev = new ArrayList<Desenvolvedor>();
        ArrayList<Estagiario> est = new ArrayList<Estagiario>();

        Ger.add(g1);
        Ger.add(g2);

        for (var item : Ger) {
            item.exibirDetalhes();
            System.out.println();
        }

        Estagiario e1 = new Estagiario();
        e1.setNome("Est 1");
        e1.setCPF("111.111.111-11");
        e1.setSalario(10000);
        e1.setSupervisor("testildo");

        Estagiario e2 = new Estagiario();
        e2.setNome("Est 2");
        e2.setCPF("111.111.111-11");
        e2.setSalario(10000);
        e2.setSupervisor("testildo");

        est.add(e1);
        est.add(e2);

        for (var item : est) {
            item.exibirDetalhes();
            System.out.println();
        }

        Desenvolvedor d1 = new Desenvolvedor();
        d1.setNome("Est 1");
        d1.setCPF("111.111.111-11");
        d1.setSalario(10000);
        d1.setLinguagemPrincipal("JAVA 1");

        Desenvolvedor d2 = new Desenvolvedor();
        d2.setNome("Est 2");
        d2.setCPF("111.111.111-11");
        d2.setSalario(10000);
        d2.setLinguagemPrincipal("C#");

        dev.add(d1);
        dev.add(d2);

        for (var item : dev) {
            item.exibirDetalhes();
            System.out.println();
        }
    }
}
