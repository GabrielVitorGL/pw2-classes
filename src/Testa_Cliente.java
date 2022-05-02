
public class Testa_Cliente {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.codigo = 1;
		cliente.nome = "Clebão da JBL";
		cliente.status = Status_Cliente.ATIVO;
		
		System.out.println(cliente.codigo);
		System.out.println(cliente.nome);
		System.out.println(cliente.status);
	}
}
