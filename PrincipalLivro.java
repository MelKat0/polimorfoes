package aula11;

public class PrincipalLivro {

	public static void main(String[] args) {
		Livro livro = new Livro("Percy Jackson", "Rick Riordan");
		Biblioteca biblio = new Biblioteca("Municipal",livro);
		
		System.out.println("A biblioteca "+biblio.getNome()+ " contém o livro "+livro.getTitulo()+"\ndo autor "+livro.getAutor());
		biblio.exibirInfo();
	}

}
