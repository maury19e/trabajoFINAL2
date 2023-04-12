

public class Resultado {
	
	public static void resul(Pronostico pro) {
		if(pro.partido.golesEQUI1>pro.partido.golesEQUI2) {
		pro.resultado(1);
		}else if(pro.partido.golesEQUI2>pro.partido.golesEQUI1) {
			pro.resultado(2);
		}else if(pro.partido.golesEQUI2==pro.partido.golesEQUI1){
			pro.resultado(0);
		}
		

}
}