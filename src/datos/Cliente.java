package datos;

public class Cliente extends Persona{
	private int idCliente;
	private String descripcion;
	

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Cliente(String dni, String nombre, String apellido,String descripcion) {
		super(dni, nombre, apellido);
		this.descripcion = descripcion;
		// TODO Auto-generated constructor stub
	}



	public int getIdCliente() {
		return idCliente;
	}



	protected void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	@Override
	public String toString() {
		return "Cliente [DNI=" + getDni() + ", Nombre="
				+ getNombre() + ", Apellido=" + getApellido() + "]";
	}
}
