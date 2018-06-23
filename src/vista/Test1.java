package vista;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;

import datos.DetalleVenta;
import datos.Venta;
import negocio.SucursalABM;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GregorianCalendar fecha1 = new GregorianCalendar(2018,4,1);
		GregorianCalendar fecha2 = new GregorianCalendar(2018,5,30);

		SucursalABM abmSucursal = new SucursalABM();
		List<Venta> lista = null;

		//TRAER VENTAS DE LA CADENA
		lista = abmSucursal.traerVentasDeLaCadena(fecha1, fecha2);
		System.out.println("VENTAS DE LA CADENA");
		System.out.println("Total de ventas: " + lista.size());

		for (Venta venta: lista) {
			venta.print();
			
			System.out.println("\nDETALLE:");
			Set<DetalleVenta> listaDetalle = venta.getDetalleVentas();
	
			
			for (DetalleVenta detalle: listaDetalle) {
				detalle.print();
			}

			System.out.println("\n");
			System.out.println("______________________________________");
			System.out.println("\n");
		}

		//TRAER VENTAS POR SUCURSAL
		int idSucursal = 1;
		lista = abmSucursal.traerVentasPorSucursal(fecha1, fecha2, idSucursal);

		System.out.println("VENTAS DE LA SUCURSAL N� " + idSucursal);
		System.out.println("Total de ventas: " + lista.size());
		System.out.println("\n");

		for (Venta venta: lista) {
			venta.print();


			System.out.println("\nDETALLE:");
			Set<DetalleVenta> listaDetalle = venta.getDetalleVentas();
			
			for (DetalleVenta detalle: listaDetalle) {
				detalle.print();
			}

			System.out.println("\n");
			System.out.println("______________________________________");
			System.out.println("\n");
		}
	}

}
