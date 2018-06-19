package vista;
import java.util.GregorianCalendar;
import java.util.List;

import datos.Venta;
import negocio.Funciones;
import negocio.SucursalABM;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GregorianCalendar fecha1 = new GregorianCalendar(2018,5,1);
		GregorianCalendar fecha2 = new GregorianCalendar(2018,5,30);
		
		SucursalABM abmSucursal = new SucursalABM();
		List<Venta> lista = null;
		String obraSocial = "";
		
		//TRAER VENTAS DE LA CADENA POR OBRA SOCIAL
		obraSocial = "OSECAC";
		lista = abmSucursal.traerVentasDeLaCadenaPorObraSocial(fecha1, fecha2, obraSocial);
		
		System.out.println("VENTAS DE LA CADENA POR OBRA SOCIAL");
		System.out.println("Obra social: " + obraSocial);
		System.out.println("Total de ventas: " + lista.size());
		System.out.println("\n");
		
		for (Venta venta: lista) {
			System.out.println("Nro: " + (venta.getSucursal().getId() + "-" + venta.getId()));
			System.out.println("Forma pago: " + venta.getFormaPago());
			System.out.println("Total venta: " + venta.getTotalVenta());
			System.out.println("Fecha: " + Funciones.traerFechaCorta(venta.getFecha()));
			System.out.println("Cliente: " + venta.getCliente().getDni() + venta.getCliente().getApellido());
			System.out.println("Vendedor: " + venta.getVendedor().getDni() + venta.getCliente().getApellido());
			System.out.println("Cajero: " + venta.getCajero().getDni() + venta.getCajero().getApellido());
			System.out.println("Sucursal: " + venta.getSucursal().getId());
			System.out.println("\n");
		}
		
		/*//TRAER VENTAS POR SUCURSAL
		int idSucursal = 1;
		lista = abmSucursal.traerVentasPorSucursal(fecha1, fecha2, idSucursal);
		
		System.out.println("VENTAS DE LA SUCURSAL Nº " + idSucursal);
		System.out.println("Total de ventas: " + lista.size());
		System.out.println("\n");
		
		for (Venta venta: lista) {
			System.out.println("Nro: " + (venta.getSucursal().getId() + "-" + venta.getId()));
			System.out.println("Forma pago: " + venta.getFormaPago());
			System.out.println("Total venta: " + venta.getTotalVenta());
			System.out.println("Fecha: " + Funciones.traerFechaCorta(venta.getFecha()));
			System.out.println("Cliente: " + venta.getCliente().getDni() + venta.getCliente().getApellido());
			System.out.println("Vendedor: " + venta.getVendedor().getDni() + venta.getCliente().getApellido());
			System.out.println("Cajero: " + venta.getCajero().getDni() + venta.getCajero().getApellido());
			System.out.println("Sucursal: " + venta.getSucursal().getId());
			System.out.println("\n");
		}*/
	}

}
