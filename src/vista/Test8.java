package vista;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;

import datos.Cliente;
import datos.DetalleVenta;
import datos.Medicamento;
import datos.Perfume;
import datos.Producto;
import datos.Venta;
import negocio.SucursalABM;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GregorianCalendar fecha1 = new GregorianCalendar(2016,4,1);
		GregorianCalendar fecha2 = new GregorianCalendar(2018,5,30);
		
		SucursalABM abmSucursal = new SucursalABM();
		List<Object[]> lista = null;
		
		lista = abmSucursal.traerRankingDeCantidadCompradaDeClientesDeLaCadena(fecha1,fecha2);
		
		
		System.out.println("RANKING DE CLIENTES POR CANTIDAD COMPRADA EN LA CADENA");
		System.out.println("\n");
		
		for (Object[] object:lista){
			Cliente cliente = (Cliente)object[0];
			Long cantidadComprada = (Long)object[1];

			System.out.println(cliente);
			System.out.println("Máxima cantidad de productos comprados: " + cantidadComprada);
			
			System.out.println("\n");
			System.out.println("______________________________________");
			System.out.println("\n");
		}
		
		//TRAER POR SUCURSAL
		int idSucursal = 1;		
		lista = abmSucursal.traerRankingDeCantidadCompradaDeClientesDeLaSucursal(fecha1, fecha2, idSucursal);
		
		System.out.println("RANKING DE CLIENTES POR CANTIDAD COMPRADA EN LA SUCURSAL Nº " + idSucursal);
		System.out.println("\n");
		
		for (Object[] object:lista){
			Cliente cliente = (Cliente)object[0];
			Long cantidadComprada = (Long)object[1];

			System.out.println(cliente);
			System.out.println("Máxima cantidad de productos comprados: " + cantidadComprada);
			
			System.out.println("\n");
			System.out.println("______________________________________");
			System.out.println("\n");
		}
	}

}
