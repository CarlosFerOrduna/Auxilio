import service.ClienteService;
import service.ColaboradorService;
import service.VehiculoService;

public class Principal {

	public static void main(String[] args) {

//		ClienteService cliente = new ClienteService();
//		VehiculoService vehiculo = new VehiculoService();
//
//		cliente.crearCliente();
//
//		vehiculo.crearVehiculo();
//		
//		cliente.asociarVehiculo(vehiculo.buscarVehiculoPorPatente());

		ColaboradorService colaborador = new ColaboradorService();
		
		colaborador.crearColaborador();
		colaborador.crearColaborador();
		colaborador.crearColaborador();

		colaborador.colaboradoresCercaDeColaborador();
	}
}