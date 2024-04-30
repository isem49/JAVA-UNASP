package exercicio;

public class MainAluno {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();

		aluno1.setNome("Júnior");
		aluno1.setMatricula("2020001");
		aluno1.setCurso("CC");
		aluno1.setAnoDeIngresso(2020);

		aluno1.imprimirInfo();
		aluno1.tempoDeCurso();

		Aluno alunos[] = new Aluno[6];

		Aluno aluno = new Aluno("Não sei", "202001", "CC", 2000);
		alunos[0] = aluno;

		Aluno aluno2 = new Aluno("Cícero", "202001", "CC", 2001);
		alunos[1] = aluno2;

		Aluno aluno3 = new Aluno("Ricardo", "202001", "CC", 2002);
		alunos[2] = aluno3;

		Aluno aluno4 = new Aluno("Farias", "202001", "CC", 1000);
		alunos[3] = aluno4;

		Aluno aluno5 = new Aluno("Junior", "202001", "CC", 2004);
		alunos[4] = aluno5;

		Aluno aluno6 = new Aluno("Aluno", "202001", "CC", 1019);
		alunos[5] = aluno6;

		
		System.out.println();
		int menor = 2024;
		String nomeAluno = "Ninguém";
		
		for (int i = 0; i < alunos.length; i++) {
			if (alunos[i].getAnoDeIngresso() < menor) {

				menor = alunos[i].getAnoDeIngresso();
				nomeAluno = alunos[i].getNome();

			}
		}

		System.out.println("O Veterano é: " + nomeAluno);

		
	}

	
	
}
