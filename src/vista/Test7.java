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

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GregorianCalendar fecha1 = new GregorianCalendar(2016,4,1);
		GregorianCalendar fecha2 = new GregorianCalendar(2018,5,30);
		
		SucursalABM abmSucursal = new SucursalABM();
		List<Object[]> lista = null;
		
		lista = abmSucursal.traerRankingDeComprasDeClientesDeLaCadena(fecha1,fecha2);
		
		
		System.out.println("RANKING DE CLIENTES POR MONTO GASTADO DE LA CADENA");
		System.out.println("\n");
		
		for (Object[] object:lista){
			Cliente cliente = (Cliente)object[0];
			Float montoGastado = (Float)object[1];

			System.out.println(cliente);
			System.out.println("Monto gastado: $" + montoGastado);
			
			System.out.println("\n");
			System.out.println("______________________________________");
			System.out.println("\n");
		}
		
		//TRAER POR SUCURSAL
		int idSucursal = 3;		
		lista = abmSucursal.traerRankingDeComprasDeClientesDeLaSucursal(fecha1, fecha2, idSucursal);
		
		System.out.println("RANKING DE CLIENTES POR MONTO GASTADO DE LA SUCURSAL Nº " + idSucursal);
		System.out.println("\n");
		
		for (Object[] object:lista){
			Cliente cliente = (Cliente)object[0];
			Float montoGastado = (Float)object[1];

			System.out.println(cliente);
			System.out.println("Monto gastado: $" + montoGastado);
			
			System.out.println("\n");
			System.out.println("______________________________________");
			System.out.println("\n");
		}
	}

}
