import java.util.Scanner;

public class MinhaApp{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
	    Colecao colecao = new Colecao();
	    int valor, pos;
	    do{
	    	System.out.println("----------Digite um valor a ser pesquisado (-1 para encerrar)");
	    	valor = teclado.nextInt();
	    	if (valor != -1){

	    		System.out.println(" >> Busca Sequencial ");
	    		pos = colecao.buscaSequencial(valor);
	    		System.out.println(" >> Busca Binaria");
	    		pos = colecao.buscaBinaria(valor);
	    	}
	    } while (valor != -1);

	}
}