
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
	}

}
