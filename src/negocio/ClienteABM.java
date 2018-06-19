package negocio;
import java.util.GregorianCalendar;
import java.util.List;

import dao.ClienteDao;
import datos.Cliente;
public class ClienteABM {

	ClienteDao dao = new ClienteDao();
	
	
/* 1.ABM */
	public int agregar(String dni, String nombre, String apellido,String descripcion) {
		Cliente cliente = new Cliente(dni,nombre,apellido,descripcion);
		return dao.agregar(cliente);
	}
	
	public void modificar(Cliente cliente) {
		dao.actualizar(cliente);	
	}
	
	public void eliminar(int idCliente) throws Exception {
		Cliente cliente= dao.traerCliente(idCliente);
		if (cliente==null)
			throw new Exception("El idCliente ingresado no se corresponde a ningun Cliente");
		dao.eliminar(cliente);
	}
/* --- */
	
	
/* 2.TRAYENDO LA INFORMACION */
	public Cliente traerCliente(int idCliente) throws Exception{
		Cliente cliente = dao.traerCliente(idCliente);
		if (cliente==null)
			throw new Exception("cliente nulo");
		return cliente;
	}
	
	public Cliente traerClientePorDni(String dni) throws Exception{
		Cliente cliente = dao.traerClientePorDni(dni);
		if (cliente==null)
			throw new Exception("cliente nulo");
		return cliente;
	}
	
	public List<Cliente> traerCliente() {
		return dao.traerCliente();
	}
/* --- */
	
	
}
