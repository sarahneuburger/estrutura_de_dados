import java.util.Scanner;
public class MinhaApp{
	public static void main(String args[]){
	    Scanner teclado = new Scanner(System.in);
	    int key;

	    Registro r1 = new Registro(789, "Registro 1");
	    Registro r2 = new Registro(889, "Registro 2");

	    System.out.println(r1.hashCode());
	    System.out.println(r2.hashCode());

	    //Registro r1, r2, r3, r4;
	    MapaHash mapa = new MapaHash();

        mapa.put(new Registro(7865, "Isidro"));
	    mapa.put(new Registro(123,  "Josineidson"));
	    mapa.put(new Registro(987,  "Nilsonclecio"));
	    mapa.put(new Registro(9832, "Deosdedite"));
	    do{
	    	System.out.println("Digite um codigo de registro");
	    	key = teclado.nextInt();
	    	if (key != -1){

	    	    Registro r = mapa.get(key);
	    	    if (r != null){
	    	    	System.out.println("Registro Recuperado = "+r.getKey()+ " - "+r.getValue());
	    	    }
	    	    else{
	    	    	System.out.println("Registro nao existente");
	    	    }
	        } 

	    } while (key != -1);
	}
}