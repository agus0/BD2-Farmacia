package datos;

public class Perfume extends Producto{
	private int idPerfume;
	private String comentario;
	
	public Perfume() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Perfume(String descripcion, float precio, String comentario) {
		super(descripcion, precio);
		this.comentario = comentario;
		// TODO Auto-generated constructor stub
	}
	
	public int getIdPerfume() {
		return idPerfume;
	}
	public void setIdPerfume(int idPerfume) {
		this.idPerfume = idPerfume;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	@Override
	public String toString() {
		return "Perfume [idPerfume=" + idPerfume + ", comentario=" + comentario
				+ "]";
	}
	
	
	
	
}
