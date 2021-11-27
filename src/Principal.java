import service.ProfesionalService;

public class Principal {

	public static void main(String[] args) {

		ProfesionalService profesional = new ProfesionalService();
		
		
		profesional.crearProfesional();
		
		profesional.buscarProfesionalPorNombre();
		
	}
}