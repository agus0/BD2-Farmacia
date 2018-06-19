package vista;
import negocio.ObraSocialABM;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ObraSocialABM obraSocialABM = new ObraSocialABM();
		//obraSocialABM.agregar("Osmecon", "Nos importa poco tu salud");
		try {
			obraSocialABM.traerObraSocial(1);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
