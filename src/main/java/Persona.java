import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String nombre;
	List<Pronostico> pronosticos=new ArrayList<Pronostico>();
	int cont=0;
	private int cantPRO=0;
	public Persona(String nombre, List<Pronostico> pro) {
		this.nombre = nombre;
		this.pronosticos= pro ;
	}	
	public void resltados() {
		 for(Pronostico c: pronosticos) {
			Resultado.resul(c);
			if(c.resul) {
				cont++;
			}
		 }
	}
	
	
	public String mostrar() {
		
		return "el usuario "+this.nombre+" los puntos de pronosticos son "+this.cont;// TODO Auto-generated method stub

	}
}
