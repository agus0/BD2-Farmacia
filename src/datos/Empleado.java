package datos;

public class Empleado extends Persona{
	private int idEmpleado;
	private String cuil;
	private Sucursal sucursal;
	
	
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Empleado(String dni, String nombre, String apellido,String cuil, Sucursal sucursal) {
		super(dni, nombre, apellido);
		this.cuil = cuil;
		this.sucursal = sucursal;
	}

	protected int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", cuil=" + cuil
				+ ", sucursal=" + sucursal + "]";
	}
	
}
