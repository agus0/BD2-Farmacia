package dao;

import java.util.GregorianCalendar;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.DetalleVenta;
import datos.Producto;
import datos.Sucursal;
import datos.Venta;

public class SucursalDao{
	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	private void manejaExcepcion(HibernateException he) throws HibernateException {
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}


	/* 1.ABM */
	//Agregar
	public int agregar(Sucursal objeto) {
		int id=0;
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		}catch(HibernateException he) {
			manejaExcepcion(he);
			throw he;
		}finally {
			session.close();
		}
		return id;
	}

	//Actualizar
	public void actualizar(Sucursal objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		}catch(HibernateException he) {
			manejaExcepcion(he);
			throw he;
		}finally {
			session.close();
		}
	}

	//Eliminar
	public void eliminar(Sucursal objeto) throws HibernateException {
		try {
			iniciaOperacion();
			session.delete(objeto);
			tx.commit();
		} catch (HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.close();
		}
	}
	/* --- */


	/* 2.TRAYENDO LA INFORMACION */
	//Mediante su clave primaria
	public Sucursal traerSucursal(int idSucursal) throws HibernateException {
		Sucursal objeto = null ;
		try {
			iniciaOperacion();
			objeto = (Sucursal)session.get(Sucursal.class, idSucursal);
		} finally {
			session.close();
		}
		return objeto;
	}


	//Traer en una lista todos los Persona's que hayan.
	@SuppressWarnings("unchecked")
	public List<Sucursal> traerSucursal() throws HibernateException {
		List<Sucursal> lista=null;

		try {
			iniciaOperacion();
			lista = session.createQuery("from Sucursal").list();
		}finally {
			session.close();
		}
		return lista;
	}
	/* --- */

	@SuppressWarnings("unchecked")
	public List<Venta> traerVentasDeLaCadena(GregorianCalendar fecha1, GregorianCalendar fecha2) {
		List<Venta> lista=null;

		try {
			iniciaOperacion();
			lista = session.createQuery("from Venta v "
					//+ "inner join fetch v.detalleVentas dv "
					//+ "inner join fetch dv.producto "
					+ "inner join fetch v.cliente "
					+ "inner join fetch v.vendedor "
					+ "inner join fetch v.cajero "
					+ "inner join fetch v.sucursal "
					+ "where v.fecha >= :fecha1 and v.fecha <= :fecha2")
					.setParameter("fecha1", fecha1)
					.setParameter("fecha2", fecha2)
					.list();
		}finally {
			session.close();
		}
		return lista;

	}

	@SuppressWarnings("unchecked")
	public List<Venta> traerVentasPorSucursal(GregorianCalendar fecha1, GregorianCalendar fecha2, int idSucursal) {
		List<Venta> lista=null;

		try {
			iniciaOperacion();
			lista = session.createQuery("from Venta v "
					//+ "inner join fetch v.detalleVentas dv "
					//+ "inner join fetch dv.producto "
					+ "inner join fetch v.cliente "
					+ "inner join fetch v.vendedor "
					+ "inner join fetch v.cajero "
					+ "inner join fetch v.sucursal sucu "
					+ "where sucu.id = :idSucursal and v.fecha >= :fecha1 and v.fecha <= :fecha2 order by v.id")
					.setParameter("fecha1", fecha1)
					.setParameter("fecha2", fecha2)
					.setParameter("idSucursal", idSucursal)
					.list();
		}finally {
			session.close();
		}
		return lista;
	}



	@SuppressWarnings("unchecked")
	public List<Venta> traerVentasDeLaCadenaPorObraSocial(GregorianCalendar fecha1, GregorianCalendar fecha2, String obraSocial) {
		List<Venta> lista=null;

		try {
			iniciaOperacion();
			if (obraSocial.isEmpty()){
				lista = session.createQuery("from Venta v "
						//+ "inner join fetch v.detalleVentas dv "
						//+ "inner join fetch dv.producto "
						+ "inner join fetch v.cliente cliente "
						+ "inner join fetch v.vendedor "
						+ "inner join fetch v.cajero "
						+ "inner join fetch v.sucursal "
						+ "where cliente.afiliado = null "
						+ "and v.fecha >= :fecha1 and v.fecha <= :fecha2")
						.setParameter("fecha1", fecha1)
						.setParameter("fecha2", fecha2)
						.list();
			}
			else {

				lista = session.createQuery("from Venta v "
						//+ "inner join fetch v.detalleVentas dv "
						//+ "inner join fetch dv.producto "
						+ "inner join fetch v.cliente cliente "
						+ "left join fetch cliente.afiliado afiliado "
						+ "left join fetch afiliado.obrasocial obrasocial "
						+ "inner join fetch v.vendedor "
						+ "inner join fetch v.cajero "
						+ "inner join fetch v.sucursal "
						+ "where obrasocial.nombre = :nombreObraSocial "
						+ "and v.fecha >= :fecha1 and v.fecha <= :fecha2")
						.setParameter("fecha1", fecha1)
						.setParameter("fecha2", fecha2)
						.setParameter("nombreObraSocial", obraSocial)
						.list();
			}
		}finally {
			session.close();
		}
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Venta> traerVentasDeLaCadenaPorObraSocialYSucursal(GregorianCalendar fecha1, GregorianCalendar fecha2, String obraSocial, int idSucursal) {
		List<Venta> lista=null;

		try {
			iniciaOperacion();
			if (obraSocial.isEmpty()){
				lista = session.createQuery("from Venta v "
						//+ "inner join fetch v.detalleVentas dv "
						//+ "inner join fetch dv.producto "
						+ "inner join fetch v.cliente cliente "
						+ "inner join fetch v.vendedor "
						+ "inner join fetch v.cajero "
						+ "inner join fetch v.sucursal "
						+ "where cliente.afiliado = null "
						+ "and v.fecha >= :fecha1 and v.fecha <= :fecha2")
						.setParameter("fecha1", fecha1)
						.setParameter("fecha2", fecha2)
						.list();
			}
			else {

				lista = session.createQuery("from Venta v "
						//+ "inner join fetch v.detalleVentas dv "
						//+ "inner join fetch dv.producto "
						+ "inner join fetch v.cliente cliente "
						+ "left join fetch cliente.afiliado afiliado "
						+ "left join fetch afiliado.obrasocial obrasocial "
						+ "inner join fetch v.vendedor "
						+ "inner join fetch v.cajero "
						+ "inner join fetch v.sucursal sucursal "
						+ "where obrasocial.nombre = :nombreObraSocial "
						+ "and sucursal.id = :idSucursal "
						+ "and v.fecha >= :fecha1 and v.fecha <= :fecha2")
						.setParameter("fecha1", fecha1)
						.setParameter("fecha2", fecha2)
						.setParameter("nombreObraSocial", obraSocial)
						.setParameter("idSucursal", idSucursal)
						.list();
			}
		}finally {
			session.close();
		}
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Venta> traerVentasDeLaCadenaPorMedioDePago(GregorianCalendar fecha1, GregorianCalendar fecha2, String medioDePago) {
		List<Venta> lista=null;

		try {
			iniciaOperacion();
			lista = session.createQuery("from Venta v "
					//+ "inner join fetch v.detalleVentas dv "
					//+ "inner join fetch dv.producto "
					+ "inner join fetch v.cliente "
					+ "inner join fetch v.vendedor "
					+ "inner join fetch v.cajero "
					+ "inner join fetch v.sucursal sucu "
					+ "where v.formaPago = :medioDePago "
					+ "and v.fecha >= :fecha1 and v.fecha <= :fecha2")
					.setParameter("fecha1", fecha1)
					.setParameter("fecha2", fecha2)
					.setParameter("medioDePago", medioDePago)
					.list();
		}finally {
			session.close();
		}
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Venta> traerVentasPorMedioDePagoYSucursal(GregorianCalendar fecha1, GregorianCalendar fecha2, String medioDePago, int idSucursal) {
		List<Venta> lista=null;

		try {
			iniciaOperacion();
			lista = session.createQuery("from Venta v "
					//+ "inner join fetch v.detalleVentas dv "
					//+ "inner join fetch dv.producto "
					+ "inner join fetch v.cliente "
					+ "inner join fetch v.vendedor "
					+ "inner join fetch v.cajero "
					+ "inner join fetch v.sucursal sucu "
					+ "where sucu.id = :idSucursal "
					+ "and v.formaPago = :medioDePago "
					+ "and v.fecha >= :fecha1 and v.fecha <= :fecha2")
					.setParameter("fecha1", fecha1)
					.setParameter("fecha2", fecha2)
					.setParameter("idSucursal", idSucursal)
					.setParameter("medioDePago", medioDePago)
					.list();
		}finally {
			session.close();
		}
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Venta> traerVentasDeProductosDeLaCadena(GregorianCalendar fecha1, GregorianCalendar fecha2) {
		List<Venta> lista=null;

		try {
			iniciaOperacion();
			lista = session.createQuery("from Venta v "
					//+ "inner join fetch v.detalleVentas dv "
					//+ "inner join fetch dv.producto "
					+ "inner join fetch v.cliente "
					+ "inner join fetch v.vendedor "
					+ "inner join fetch v.cajero "
					+ "inner join fetch v.sucursal "
					+ "where v.fecha >= :fecha1 and v.fecha <= :fecha2")
					.setParameter("fecha1", fecha1)
					.setParameter("fecha2", fecha2)
					.list();
		}finally {
			session.close();
		}
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Venta> traerVentasDeProductosDeLaSucursal(GregorianCalendar fecha1, GregorianCalendar fecha2, int idSucursal) {
		List<Venta> lista=null;

		try {
			iniciaOperacion();
			lista = session.createQuery("from Venta v "
					//+ "inner join fetch v.detalleVentas dv "
					//+ "inner join fetch dv.producto "
					+ "inner join fetch v.cliente "
					+ "inner join fetch v.vendedor "
					+ "inner join fetch v.cajero "
					+ "inner join fetch v.sucursal s "
					+ "where s.id = :idSucursal "
					+ "and v.fecha >= :fecha1 and v.fecha <= :fecha2")
					.setParameter("fecha1", fecha1)
					.setParameter("fecha2", fecha2)
					.setParameter("idSucursal", idSucursal)
					.list();
		}finally {
			session.close();
		}
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Venta> traerRankingDeVentasDeProductosDeLaCadena(GregorianCalendar fecha1, GregorianCalendar fecha2) {
		List<Venta> lista=null;

		try {
			iniciaOperacion();
			lista = session.createQuery("from Venta v "
					//+ "inner join fetch v.detalleVentas dv "
					//+ "inner join fetch dv.producto "
					+ "inner join fetch v.cliente "
					+ "inner join fetch v.vendedor "
					+ "inner join fetch v.cajero "
					+ "inner join fetch v.sucursal "
					+ "where v.fecha >= :fecha1 and v.fecha <= :fecha2 order by v.totalVenta desc")
					.setParameter("fecha1", fecha1)
					.setParameter("fecha2", fecha2)
					.list();
		}finally {
			session.close();
		}
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Venta> traerRankingDeVentasDeProductosDeLaSucursal(GregorianCalendar fecha1, GregorianCalendar fecha2, int idSucursal) {
		List<Venta> lista=null;

		try {
			iniciaOperacion();
			lista = session.createQuery("from Venta v "
					//+ "inner join fetch v.detalleVentas dv "
					//+ "inner join fetch dv.producto "
					+ "inner join fetch v.cliente "
					+ "inner join fetch v.vendedor "
					+ "inner join fetch v.cajero "
					+ "inner join fetch v.sucursal s "
					+ "where s.id = :idSucursal and v.fecha >= :fecha1 and v.fecha <= :fecha2 order by v.totalVenta desc")
					.setParameter("fecha1", fecha1)
					.setParameter("fecha2", fecha2)
					.setParameter("idSucursal", idSucursal)
					.list();
		}finally {
			session.close();
		}
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> traerRankingProductosPorCantidadVendidaDeProductosDeLaCadena(GregorianCalendar fecha1, GregorianCalendar fecha2) {
		List<Object[]> lista=null;
		
		try {
			iniciaOperacion();
			lista = session.createQuery("select dv.producto, sum(dv.cantidad) as total from DetalleVenta dv "
					+ "inner join dv.venta v "
					+ "where v.fecha >= :fecha1 and v.fecha <= :fecha2 group by dv.producto order by total desc")
					.setParameter("fecha1", fecha1)
					.setParameter("fecha2", fecha2)
					.list();
			
			
			/*Queries can return multiple objects and/or properties as an array of type Object[]:
			 * https://docs.jboss.org/hibernate/orm/4.0/manual/en-US/html/queryhql.html
			 * 
			 * for (Object[] obj:lista){
				System.out.println(obj[0] + " // " + obj[1]);
			}*/
			
		}finally {
			session.close();
		}
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> traerRankingProductosPorCantidadVendidaDeProductosDeLaSucursal(GregorianCalendar fecha1, GregorianCalendar fecha2, int idSucursal) {
		List<Object[]> lista=null;
		
		try {
			iniciaOperacion();
			lista = session.createQuery("select dv.producto, sum(dv.cantidad) as total from DetalleVenta dv "
					+ "inner join dv.venta v "
					+ "inner join v.sucursal s "
					+ "where s.id = :idSucursal and v.fecha >= :fecha1 and v.fecha <= :fecha2 group by dv.producto order by total desc")
					.setParameter("fecha1", fecha1)
					.setParameter("fecha2", fecha2)
					.setParameter("idSucursal", idSucursal)
					.list();
			
		}finally {
			session.close();
		}
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> traerRankingDeComprasDeClientesDeLaCadena(GregorianCalendar fecha1, GregorianCalendar fecha2) {
		List<Object[]> lista=null;

		try {
			iniciaOperacion();
			lista = session.createQuery("select v.cliente, max(v.totalVenta) as maximoGastado from Venta v "
					//+ "inner join fetch v.detalleVentas dv "
					//+ "inner join fetch dv.producto "
					+ "inner join v.cliente c "
					+ "where v.fecha >= :fecha1 and v.fecha <= :fecha2 group by c order by maximoGastado desc")
					.setParameter("fecha1", fecha1)
					.setParameter("fecha2", fecha2)
					.list();
		}finally {
			session.close();
		}
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> traerRankingDeComprasDeClientesDeLaSucursal(GregorianCalendar fecha1, GregorianCalendar fecha2, int idSucursal) {
		List<Object[]> lista=null;

		try {
			iniciaOperacion();
			lista = session.createQuery("select v.cliente, max(v.totalVenta) as maximoGastado from Venta v "
					//+ "inner join fetch v.detalleVentas dv "
					//+ "inner join fetch dv.producto "
					+ "inner join v.cliente c "
					+ "inner join v.sucursal s "
					+ "where s.id = :idSucursal and v.fecha >= :fecha1 and v.fecha <= :fecha2 group by c order by maximoGastado desc")
					.setParameter("fecha1", fecha1)
					.setParameter("fecha2", fecha2)
					.setParameter("idSucursal", idSucursal)
					.list();
		}finally {
			session.close();
		}
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> traerRankingDeCantidadCompradaDeClientesDeLaCadena(GregorianCalendar fecha1, GregorianCalendar fecha2) {
		List<Object[]> lista=null;

		try {
			iniciaOperacion();
			lista = session.createQuery("select v.cliente, sum(dv.cantidad) as totalCantidad from DetalleVenta dv "
					+ "inner join dv.venta v "
					+ "inner join v.cliente c "
					+ "where v.fecha >= :fecha1 and v.fecha <= :fecha2 group by c order by totalCantidad desc")
					.setParameter("fecha1", fecha1)
					.setParameter("fecha2", fecha2)
					.list();
		}finally {
			session.close();
		}
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> traerRankingDeCantidadCompradaDeClientesDeLaSucursal(GregorianCalendar fecha1, GregorianCalendar fecha2, int idSucursal) {
		List<Object[]> lista=null;

		try {
			iniciaOperacion();
			lista = session.createQuery("select v.cliente, sum(dv.cantidad) as totalCantidad from DetalleVenta dv "
					+ "inner join dv.venta v "
					+ "inner join v.cliente c "
					+ "inner join v.sucursal s "
					+ "where s.id = :idSucursal and v.fecha >= :fecha1 and v.fecha <= :fecha2 group by c order by totalCantidad desc")
					.setParameter("fecha1", fecha1)
					.setParameter("fecha2", fecha2)
					.setParameter("idSucursal", idSucursal)
					.list();
		}finally {
			session.close();
		}
		return lista;
	}
}
