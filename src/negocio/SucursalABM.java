package negocio;

import java.util.GregorianCalendar;
import java.util.List;

import dao.SucursalDao;
import datos.Sucursal;
import datos.Venta;

public class SucursalABM {
	SucursalDao dao = new SucursalDao();



	/* 2.TRAYENDO LA INFORMACION */
	public Sucursal traerSucursal(int idSucursal) throws Exception{
		Sucursal sucursal = dao.traerSucursal(idSucursal);
		if (sucursal==null)
			throw new Exception("Sucursal nulo");
		return sucursal;
	}


	public List<Sucursal> traerSucursal() {
		return dao.traerSucursal();
	}
	/* --- */

	public List<Venta> traerVentasDeLaCadena(GregorianCalendar fecha1, GregorianCalendar fecha2) {
		return dao.traerVentasDeLaCadena(fecha1, fecha2);
	}

	public List<Venta> traerVentasDeLaCadenaPorObraSocial(GregorianCalendar fecha1, GregorianCalendar fecha2, String obraSocial) {
		return dao.traerVentasDeLaCadenaPorObraSocial(fecha1, fecha2, obraSocial);
	}

	public List<Venta> traerVentasPorSucursal(GregorianCalendar fecha1, GregorianCalendar fecha2, int idSucursal) {
		return dao.traerVentasPorSucursal(fecha1, fecha2, idSucursal);
	}

	public List<Venta> traerVentasDeLaCadenaPorObraSocialYSucursal(GregorianCalendar fecha1, GregorianCalendar fecha2, String obraSocial, int idSucursal){
		return dao.traerVentasDeLaCadenaPorObraSocialYSucursal(fecha1, fecha2, obraSocial, idSucursal);
	}

	public List<Venta> traerVentasDeLaCadenaPorMedioDePago(GregorianCalendar fecha1, GregorianCalendar fecha2, String medioDePago) {
		return dao.traerVentasDeLaCadenaPorMedioDePago(fecha1, fecha2, medioDePago);
	}
	public List<Venta> traerVentasPorMedioDePagoYSucursal(GregorianCalendar fecha1, GregorianCalendar fecha2, String medioDePago, int idSucursal) {
		return dao.traerVentasPorMedioDePagoYSucursal(fecha1, fecha2, medioDePago, idSucursal);
	}
	
	
}

