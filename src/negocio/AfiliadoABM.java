package negocio;
import java.util.GregorianCalendar;
import java.util.List;

import dao.AfiliadoDao;
import datos.Afiliado;
import datos.ObraSocial;

public class AfiliadoABM {

	AfiliadoDao dao = new AfiliadoDao();
	
	
/* 1.ABM */
	public int agregar(int numafiliado, ObraSocial obrasocial, GregorianCalendar fecafiliacion) {
		Afiliado afiliado = new Afiliado(numafiliado,obrasocial,fecafiliacion);
		return dao.agregar(afiliado);
	}
	
	public void modificar(Afiliado afiliado) {
		dao.actualizar(afiliado);	
	}
	
	public void eliminar(int idAfiliado) throws Exception {
		Afiliado afiliado= dao.traerAfiliado(idAfiliado);
		if (afiliado==null)
			throw new Exception("El idAfiliado ingresado no se corresponde a ningun afiliado");
		dao.eliminar(afiliado);
	}
/* --- */
	
	
/* 2.TRAYENDO LA INFORMACION */
	public Afiliado traerAfiliado(int idAfiliado) throws Exception{
		Afiliado afiliado = dao.traerAfiliado(idAfiliado);
		if (afiliado==null)
			throw new Exception("afiliado nulo");
		return afiliado;
	}
	
	public Afiliado traerAfiliadoPorNumeroDeAfiliado(int numafiliado) throws Exception{
		Afiliado afiliado = dao.traerAfiliadoPorNumeroDeAfiliado(numafiliado);
		if (afiliado==null)
			throw new Exception("afiliado nulo");
		return afiliado;
	}
	
	public List<Afiliado> traerAfiliado() {
		return dao.traerAfiliado();
	}
/* --- */
	
	
}
