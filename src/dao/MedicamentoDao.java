package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.Medicamento;

public class MedicamentoDao{
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
	public int agregar(Medicamento objeto) {
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
	public void actualizar(Medicamento objeto) throws HibernateException {
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
	public void eliminar(Medicamento objeto) throws HibernateException {
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
	public Medicamento traerMedicamento(int idMedicamento) throws HibernateException {
		Medicamento objeto = null ;
		try {
			iniciaOperacion();
			objeto = (Medicamento)session.get(Medicamento.class, idMedicamento);
		} finally {
			session.close();
		}
		return objeto;
	}
	
	//Mediante algun atributo multiple
	@SuppressWarnings("unchecked")
	public List<Medicamento> traerMedicamentoPorLaboratorio(String laboratorio) throws HibernateException {
		List<Medicamento> objetos = null ;
		try {
			iniciaOperacion();
			objetos = session.createQuery("from Medicamento m where m.laboratorio="+laboratorio).list();
		} finally {
			session.close();
		}
		return objetos;
	}
	
	//Traer en una lista todos los Persona's que hayan.
	@SuppressWarnings("unchecked")
	public List<Medicamento> traerMedicamento() throws HibernateException {
		List<Medicamento> lista=null;

		try {
			iniciaOperacion();
			lista = session.createQuery("from Medicamento").list();
		}finally {
			session.close();
		}
		return lista;
	}
/* --- */
}
