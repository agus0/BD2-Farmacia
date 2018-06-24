package vista;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;

import datos.DetalleVenta;
import datos.Medicamento;
import datos.Perfume;
import datos.Producto;
import datos.Venta;
import negocio.SucursalABM;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GregorianCalendar fecha1 = new GregorianCalendar(2016,4,1);
		GregorianCalendar fecha2 = new GregorianCalendar(2018,5,30);
		
		SucursalABM abmSucursal = new SucursalABM();
		List<Object[]> lista = null;
		
		lista = abmSucursal.traerRankingProductosPorCantidadVendidaDeProductosDeLaCadena(fecha1,fecha2);
		
		
		System.out.println("RANKING DE VENTAS DE PRODUCTOS DE LA CADENA POR CANTIDAD");
		System.out.println("\n");
		
		for (Object[] object:lista){
			Producto producto = (Producto)object[0];
			Long cantidadVendida = (Long)object[1];
			
			String tipo = "";
			Perfume perfume = null;
			Medicamento medicamento = null;
			
			if (producto instanceof Perfume){
				perfume = (Perfume)producto;
				tipo = "Perfume: " + perfume.getComentario();
			}else if(producto instanceof Medicamento){
				medicamento = (Medicamento)producto;
				tipo ="Medicamento: " + medicamento.getComentario();
			}
			System.out.println("Descripcion: "+producto.getDescripcion()+"\t"+tipo+"\t\t\tPrecio: "+producto.getPrecio());
			System.out.println("Cantidad vendida: " + cantidadVendida);
			
			System.out.println("\n");
			System.out.println("______________________________________");
			System.out.println("\n");
		}
		
		//TRAER POR SUCURSAL
		int idSucursal = 1;		
		lista = abmSucursal.traerRankingProductosPorCantidadVendidaDeProductosDeLaSucursal(fecha1, fecha2, idSucursal);
		
		System.out.println("RANKING DE VENTAS DE PRODUCTOS POR CANTIDAD DE LA SUCURSAL Nº " + idSucursal);
		System.out.println("\n");
		
		for (Object[] object:lista){
			Producto producto = (Producto)object[0];
			Long cantidadVendida = (Long)object[1];
			
			String tipo = "";
			Perfume perfume = null;
			Medicamento medicamento = null;
			
			if (producto instanceof Perfume){
				perfume = (Perfume)producto;
				tipo = "Perfume: " + perfume.getComentario();
			}else if(producto instanceof Medicamento){
				medicamento = (Medicamento)producto;
				tipo ="Medicamento: " + medicamento.getComentario();
			}
			System.out.println("Descripcion: "+producto.getDescripcion()+"\t"+tipo+"\t\t\tPrecio: "+producto.getPrecio());
			System.out.println("Cantidad vendida: " + cantidadVendida);
			
			System.out.println("\n");
			System.out.println("______________________________________");
			System.out.println("\n");
		}
	}

}
