package negocio;

import java.util.List;

import dao.ObraSocialDao;
import datos.ObraSocial;

public class ObraSocialABM {
	ObraSocialDao dao = new ObraSocialDao();
	
	
/* 1.ABM */
	public int agregar(String nombre, String descripcion) {
		ObraSocial obraSocial = new ObraSocial(nombre, descripcion);
		return dao.agregar(obraSocial);
	}
	
	public void modificar(ObraSocial ObraSocial) {
		dao.actualizar(ObraSocial);	
	}
	
	public void eliminar(int idObraSocial) throws Exception {
		ObraSocial ObraSocial = dao.traerObraSocial(idObraSocial);
		if (ObraSocial==null)
			throw new Exception("El idObraSocial ingresado no se corresponde a ningun ObraSocial");
		dao.eliminar(ObraSocial);
	}
/* --- */
	
	
/* 2.TRAYENDO LA INFORMACION */
	public ObraSocial traerObraSocial(int idObraSocial) throws Exception{
		ObraSocial ObraSocial = dao.traerObraSocial(idObraSocial);
		if (ObraSocial==null)
			throw new Exception("ObraSocial nulo");
		return ObraSocial;
	}
	
	public ObraSocial traerObraSocialPorAtributo(int atributo) throws Exception{
		ObraSocial ObraSocial = dao.traerObraSocialPorAtributo(atributo);
		if (ObraSocial==null)
			throw new Exception("ObraSocial nulo");
		return ObraSocial;
	}
	
	public List<ObraSocial> traerObraSocial() {
		return dao.traerObraSocial();
	}
/* --- */
	
	
}
