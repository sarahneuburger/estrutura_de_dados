public class AlgoritmosDeOrdenacao{
	private int vetor[] = {25, 57, 48, 37, 12, 92, 33};

	public void setVetor(int vetor[]){
		this.vetor = vetor;
	}
	public int[] getVetor(){
		return vetor;
	}

	public void bubbleSort(){
		int it;     // numero de iteracoes
		int pos;    // sempre uso a posicao atual
		int temp;   // variavel para a troca

		//System.out.println("Realizando BubbleSort em um vetor de "+vetor.length+" elementos");

		for (it=0; it < vetor.length-1; it++){
			for (pos = 0; pos < vetor.length - it- 1; pos++){
				// comparo o elemento da posicao com seu proximo
				if (vetor[pos] > vetor[pos+1]){ // o elemento atual é maior que seu próximo?
					// entao troca
					temp         = vetor[pos];
					vetor[pos]   = vetor[pos+1];
					vetor[pos+1] = temp;
				}
			}

			//System.out.println("----------> Final da iteracao "+it);
			//mostraVetor();
		}
	}

	public void selectionSort(){
		int it, temp;
		int posMenorInicial;
		int posMenor;
		int i;

		for (it = 0; it < vetor.length-1; it++){
			posMenorInicial = it;
			posMenor = it+1;
			for (i = posMenorInicial +1; i < vetor.length; i++){
				if (vetor[i] < vetor[posMenor]){
					posMenor = i;
				}
			}
			if (vetor[posMenor] < vetor[posMenorInicial]){
					// troca
					temp = vetor[posMenorInicial];
					vetor[posMenorInicial] = vetor[posMenor];
					vetor[posMenor] = temp;
			}
			//System.out.println("Iteracao "+it);
			//mostraVetor();
		}
	}

	public void insertionSort(){
		int carta, it, j;
		// a iteracao vai "selecionar a carta da vez" e aí, tenho que "puxar" todos os elementos que são maiores
		for (it = 1; it < vetor.length; it++){
			carta = vetor[it]; // guardo a carta
			for (j = it-1; (j>=0) && vetor[j] > carta; j--){
				vetor[j+1] = vetor[j];  // estou trocando todos que são maiores do que eu
			}
			vetor[j+1] = carta;
			//System.out.println("------ Iteracao "+ it);
			//mostraVetor();
		}
	}

        public int  partition(int inicio, int fim){
    	    int ref, up, down, temp;

    	    ref  = vetor[inicio];
    	    down = inicio;
    	    up   = fim;

            while (down < up){
    		// encontrando um numero maior que o pivo (ref)
    		while (vetor[down] <= ref && down < fim){
    			down++; // avanço pq quero encontrar um valor maior
    		}
    		// tambem quero encontrar a partir do fim um valor menor que o meu de referencia
    		while (vetor[up] > ref){
    			up--;
    		}

    		if (down < up){  // eles não se cruzaram nos índices
    			//troca
    			temp        = vetor[down];
    			vetor[down] = vetor[up];
    			vetor[up]   = temp;
    		}
    	    }
    	    vetor[inicio] = vetor[up];
    	    vetor[up]     = ref;

    	    return up; // no final das contas é a posição de UP que denota onde está o pivô
        }
	public void quickSort(int inicio, int fim){
		int pivo;
		if (inicio > fim){
			return;
		}
		pivo = partition(inicio, fim);
		quickSort(inicio, pivo-1);
		quickSort(pivo+1, fim);
	}

	public void mostraVetor(){
		for (int i=0; i<vetor.length; i++){
			System.out.print(vetor[i]+ "  ");
		}
		System.out.println("");
	}
}