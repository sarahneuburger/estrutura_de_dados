import java.util.Scanner;
/*
  como invocar o MainApp?

  java MainApp [tamanhoDoVetorASerCriado] [qualAgoritmo] < arquivoComDadosDoVetor > arquivoDeSaida

  qualAlgoritmo   1- BubbleSort
  			      2- SelectionSort
  			      3- InsertionSort

*/
public class MainApp{
	public static void main(String args[]){
		Scanner teclado = new Scanner(System.in);
		int vetor[] = new int[Integer.parseInt(args[0])];
		int opcao = Integer.parseInt(args[1]);

		for (int i=0; i<vetor.length; i++){
			vetor[i] = teclado.nextInt();
		}

	    AlgoritmosDeOrdenacao alg = new AlgoritmosDeOrdenacao();
	    alg.setVetor(vetor);

	    long inicio = System.currentTimeMillis();
	    if (opcao == 1){
	    	alg.bubbleSort();
	    }
	    else if (opcao == 2){
	        alg.selectionSort();	
	    }
	    else if (opcao == 3){
	    	alg.insertionSort();
	    }	    
	    else if (opcao == 4){
	    	alg.quickSort(0, alg.getVetor().length-1);
	    }
	    long fim = System.currentTimeMillis();

	    System.out.println("Demorou pra ordenar "+(fim-inicio)+" millisegundos");
	    //alg.mostraVetor();
	}
}