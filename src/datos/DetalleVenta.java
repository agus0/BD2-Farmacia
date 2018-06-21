package datos;

public class DetalleVenta {
	private int id;
	private Producto producto;
	private Venta venta;
	private int cantidad;
	private float precioUnitario;
	private float subtotal;
	
	public DetalleVenta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetalleVenta(Producto producto, int cantidad, float precioUnitario,
			float subtotal, Venta venta) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.subtotal = subtotal;
		this.venta = venta;
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
	
	

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	@Override
	public String toString() {
		return "DetalleVenta [id=" + id + ", producto=" + producto + ", venta="
				+ venta + ", cantidad=" + cantidad + ", precioUnitario="
				+ precioUnitario + ", subtotal=" + subtotal + "]";
	}
	public void print() {
		
	Producto producto = this.getProducto();
	String tipo = null;
	Perfume perfume = null;
	Medicamento medicamento = null;
	if (producto instanceof Perfume){
		 perfume = (Perfume)producto;
		tipo = "Perfume: " + perfume.getComentario();
	}else if(producto instanceof Medicamento){
		medicamento = (Medicamento)producto;
		tipo ="Medicamento: " + medicamento.getComentario();
	}
	System.out.println("Cant:"+this.cantidad+"\tDescripcion: "+producto.getDescripcion()+"\t"+tipo+"\t\t\tPrecio: "+this.getPrecioUnitario()+"\t\t\tImporte: "+this.getSubtotal());
	}
	
}
