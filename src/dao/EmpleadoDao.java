package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Empleado;

public class EmpleadoDao {
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
	public int agregar(Empleado objeto) {
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
	public void actualizar(Empleado objeto) throws HibernateException {
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
	public void eliminar(Empleado objeto) throws HibernateException {
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
	public Empleado traerPersona(int idEmpleado) throws HibernateException {
		Empleado objeto = null ;
		try {
			iniciaOperacion();
			objeto = (Empleado)session.get(Empleado.class, idEmpleado);
		} finally {
			session.close();
		}
		return objeto;
	}
	
	//Mediante algun atributo
	public Empleado traerEmpleadoPorCuil(String cuil) throws HibernateException {
		Empleado objeto = null ;
		try {
			iniciaOperacion();
			objeto = (Empleado)session.createQuery("from Empleado e where e.cuil="+cuil).uniqueResult();
		} finally {
			session.close();
		}
		return objeto;
	}
	
	//Traer en una lista todos los Persona's que hayan.
	@SuppressWarnings("unchecked")
	public List<Empleado> traerEmpleado() throws HibernateException {
		List<Empleado> lista=null;

		try {
			iniciaOperacion();
			lista = session.createQuery("from Empleado").list();
		}finally {
			session.close();
		}
		return lista;
	}
/* --- */
}
