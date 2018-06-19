package negocio;
import java.util.List;

import dao.MedicamentoDao;
import datos.Medicamento;
public class MedicamentoABM {
	MedicamentoDao dao = new MedicamentoDao();
	
	
/* 1.ABM */
	public int agregar(String descripcion, String laboratorio, float precio, String comentario) {
		Medicamento medicamento = new Medicamento( descripcion,  laboratorio,  precio,  comentario);
		return dao.agregar(medicamento);
	}
	
	public void modificar(Medicamento medicamento) {
		dao.actualizar(medicamento);	
	}
	
	public void eliminar(int idMedicamento) throws Exception {
		Medicamento medicamento= dao.traerMedicamento(idMedicamento);
		if (medicamento==null)
			throw new Exception("El idMedicamento ingresado no se corresponde a ningun Medicamento");
		dao.eliminar(medicamento);
	}
/* --- */
	
	
/* 2.TRAYENDO LA INFORMACION */
	public Medicamento traerMedicamento(int idMedicamento) throws Exception{
		Medicamento medicamento = dao.traerMedicamento(idMedicamento);
		if (medicamento==null)
			throw new Exception("medicamento nulo");
		return medicamento;
	}
	
	public List<Medicamento> traerMedicamentoPorLaboratorio(String laboratorio) throws Exception{
		List<Medicamento> medicamento = dao.traerMedicamentoPorLaboratorio(laboratorio);
		if (medicamento==null)
			throw new Exception("medicamento nulo");
		return medicamento;
	}
	
	public List<Medicamento> traerMedicamento() {
		return dao.traerMedicamento();
	}
/* --- */
	
	
}
