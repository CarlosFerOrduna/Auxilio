import service.ClienteService;
import service.ColaboradorService;
import service.ProblemaService;
import service.VehiculoService;

public class Principal {

	public static void main(String[] args) {

		ClienteService cliente = new ClienteService();
		ColaboradorService colaborador = new ColaboradorService();
		VehiculoService vehiculo = new VehiculoService();
		ProblemaService problema = new ProblemaService();

		colaborador.crearColaborador();
		colaborador.crearColaborador();
		colaborador.crearColaborador();
		cliente.asociarVehiculo(cliente.crearCliente(), vehiculo.crearVehiculo());
		cliente.pedirAyuda(problema.crearProblema(), colaborador);
	}
}