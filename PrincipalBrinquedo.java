package aula11;

public class PrincipalBrinquedo {

	public static void main(String[] args) {
		Carro c = new Carro("Azul","Fusca",5,"Cleitin");
		System.out.println("***********CARRO*************");
		System.out.println(c.getCor());
		System.out.println(c.getTipo());
		System.out.println(c.getVelocidade());
		System.out.println(c.getNome());
		
		Moto m = new Moto("Preto","Harley Davidson",6,"Nayara");
		System.out.println("***********MOTO**************");
		System.out.println(m.getCor());
		System.out.println(m.getTipo());
		System.out.println(m.getVelocidade());
		System.out.println(m.getNome());
		
		Navio n = new Navio("Vermelho","Cavalo",4,"Pérola Negra");
		System.out.println("***********NAVIO*************");
		System.out.println(n.getCor());
		System.out.println(n.getTipo());
		System.out.println(n.getVelocidade());
		System.out.println(n.getNome());
		
		System.out.println("*****************************");
	}

}
