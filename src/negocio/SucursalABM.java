package negocio;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import dao.SucursalDao;
import datos.DetalleVenta;
import datos.Medicamento;
import datos.Perfume;
import datos.Producto;
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

	///tipoProducto = 1 para Medicamento / 2 = perfume 
	public List<Venta> traerVentasDeProductosDeLaCadena(GregorianCalendar fecha1, GregorianCalendar fecha2, int tipoProducto){
		List<Venta> listaSalida = new ArrayList<Venta>();
		List<Venta> listaTotal = dao.traerVentasDeProductosDeLaCadena(fecha1, fecha2);

		for (Venta venta:listaTotal){
			Set<DetalleVenta> detalleVentas = venta.getDetalleVentas();

			Iterator<DetalleVenta> itr = detalleVentas.iterator();
			boolean continuar = true;
			while (itr.hasNext()& continuar){
				Producto producto = itr.next().getProducto();
				if (tipoProducto == 1){
					if (producto instanceof Medicamento){
						listaSalida.add(venta);
						continuar = false;
					}
				}
				else if (tipoProducto == 2){
					if (producto instanceof Perfume){
						listaSalida.add(venta);
						continuar = false;
					}
				}
			}
		}

		return listaSalida;
	}

	public List<Venta> traerVentasDeProductosDeLaSucursal(GregorianCalendar fecha1, GregorianCalendar fecha2, int tipoProducto, int idSucursal) {
		List<Venta> listaSalida = new ArrayList<Venta>();
		List<Venta> listaTotal = dao.traerVentasDeProductosDeLaSucursal(fecha1, fecha2, idSucursal);

		for (Venta venta:listaTotal){
			Set<DetalleVenta> detalleVentas = venta.getDetalleVentas();

			Iterator<DetalleVenta> itr = detalleVentas.iterator();
			boolean continuar = true;
			while (itr.hasNext()& continuar){
				Producto producto = itr.next().getProducto();
				if (tipoProducto == 1){
					if (producto instanceof Medicamento){
						listaSalida.add(venta);
						continuar = false;
					}
				}
				else if (tipoProducto == 2){
					if (producto instanceof Perfume){
						listaSalida.add(venta);
						continuar = false;
					}
				}
			}
		}

		return listaSalida;
	}

	public List<Venta> traerRankingDeVentasDeProductosDeLaCadena(GregorianCalendar fecha1, GregorianCalendar fecha2) {
		return dao.traerRankingDeVentasDeProductosDeLaCadena(fecha1, fecha2);
	}

	public List<Venta> traerRankingDeVentasDeProductosDeLaSucursal(GregorianCalendar fecha1, GregorianCalendar fecha2, int idSucursal) {
		return dao.traerRankingDeVentasDeProductosDeLaSucursal(fecha1, fecha2, idSucursal);
	}

	public List<Object[]> traerRankingProductosPorCantidadVendidaDeProductosDeLaCadena(GregorianCalendar fecha1, GregorianCalendar fecha2) {
		return dao.traerRankingProductosPorCantidadVendidaDeProductosDeLaCadena(fecha1, fecha2);
	}

	public List<Object[]> traerRankingProductosPorCantidadVendidaDeProductosDeLaSucursal(GregorianCalendar fecha1, GregorianCalendar fecha2, int idSucursal) {
		return dao.traerRankingProductosPorCantidadVendidaDeProductosDeLaSucursal(fecha1, fecha2, idSucursal);
	}
	
	public List<Object[]> traerRankingDeComprasDeClientesDeLaCadena(GregorianCalendar fecha1, GregorianCalendar fecha2) {
		return dao.traerRankingDeComprasDeClientesDeLaCadena(fecha1,fecha2);
	}
	
	public List<Object[]> traerRankingDeComprasDeClientesDeLaSucursal(GregorianCalendar fecha1, GregorianCalendar fecha2, int idSucursal) {
		return dao.traerRankingDeComprasDeClientesDeLaSucursal(fecha1,fecha2, idSucursal);
	}
	
	public List<Object[]> traerRankingDeCantidadCompradaDeClientesDeLaCadena(GregorianCalendar fecha1, GregorianCalendar fecha2) {
		return dao.traerRankingDeCantidadCompradaDeClientesDeLaCadena(fecha1,fecha2);
	}
	
	public List<Object[]> traerRankingDeCantidadCompradaDeClientesDeLaSucursal(GregorianCalendar fecha1, GregorianCalendar fecha2, int idSucursal) {
		return dao.traerRankingDeCantidadCompradaDeClientesDeLaSucursal(fecha1, fecha2, idSucursal);
	}
}

