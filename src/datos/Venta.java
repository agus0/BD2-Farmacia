package datos;

import java.util.GregorianCalendar;
import java.util.Set;

public class Venta {
	private int id;
	private Cliente cliente;
	private Empleado vendedor;
	private Empleado cajero;
	private Sucursal sucursal;
	private Set<DetalleVenta> detalleVentas;
	private String formaPago;
	private float totalVenta;
	private GregorianCalendar fecha;
	
	public Venta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Venta(Cliente cliente, Empleado vendedor, Empleado cajero,
			Sucursal sucursal, String formaPago, float totalVenta,
			GregorianCalendar fecha) {
		super();
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.cajero = cajero;
		this.sucursal = sucursal;
		this.formaPago = formaPago;
		this.totalVenta = totalVenta;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empleado getVendedor() {
		return vendedor;
	}

	public void setVendedor(Empleado vendedor) {
		this.vendedor = vendedor;
	}

	public Empleado getCajero() {
		return cajero;
	}

	public void setCajero(Empleado cajero) {
		this.cajero = cajero;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Set<DetalleVenta> getDetalleVentas() {
		return detalleVentas;
	}

	public void setDetalleVentas(Set<DetalleVenta> detalleVentas) {
		this.detalleVentas = detalleVentas;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public float getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(float totalVenta) {
		this.totalVenta = totalVenta;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Venta [id=" + id + ", cliente=" + cliente + ", vendedor="
				+ vendedor + ", cajero=" + cajero + ", sucursal=" + sucursal
				+ ", formaPago=" + formaPago + ", totalVenta=" + totalVenta
				+ ", fecha=" + fecha + "]";
	}
	
	
	
}
