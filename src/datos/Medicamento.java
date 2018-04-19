package datos;

public class Medicamento extends Producto{
	private int idMedicamento;
	private String laboratorio;
	private String comentario;
	
	
	public Medicamento() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medicamento(String descripcion, float precio, String laboratorio, String comentario) {
		super(descripcion, precio);
		this.laboratorio = laboratorio;
		this.comentario = comentario;
		// TODO Auto-generated constructor stub
	}
	
	public int getIdMedicamento() {
		return idMedicamento;
	}
	
	protected void setIdMedicamento(int idMedicamento) {
		this.idMedicamento = idMedicamento;
	}
	
	public String getLaboratorio() {
		return laboratorio;
	}
	
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	@Override
	public String toString() {
		return "Perfume [idMedicamento=" + idMedicamento + ", laboratorio="
				+ laboratorio + ", comentario=" + comentario + "]";
	}
	
	
	
}
