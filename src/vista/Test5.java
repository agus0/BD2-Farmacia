package vista;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;

import datos.DetalleVenta;
import datos.Venta;
import negocio.SucursalABM;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GregorianCalendar fecha1 = new GregorianCalendar(2016,4,1);
		GregorianCalendar fecha2 = new GregorianCalendar(2018,5,30);
		
		SucursalABM abmSucursal = new SucursalABM();
		List<Venta> lista = null;
		
		lista = abmSucursal.traerRankingDeVentasDeProductosDeLaCadena(fecha1, fecha2);
		
		System.out.println("RANKING DE VENTAS DE PRODUCTOS DE LA CADENA POR MONTO");
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
		
		//TRAER VENTAS POR SUCURSAL
		int idSucursal = 3;		
		lista = abmSucursal.traerRankingDeVentasDeProductosDeLaSucursal(fecha1, fecha2, idSucursal);
		
		System.out.println("RANKING DE VENTAS DE PRODUCTOS POR MONTO DE LA SUCURSAL Nº " + idSucursal);
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
