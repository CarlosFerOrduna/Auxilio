import service.ClienteService;
import service.ColaboradorService;
import service.ProblemaService;
import service.ProfesionalService;
import service.ReparacionService;
import service.VehiculoService;

public class Principal {

	public static void main(String[] args) {

		ClienteService cliente = new ClienteService();
		ColaboradorService colaborador = new ColaboradorService();
		VehiculoService vehiculo = new VehiculoService();
		ProblemaService problema = new ProblemaService();
		ProfesionalService profesional = new ProfesionalService();
		ReparacionService reparacion = new ReparacionService();

		colaborador.crearColaborador();
		cliente.crearCliente();

		cliente.pagarColaborador(cliente.buscarCliente(),
				colaborador.brindarAyuda(
						cliente.pedirAyuda(cliente.asociarVehiculo(cliente.buscarCliente(), vehiculo.crearVehiculo()),
								problema.crearProblema(), colaborador.buscarColaborador()),
						reparacion.crearReparacion()),
				colaborador.buscarColaborador());

//		profesional.crearProfesional();
//
//		profesional.presupuestar(cliente.enviarVehiculoProfesional(cliente.buscarCliente(), problema.crearProblema(),
//				profesional.buscarProfesional()), reparacion.crearReparacion(), cliente.buscarCliente());

	}
}
