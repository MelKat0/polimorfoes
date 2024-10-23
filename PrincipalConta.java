package aula11;

public class PrincipalConta {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("988152512",90000);
		Cliente cliente = new Cliente("Samuel",conta);
		
		System.out.println("A conta de número " + conta.getNumero() +", do cliente " + cliente.getNome()+"\ntem o saldo de "+conta.getSaldo());
	}

}
