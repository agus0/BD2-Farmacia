package negocio;




import java.util.List;

import dao.EmpleadoDao;
import datos.Empleado;
import datos.Sucursal;
public class EmpleadoABM {

	EmpleadoDao dao = new EmpleadoDao();
	
	
/* 1.ABM */
	public int agregar(String dni, String nombre, String apellido,String cuil, Sucursal sucursal) {
		Empleado empleado = new Empleado(dni, nombre, apellido, cuil, sucursal);
		return dao.agregar(empleado);
	}
	
	public void modificar(Empleado empleado) {
		dao.actualizar(empleado);	
	}
	
	public void eliminar(int idEmpleado) throws Exception {
		Empleado empleado= dao.traerPersona(idEmpleado);
		if (empleado==null)
			throw new Exception("El idEmpleado ingresado no se corresponde a ningun Empleado");
		dao.eliminar(empleado);
	}
/* --- */
	
	
/* 2.TRAYENDO LA INFORMACION */
	public Empleado traerEmpleado(int idEmpleado) throws Exception{
		Empleado empleado = dao.traerPersona(idEmpleado);
		if (empleado==null)
			throw new Exception("empleado nulo");
		return empleado;
	}
	
	public Empleado traerEmpleadoPorDni(String cuil) throws Exception{
		Empleado empleado = dao.traerEmpleadoPorCuil(cuil);
		if (empleado==null)
			throw new Exception("empleado nulo");
		return empleado;
	}
	
	public List<Empleado> traerEmpleado() {
		return dao.traerEmpleado();
	}
/* --- */
	
	
}
