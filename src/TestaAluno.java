
public class TestaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Claudio";
		aluno1.rm = 211210;
		aluno1.data = "10/03/2022";
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Vitor";
		aluno2.rm = 211620;
		aluno2.data = "11/01/2019";
		
		System.out.println(aluno1.nome+" "+aluno1.rm+" "+aluno1.data);
		System.out.println(aluno2.nome+" "+aluno2.rm+" "+aluno2.data);
	
		
		aluno1.turma.periodo = "Manhã";
		aluno1.turma.serie = "7 ano";
		aluno1.turma.sigla = "AI-DS";
		aluno1.turma.tipo = "Ensino Fundamental";
		
		System.out.println(aluno1.turma.periodo);
		System.out.println(aluno1.turma.serie);
		System.out.println(aluno1.turma.sigla);
		System.out.println(aluno1.turma.tipo);
		
		aluno2.turma.periodo = "Tarde";
		aluno2.turma.serie = "2° ano";
		aluno2.turma.sigla = "AL";
		aluno2.turma.tipo = "Ensino Médio";
		
		System.out.println(aluno2.turma.periodo);
		System.out.println(aluno2.turma.serie);
		System.out.println(aluno2.turma.sigla);
		System.out.println(aluno2.turma.tipo);
	
	}

}
