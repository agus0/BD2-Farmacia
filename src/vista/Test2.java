package vista;
import java.util.GregorianCalendar;
import java.util.List;

import datos.DetalleVenta;
import datos.Medicamento;
import datos.Perfume;
import datos.Producto;
import datos.Venta;
import negocio.DetalleVentaABM;
import negocio.Funciones;
import negocio.SucursalABM;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GregorianCalendar fecha1 = new GregorianCalendar(2018,4,1);
		GregorianCalendar fecha2 = new GregorianCalendar(2018,5,30);
		
		SucursalABM abmSucursal = new SucursalABM();
		DetalleVentaABM abmDetalleVenta = new DetalleVentaABM();
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
			System.out.println("Nro: " + (venta.getSucursal().getId() + "-" + venta.getId()));
			System.out.println("Forma pago: " + venta.getFormaPago());
			System.out.println("Total venta: " + venta.getTotalVenta());
			System.out.println("Fecha: " + Funciones.traerFechaCorta(venta.getFecha()));
			System.out.println("Cliente: " + venta.getCliente().getDni() + " " + venta.getCliente().getApellido());
			System.out.println("Vendedor: " + venta.getVendedor().getDni()  + " " +  venta.getVendedor().getApellido());
			System.out.println("Cajero: " + venta.getCajero().getDni()  + " " +  venta.getCajero().getApellido());
			System.out.println("Sucursal: " + venta.getSucursal().getId());

			System.out.println("\nDETALLE:");
			List<DetalleVenta> listaDetalle = abmDetalleVenta.traerDetallesVenta(venta.getId());
			
			for (DetalleVenta detalle: listaDetalle) {
				Producto producto = detalle.getProducto();
				Perfume perfume = null;
				Medicamento medicamento = null;

				System.out.println("ID: " + producto.getId());
				System.out.println("Laboratorio: " + producto.getLaboratorio());
				System.out.println("Descripcion: " + producto.getDescripcion());
				
				if (producto instanceof Perfume){
					perfume = (Perfume)producto;
					System.out.println("Perfume: " + perfume.getComentario());
				}else if(producto instanceof Medicamento){
					medicamento = (Medicamento)producto;
					System.out.println("Medicamento: " + medicamento.getComentario());
				}
				System.out.println("Precio: " + producto.getPrecio());
				System.out.println("\n");
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
			System.out.println("Nro: " + (venta.getSucursal().getId() + "-" + venta.getId()));
			System.out.println("Forma pago: " + venta.getFormaPago());
			System.out.println("Total venta: " + venta.getTotalVenta());
			System.out.println("Fecha: " + Funciones.traerFechaCorta(venta.getFecha()));
			System.out.println("Cliente: " + venta.getCliente().getDni() + " " + venta.getCliente().getApellido());
			System.out.println("Vendedor: " + venta.getVendedor().getDni()  + " " +  venta.getVendedor().getApellido());
			System.out.println("Cajero: " + venta.getCajero().getDni()  + " " +  venta.getCajero().getApellido());
			System.out.println("Sucursal: " + venta.getSucursal().getId());

			System.out.println("\nDETALLE:");
			List<DetalleVenta> listaDetalle = abmDetalleVenta.traerDetallesVenta(venta.getId());
			
			for (DetalleVenta detalle: listaDetalle) {
				Producto producto = detalle.getProducto();
				Perfume perfume = null;
				Medicamento medicamento = null;

				System.out.println("ID: " + producto.getId());
				System.out.println("Laboratorio: " + producto.getLaboratorio());
				System.out.println("Descripcion: " + producto.getDescripcion());
				
				if (producto instanceof Perfume){
					perfume = (Perfume)producto;
					System.out.println("Perfume: " + perfume.getComentario());
				}else if(producto instanceof Medicamento){
					medicamento = (Medicamento)producto;
					System.out.println("Medicamento: " + medicamento.getComentario());
				}
				System.out.println("Precio: " + producto.getPrecio());
				System.out.println("\n");
			}

			System.out.println("\n");
			System.out.println("______________________________________");
			System.out.println("\n");
		}
	}

}
