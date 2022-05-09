
public class Testa_Funcionario {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.cargo = "professor";
		funcionario.salario = 5000.00;
		funcionario.endereco.logradouro = "Rua do jacaré";
		funcionario.endereco.bairro = "Bairro do Limoeiro";
		funcionario.endereco.cidade = "Rio de Janeiro";
		funcionario.endereco.estado = "RJ";
		
		System.out.println(funcionario.cargo);
		System.out.println(funcionario.salario);
		System.out.println(funcionario.endereco.logradouro);
		System.out.println(funcionario.endereco.bairro);
		System.out.println(funcionario.endereco.cidade);
		System.out.println(funcionario.endereco.estado);
		
	}
}
