package negocio;

import java.util.GregorianCalendar;
import java.util.List;

import dao.DomicilioDao;
import datos.Domicilio;
import datos.Producto;
import datos.Venta;
public class DomicilioABM {

	DomicilioDao dao = new DomicilioDao();
	
	
/* 1.ABM */
	public int agregar(String calle, String numero, String localidad, String provincia) {
		Domicilio domicilio = new Domicilio( calle,  numero,  localidad,  provincia);
		return dao.agregar(domicilio);
	}
	
	public void modificar(Domicilio domicilio) {
		dao.actualizar(domicilio);	
	}
	
	public void eliminar(int idDomicilio) throws Exception {
		Domicilio domicilio= dao.traerDomicilio(idDomicilio);
		if (domicilio==null)
			throw new Exception("El idDomicilio ingresado no se corresponde a ningun Domicilio");
		dao.eliminar(domicilio);
	}
/* --- */
	
	
/* 2.TRAYENDO LA INFORMACION */
	public Domicilio traerDomicilio(int idDomicilio) throws Exception{
		Domicilio domicilio = dao.traerDomicilio(idDomicilio);
		if (domicilio==null)
			throw new Exception("domicilio nulo");
		return domicilio;
	}
	
	
	public List<Domicilio> traerDomicilio() {
		return dao.traerDomicilio();
	}
/* --- */
	
	
}
