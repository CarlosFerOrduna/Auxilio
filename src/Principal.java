import derivadaCombustible.Biodiesel;
import derivadaCombustible.Electricidad;
import derivadaCombustible.Gas;
import derivadaCombustible.Gasoil;
import derivadaCombustible.Nafta;
import derivadaGamma.Alta;
import derivadaGamma.Baja;
import derivadaGamma.Media;
import derivadaProblemaComplejo.CambioAmortiguadores;
import derivadaProblemaComplejo.CambioDeLuces;
import derivadaProblemaComplejo.CambioTrenDelantero;
import derivadaProblemaComplejo.FaltaLiquidoDeFrenos;
import derivadaProblemaComplejo.LavadoChazis;
import derivadaProblemaComplejo.LavadoMotor;
import derivadaProblemaComplejo.RectificarDiscosDeFreno;
import derivadaProblemaSimple.Bateria;
import derivadaProblemaSimple.LuzQuemada;
import derivadaProblemaSimple.Pinchadura;
import repository.CombustibleRepository;
import repository.GammaRepository;
import repository.ProblemaRepository;

public class Principal {

	public static void main(String[] args) {

		CombustibleRepository combustibles = new CombustibleRepository();
		combustibles.agregarCombustible(new Nafta(85.33));
		combustibles.agregarCombustible(new Biodiesel(122.45));
		combustibles.agregarCombustible(new Gas(100.0));
		combustibles.agregarCombustible(new Gasoil(92.90));
		combustibles.agregarCombustible(new Electricidad(57.63));
		
		ProblemaRepository problemas = new ProblemaRepository();
		problemas.agregarProblema(new CambioAmortiguadores(20000.0));
		problemas.agregarProblema(new CambioDeLuces(22000.0));
		problemas.agregarProblema(new CambioTrenDelantero(25000.0));
		problemas.agregarProblema(new FaltaLiquidoDeFrenos(6000.0));
		problemas.agregarProblema(new LavadoChazis(8000.0));
		problemas.agregarProblema(new LavadoMotor(8000.0));
		problemas.agregarProblema(new RectificarDiscosDeFreno(10000.0));
		problemas.agregarProblema(new Bateria(900.0));
		problemas.agregarProblema(new LuzQuemada(900.0));
		problemas.agregarProblema(new Pinchadura(900.0));
		
		
		GammaRepository gammas = new GammaRepository();
		gammas.agregarGamma(new Alta(4.5, 5));
		gammas.agregarGamma(new Media(3.9, 4.5));
		gammas.agregarGamma(new Baja(3.3, 3.7));
		
		
	}
}