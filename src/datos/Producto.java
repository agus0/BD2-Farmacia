package datos;

public class Producto {
	private int id;
	private String descripcion;
	private float precio;
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Producto(String descripcion, float precio) {
		super();
		this.descripcion = descripcion;
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

	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion
				+ ", precio=" + precio + "]";
	}
	
	
	
	
}
