package datos;

public class Empleado extends Persona{
	private int idEmpleado;
	private String cuil;

	public Empleado(String dni, String nombre, String apellido,String cuil) {
		super(dni, nombre, apellido);
		this.cuil = cuil;
		// TODO Auto-generated constructor stub
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	protected void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", cuil=" + cuil + "]";
	}
	
	
	
}
