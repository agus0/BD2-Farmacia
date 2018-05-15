package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.ObraSocial;

public class ObraSocialDao {
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
	public int agregar(ObraSocial objeto) {
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
	public void actualizar(ObraSocial objeto) throws HibernateException {
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
	public void eliminar(ObraSocial objeto) throws HibernateException {
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
	public ObraSocial traerObraSocial(int idObraSocial) throws HibernateException {
		ObraSocial objeto = null ;
		try {
			iniciaOperacion();
			objeto = (ObraSocial)session.get(ObraSocial.class, idObraSocial);
		} finally {
			session.close();
		}
		return objeto;
	}
	
	//Mediante algun atributo
	public ObraSocial traerObraSocialPorAtributo(int atributo) throws HibernateException {
		ObraSocial objeto = null ;
		try {
			iniciaOperacion();
			objeto = (ObraSocial)session.createQuery("from ObraSocial c where c.atributo="+atributo).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}
	
	//Traer en una lista todos los ObraSocial's que hayan.
	@SuppressWarnings("unchecked")
	public List<ObraSocial> traerObraSocial() throws HibernateException {
		List<ObraSocial> lista=null;

		try {
			iniciaOperacion();
			lista = session.createQuery("from ObraSocial").list();
		}finally {
			session.close();
		}
		return lista;
	}
/* --- */
}
