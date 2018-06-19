package datos;

public class Medicamento extends Producto{
	private int idMedicamento;
	private String comentario;
	
	
	public Medicamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medicamento(String descripcion, String laboratorio, float precio, String comentario) {
		super(descripcion, laboratorio, precio);
		this.comentario = comentario;
	}



	public int getIdMedicamento() {
		return idMedicamento;
	}
	
	protected void setIdMedicamento(int idMedicamento) {
		this.idMedicamento = idMedicamento;
	}
	
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	@Override
	public String toString() {
		return "Medicamento [idMedicamento=" + idMedicamento + ", comentario="
				+ comentario + "]";
	}
	
}
