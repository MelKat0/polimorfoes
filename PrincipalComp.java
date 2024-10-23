package aula11;

public class PrincipalComp {

	public static void main(String[] args) {
		Computador computador = new Computador("Gamer","processador");
		
		System.out.println("O computador "+computador.getModelo()+"\ntem um processador com frequencia "+computador.getProcessador());
	}

}
