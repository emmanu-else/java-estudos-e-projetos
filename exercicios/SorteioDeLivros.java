

import java.util.Random;

public class SorteioDeLivros
{
	public static void main(String[] args) {
		String [] meuslivros = {
		    "Parceira",
		    "Sem defeitos",
		    "Com amor, mãe",
		    "A metamorfose",
		    "O despertar da lua caida",
		    "Katabasis"};
		    
		    Random random = new Random ();
		    
		    int indiceSorteado = random.nextInt(meuslivros.length);
		    String livroSorteado =  meuslivros [indiceSorteado];
		    
		    System.out.println("=====SORTEIO DE LIVROS=====");
		    System.out.println("O livro sorteado para a minha próxima leitura é: ");
		    System.out.println("->" + livroSorteado);
		  
		    
	}
}

