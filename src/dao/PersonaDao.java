package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Persona;

public class PersonaDao {
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
	public int agregar(Persona objeto) {
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
	public void actualizar(Persona objeto) throws HibernateException {
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
	public void eliminar(Persona objeto) throws HibernateException {
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
	public Persona traerPersona(int idPersona) throws HibernateException {
		Persona objeto = null ;
		try {
			iniciaOperacion();
			objeto = (Persona)session.get(Persona.class, idPersona);
		} finally {
			session.close();
		}
		return objeto;
	}
	
	//Mediante algun atributo
	public Persona traerPersonaPorDni(String dni) throws HibernateException {
		Persona objeto = null ;
		try {
			iniciaOperacion();
			objeto = (Persona)session.createQuery("from Persona p where p.dni="+dni).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}
	
	//Traer en una lista todos los Persona's que hayan.
	@SuppressWarnings("unchecked")
	public List<Persona> traerPersona() throws HibernateException {
		List<Persona> lista=null;

		try {
			iniciaOperacion();
			lista = session.createQuery("from Persona").list();
		}finally {
			session.close();
		}
		return lista;
	}
/* --- */
}
