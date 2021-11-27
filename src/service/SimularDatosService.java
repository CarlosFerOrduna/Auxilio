package service;

import domain.Problema;
import domain.Reparacion;
import repository.ProblemaRepository;
import repository.ReparacionRepository;

public class SimularDatosService {

	ProblemaRepository problemas = new ProblemaRepository();

	ReparacionRepository reparaciones = new ReparacionRepository();

	public void simularDatos() {

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

	}

}
