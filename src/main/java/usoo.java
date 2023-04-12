
import java.util.ArrayList;
import java.util.List;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
//en el archivo de pronosticos en la posicion 1 se pone el numero del parido
//en la segunda posicion se pone el pronostico(1:ganadorEQUIPO1,2:ganadorEQUIPO2,0:Empate
public class usoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String archi[] = null;
		List<Persona> Personas=new ArrayList<Persona>();
		List<Partido> Partidos = new ArrayList<Partido>();
		List<Pronostico> pronosticos = new ArrayList<Pronostico>();
		int numRonda = 1;
		int ron=1;
		List<Ronda> rondas = new ArrayList<Ronda>();
		Path ARCHIVO = Paths.get("partidos.txt");
		Path ARCHIVO2 = Paths.get("pronosticos.txt");		
		String div[]=null;
		div=dividir(ARCHIVO,archi);
		int j=0;
		
		while(j<div.length) {
			numRonda= Integer.parseInt(div[j]);
			if(numRonda==ron) {		
			String equi1 = div[j+1];
			String equi2 = div[j+2];
			int gol1= Integer.parseInt(div[j+3]);
			int gol2= Integer.parseInt(div[j+4]);
			Equipo equipo1=new Equipo(equi1);
			Equipo equipo2=new Equipo(equi2);
			Partidos.add(new Partido(equipo1,equipo2,gol1,gol2));
			j++;
			System.out.println("hola");
			
			}else {
				System.out.println("hola");
				rondas.add(new Ronda(numRonda-1,Partidos));
				ron++;
				Partidos.clear();
			}
			
		}
		archi=null;
		String div1[]=null;
		div1=dividir(ARCHIVO2,archi);
		String condicion=div1[4];
		for(int ind=0;ind<div1.length;ind+=4) {	
			String nom = div1[ind];
			int ronda= Integer.parseInt(div1[ind+1]);
			int par= Integer.parseInt(div1[ind+2]);
			int pron= Integer.parseInt(div1[ind+3]);
			List<Partido> p=new ArrayList<Partido>();
			p=rondas.get(ronda).getPartidos();
			pronosticos.add(new Pronostico(p.get(par),pron));
			
			if(!nom.equals(condicion)) {
				Personas.add(new Persona(nom,pronosticos));
				condicion=div1[ind+4];
				pronosticos.clear();
			}
			}
		calcularSalida(Personas);
		mostrarFINL(Personas);
		
		}
	
	
	private static void calcularSalida(List<Persona> Personas) {
		for(Persona c:Personas) {
			c.resltados();
			}
			
	}
	private static void mostrarFINL(List<Persona> personas) {
		for(Persona c:personas) {
		System.out.println(c.mostrar());
		
	}
	}

	
	public static String[] dividir (Path aRCHIVO, String[] archiv) {
		try {
			for (String linea: Files.readAllLines(aRCHIVO)) {
				archiv=linea.split(" ");
			}

			} catch (IOException e) {
			e.printStackTrace();
			}
		return archiv;
	}
	
}
