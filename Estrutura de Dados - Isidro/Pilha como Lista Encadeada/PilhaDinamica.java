public class PilhaDinamica implements IPilha{
	private Caixinha topo;

	public PilhaDinamica(){
		topo = null;
	}

	public void push(int elemento){
		Caixinha novo = new Caixinha();
		novo.setElemento(elemento);
		novo.setProximo(topo);

		topo = novo;

	}
	public int pop(){
		int elemento = topo.getElemento();
		topo = topo.getProximo();
		return elemento;
	}
	public boolean isEmpty(){
		return (topo == null);
	}
}