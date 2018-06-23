package vista;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;

import datos.DetalleVenta;
import datos.Venta;
import negocio.SucursalABM;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GregorianCalendar fecha1 = new GregorianCalendar(2018,4,1);
		GregorianCalendar fecha2 = new GregorianCalendar(2018,5,30);
		
		SucursalABM abmSucursal = new SucursalABM();
		List<Venta> lista = null;
		String obraSocial = "";
		
		//TRAER VENTAS DE LA CADENA POR OBRA SOCIAL O PRIVADO
		obraSocial = "OSECAC";
		//obraSocial = ""; //poner esto si se quiere ver por quienes no tienen obra social
		
		lista = abmSucursal.traerVentasDeLaCadenaPorObraSocial(fecha1, fecha2, obraSocial);
		
		System.out.println("VENTAS DE LA CADENA POR OBRA SOCIAL/PRIVADO");
		if (obraSocial.isEmpty())
			System.out.println("Sin obra social");
		else
			System.out.println("Obra social: " + obraSocial);	
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
		int idSucursal = 1;		
		lista = abmSucursal.traerVentasDeLaCadenaPorObraSocialYSucursal(fecha1, fecha2, obraSocial, idSucursal);
		
		System.out.println("VENTAS DE LA SUCURSAL Nº " + idSucursal);
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
