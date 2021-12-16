import service.ClienteService;
import service.ColaboradorService;
import service.ProblemaService;
import service.ProfesionalService;
import service.VehiculoService;

public class Principal {

	public static void main(String[] args) {

		ClienteService cliente = new ClienteService();
		ColaboradorService colaborador = new ColaboradorService();
		VehiculoService vehiculo = new VehiculoService();
		ProblemaService problema = new ProblemaService();
		ProfesionalService profesional = new ProfesionalService();

		colaborador.crearColaborador();
		colaborador.crearColaborador();
		colaborador.crearColaborador();
		cliente.crearCliente();
		cliente.pedirAyuda(cliente.asociarVehiculo(cliente.buscarCliente(), vehiculo.crearVehiculo()),
				problema.crearProblema(vehiculo.buscarVehiculoPorPatente()),
				colaborador.buscarColaboradorCercano(cliente.darUbicacion(cliente.buscarCliente())));

		profesional.crearProfesional();
		cliente.crearCliente();
		cliente.enviarVehiculoProfesional(cliente.asociarVehiculo(cliente.buscarCliente(), vehiculo.crearVehiculo()),
				problema.crearProblema(vehiculo.buscarVehiculoPorPatente()), profesional.buscarProfesional());
	}
}
