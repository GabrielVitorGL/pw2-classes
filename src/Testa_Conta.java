
public class Testa_Conta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.agencia.num_conta = 1;
		conta.limite = 4599.99;
		conta.saldo = 3000.90;
		conta.numero = conta.agencia.num_conta;
		
		System.out.println(conta.agencia.num_conta);
		System.out.println(conta.limite);
		System.out.println(conta.saldo);
		System.out.println(conta.numero);
	}
}
