import domain.AreaDeTrabajo;
import domain.Combustible;
import domain.Especialidad;
import domain.Marca;
import domain.Modelo;
import domain.Problema;
import domain.Reparacion;
import repository.AreaDeTrabajoRepository;
import repository.CombustibleRepository;
import repository.EspecialidadRepository;
import repository.MarcaRepository;
import repository.ModeloRepository;
import repository.ProblemaRepository;
import repository.ReparacionRepository;

public class Principal {

	public static void main(String[] args) {

		CombustibleRepository combustibles = new CombustibleRepository();
		combustibles.agregarCombustible(new Combustible("Biodiesel", 85.33));
		combustibles.agregarCombustible(new Combustible("Electricidad", 122.45));
		combustibles.agregarCombustible(new Combustible("Gas", 100.0));
		combustibles.agregarCombustible(new Combustible("Gasoil", 92.90));
		combustibles.agregarCombustible(new Combustible("Nafta", 57.63));

		ProblemaRepository problemas = new ProblemaRepository();
		problemas.agregarProblema(new Problema("Complejo", "Mi auto no amortigua"));
		problemas.agregarProblema(new Problema("Complejo", "Mis luces no encienden"));
		problemas.agregarProblema(new Problema("Complejo", "Mi direccion es imprecisa"));
		problemas.agregarProblema(new Problema("Complejo", "Mis frenos se van largos de a ratos"));
		problemas.agregarProblema(new Problema("Complejo", "Necesito un lavado profundo"));
		problemas.agregarProblema(new Problema("Complejo", "Necesito lavar el motor"));
		problemas.agregarProblema(new Problema("Complejo", "Escucho un chirrido cuando freno"));
		problemas.agregarProblema(new Problema("Simple", "Mi auto no enciende, olvide las luces prendidas"));
		problemas.agregarProblema(new Problema("Simple", "Necesito cambiar un foco"));
		problemas.agregarProblema(new Problema("Simple", "Pinche una rueda"));
		problemas.agregarProblema(new Problema("Simple", "Me quede sin agua"));

		MarcaRepository marcas = new MarcaRepository();
		marcas.agregarMarca(new Marca("Toyota"));
		marcas.agregarMarca(new Marca("Mercedes-Benz"));
		marcas.agregarMarca(new Marca("Volkswagen"));
		marcas.agregarMarca(new Marca("BMW"));
		marcas.agregarMarca(new Marca("Ford"));

		ModeloRepository modelos = new ModeloRepository();
		// modelos toyota
		modelos.agregarModelo(new Modelo("Etios"));
		modelos.agregarModelo(new Modelo("Yaris"));
		modelos.agregarModelo(new Modelo("Corolla"));
		modelos.agregarModelo(new Modelo("Prius"));
		modelos.agregarModelo(new Modelo("Hylux"));
		// modelos mercedes
		modelos.agregarModelo(new Modelo("C 200"));
		modelos.agregarModelo(new Modelo("C 300"));
		modelos.agregarModelo(new Modelo("AMG C 43"));
		modelos.agregarModelo(new Modelo("GLA 180"));
		modelos.agregarModelo(new Modelo("CLA220a"));
		// modelos volkwagen
		modelos.agregarModelo(new Modelo("Amarok"));
		modelos.agregarModelo(new Modelo("Polo"));
		modelos.agregarModelo(new Modelo("T-Cross"));
		modelos.agregarModelo(new Modelo("Tiguan"));
		modelos.agregarModelo(new Modelo("Golf"));
		// modelos bmw
		modelos.agregarModelo(new Modelo("Serie 1"));
		modelos.agregarModelo(new Modelo("Serie 2 Coupe"));
		modelos.agregarModelo(new Modelo("M240I Coupe"));
		modelos.agregarModelo(new Modelo("Serie 3 Sedan"));
		modelos.agregarModelo(new Modelo("Serie 4 Coupe"));
		// modelos ford
		modelos.agregarModelo(new Modelo("Ecosport"));
		modelos.agregarModelo(new Modelo("Bronco sport"));
		modelos.agregarModelo(new Modelo("Ranger"));
		modelos.agregarModelo(new Modelo("Raptor"));
		modelos.agregarModelo(new Modelo("Kuga Hibrida"));

		ReparacionRepository reparaciones = new ReparacionRepository();
		// trabajos gomeria
		reparaciones.agregarReparacion(new Reparacion("Cambio de cubierta", 1500));
		reparaciones.agregarReparacion(new Reparacion("Rotacion neumaticos", 3500));
		// trabajos electricidad
		reparaciones.agregarReparacion(new Reparacion("Cambio de fusibles", 1000));
		reparaciones.agregarReparacion(new Reparacion("Cambio de perillas", 1000));
		// trabajos lavadero
		reparaciones.agregarReparacion(new Reparacion("Lavado de chazis", 5000));
		reparaciones.agregarReparacion(new Reparacion("Lavado de motor", 5000));
		// trabajos alineacion y balanceo
		reparaciones.agregarReparacion(new Reparacion("Cambio de tren delantero", 10000));
		reparaciones.agregarReparacion(new Reparacion("Cambio de amortiguadores", 10000));
		// mecanica general
		reparaciones.agregarReparacion(new Reparacion("Problema de bujias", 5000));
		reparaciones.agregarReparacion(new Reparacion("Cambio de transmision", 2000));

		AreaDeTrabajoRepository areas = new AreaDeTrabajoRepository();
		areas.agregarArea(new AreaDeTrabajo(null));

		EspecialidadRepository especialidades = new EspecialidadRepository();
		especialidades.agregarEspecialidad(new Especialidad("", null));

	}
}