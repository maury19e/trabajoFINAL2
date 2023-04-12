import java.util.ArrayList;
import java.util.List;

public class Ronda {
	private int nro;
	List<Partido> partidos=new ArrayList<Partido>();
	
	public Ronda(int ronda,List<Partido> p) {
		this.nro = nro;
		this.partidos=p;
		
	}

	public List<Partido> getPartidos() {
		return partidos;
	}
	

}
