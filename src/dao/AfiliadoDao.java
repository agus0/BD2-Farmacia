package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Afiliado;

public class AfiliadoDao {
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
	public int agregar(Afiliado objeto) {
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
	public void actualizar(Afiliado objeto) throws HibernateException {
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
	public void eliminar(Afiliado objeto) throws HibernateException {
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
	public Afiliado traerAfiliado(int idAfiliado) throws HibernateException {
		Afiliado objeto = null ;
		try {
			iniciaOperacion();
			objeto = (Afiliado)session.get(Afiliado.class, idAfiliado);
		} finally {
			session.close();
		}
		return objeto;
	}
	
	//Mediante algun atributo
	public Afiliado traerAfiliadoPorNumeroDeAfiliado(int numafiliado) throws HibernateException {
		Afiliado objeto = null ;
		try {
			iniciaOperacion();
			objeto = (Afiliado)session.createQuery("from Afiliado a where a.numafiliado="+numafiliado).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}
	
	//Traer en una lista todos los Persona's que hayan.
	@SuppressWarnings("unchecked")
	public List<Afiliado> traerAfiliado() throws HibernateException {
		List<Afiliado> lista=null;

		try {
			iniciaOperacion();
			lista = session.createQuery("from Afiliado").list();
		}finally {
			session.close();
		}
		return lista;
	}
/* --- */
}
