package datos;

public class Producto {
	private int id;
	private String descripcion;
	private String laboratorio;
	private float precio;
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}	

	public Producto(String descripcion, String laboratorio, float precio) {
		super();
		this.descripcion = descripcion;
		this.laboratorio = laboratorio;
		this.precio = precio;
	}



	public int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion
				+ ", laboratorio=" + laboratorio + ", precio=" + precio + "]";
	}
	
}
