package datos;

public class DetalleVenta {
	private int id;
	private Producto producto;
	private int cantidad;
	private float precioUnitario;
	private float subtotal;
	
	public DetalleVenta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetalleVenta(Producto producto, int cantidad, float precioUnitario,
			float subtotal) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.subtotal = subtotal;
	}

	public int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	@Override
	public String toString() {
		return "DetalleVenta [id=" + id + ", cantidad=" + cantidad
				+ ", precioUnitario=" + precioUnitario + ", subtotal="
				+ subtotal + "]";
	}
	
	
	
}
