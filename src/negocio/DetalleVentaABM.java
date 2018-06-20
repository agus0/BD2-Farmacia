package negocio;



import java.util.GregorianCalendar;
import java.util.List;

import dao.DetalleVentaDao;
import datos.DetalleVenta;
import datos.Producto;
import datos.Venta;
public class DetalleVentaABM {

	DetalleVentaDao dao = new DetalleVentaDao();
	
	
/* 1.ABM */
	public int agregar(Producto producto, int cantidad, float precioUnitario,float subtotal, Venta venta) {
		DetalleVenta detalleVenta = new DetalleVenta( producto,  cantidad,  precioUnitario,subtotal,  venta);
		return dao.agregar(detalleVenta);
	}
	
	public void modificar(DetalleVenta detalleVenta) {
		dao.actualizar(detalleVenta);	
	}
	
	public void eliminar(int idDetalleVenta) throws Exception {
		DetalleVenta detalleVenta= dao.traerDetalleVenta(idDetalleVenta);
		if (detalleVenta==null)
			throw new Exception("El idDetalleVenta ingresado no se corresponde a ningun DetalleVenta");
		dao.eliminar(detalleVenta);
	}
/* --- */
	
	
/* 2.TRAYENDO LA INFORMACION */
	public DetalleVenta traerDetalleVenta(int idDetalleVenta) throws Exception{
		DetalleVenta detalleVenta = dao.traerDetalleVenta(idDetalleVenta);
		if (detalleVenta==null)
			throw new Exception("detalleVenta nulo");
		return detalleVenta;
	}
	
	
	public List<DetalleVenta> traerDetalleVenta() {
		return dao.traerDetalleVenta();
	}
	
	public List<DetalleVenta> traerDetallesVenta(int idVenta) {
		return dao.traerDetallesVenta(idVenta);
	}
	
	
/* --- */
	
	
}
