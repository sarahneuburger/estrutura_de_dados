public class CaixinhaDupla{
	private int elemento;
	private CaixinhaDupla anterior;
	private CaixinhaDupla proximo;

	public void setElemento(int elemento){
		this.elemento = elemento;
	}
	public void setAnterior(CaixinhaDupla anterior){
		this.anterior = anterior;
	}
	public void setProximo(CaixinhaDupla proximo){
		this.proximo = proximo;
	}
	public int getElemento(){
		return this.elemento;
	}
	public CaixinhaDupla getAnterior(){
		return this.anterior;
	}
	public CaixinhaDupla getProximo(){
		return this.proximo;
	}
}