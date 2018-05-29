package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Venta;

public class VentasDao{
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
	public int agregar(Venta objeto) {
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
	public void actualizar(Venta objeto) throws HibernateException {
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
	public void eliminar(Venta objeto) throws HibernateException {
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
	public Venta traerVenta(int idVenta) throws HibernateException {
		Venta objeto = null ;
		try {
			iniciaOperacion();
			objeto = (Venta)session.get(Venta.class, idVenta);
		} finally {
			session.close();
		}
		return objeto;
	}
	

	//Traer en una lista todos los Persona's que hayan.
	@SuppressWarnings("unchecked")
	public List<Venta> traerVenta() throws HibernateException {
		List<Venta> lista=null;

		try {
			iniciaOperacion();
			lista = session.createQuery("from Venta").list();
		}finally {
			session.close();
		}
		return lista;
	}
/* --- */
}
