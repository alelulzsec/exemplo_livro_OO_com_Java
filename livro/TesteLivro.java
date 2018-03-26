import java.util.Scanner;
public class TesteLivro{

	public static void main(String args[]) {
		
		java.util.Scanner teclado = new java.util.Scanner(System.in)
		
			Livro l1 = new Livro();
			
			
			System.out.printf("Nome Do Livro: ");
			l1.nome = teclado.nextLine();
			
			System.out.printf("Nome Do Autor: ");
			l1.autor = teclado.nextLine();
			
			System.out.printf("Digite O Codigo: ");
			l1.cod = teclado.nextInt(); teclado.nextLine();
			
			System.out.printf("Informe A Edicao: ");
			l1.edicao = teclado.nextLine();
			
			System.out.printf("LISTANDO O LIVRO");
			
			System.out.printf("Nome Do Livro: %s\n", l1.nome);
			System.out.printf("Nome Do Autor: %s\n", l1.autor);
			System.out.printf("Codigo do Livro: %d\n", l1.cod);
			System.out.printf("Edicao: %s\n", l1.edicao);
		
	}


}
