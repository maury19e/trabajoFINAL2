

public class Pronostico {

	Partido partido;
	int prons;
	boolean resul;
	public Pronostico(Partido partido, int prons) {
		this.partido = partido;
		this.prons = prons;
		}
	public void resultado(int r) {
		if(r==this.prons) {
			this.resul=true;
		}else if(r!=this.prons){
			this.resul=false;
		}
	}
	public boolean isResul() {
		return resul;
	}
	
}
