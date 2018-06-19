package dao;

import java.util.GregorianCalendar;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

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
			lista = session.createQuery("from Venta v inner join fetch v.cliente inner join fetch v.vendedor inner join fetch v.cajero inner join fetch v.sucursal inner join fetch v.detalleVentas dv inner join fetch dv.producto where v.fecha >= :fecha1 and v.fecha <= :fecha2")
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
			lista = session.createQuery("from Venta v inner join fetch v.cliente inner join fetch v.vendedor inner join fetch v.cajero inner join fetch v.sucursal sucu inner join fetch v.detalleVentas dv inner join fetch dv.producto where sucu.id = :idSucursal and v.fecha >= :fecha1 and v.fecha <= :fecha2")
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
			lista = session.createQuery("from Venta v "
					+ "inner join fetch v.cliente cliente "
					+ "inner join fetch cliente.afiliado afiliado"
					+ "inner join fetch afiliado.obrasocial obrasocial"
					+ "inner join fetch v.vendedor "
					+ "inner join fetch v.cajero "
					+ "inner join fetch v.sucursal "
					+ "inner join fetch v.detalleVentas dv "
					+ "inner join fetch dv.producto "
					+ "where obrasocial.nombre = :nombreObraSocial "
					+ "and v.fecha >= :fecha1 and v.fecha <= :fecha2")
					.setParameter("fecha1", fecha1)
					.setParameter("fecha2", fecha2)
					.setParameter("nombreObraSocial", obraSocial)
					.list();
		}finally {
			session.close();
		}
		return lista;
	
	}
}
