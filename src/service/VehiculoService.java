package service;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import domain.Vehiculo;
import repository.VehiculoRepository;

public class VehiculoService {

	List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	public Vehiculo crearVehiculo() {

		int elejirModelo;

		String modelo = null;

		String[] marcas = { "Ford", "Chevrolet", "Volkswagen", "Fiat", "Honda" };

		int elejirMarca = JOptionPane.showOptionDialog(null, "Seleccione la marca de su vehiculo", "Selccion marca", 0,
				JOptionPane.QUESTION_MESSAGE, null, marcas, 0);

		if (elejirMarca == 0) {

			String[] modelosFord = { "Fiesta", "Ka", "Focus", "Ranger", "Bronco" };

			elejirModelo = JOptionPane.showOptionDialog(null, "Seleccione el modelo de su vehiculo", "Seleccion modelo",
					0, JOptionPane.QUESTION_MESSAGE, null, modelosFord, 0);

			modelo = modelosFord[elejirModelo];

		} else if (elejirMarca == 1) {

			String[] modelosChevrolet = { "Corsa", "Onix", "Joy", "Prisma", "Cruze" };

			elejirModelo = JOptionPane.showInternalOptionDialog(null, "Seleccione el modelo de su vehiculo",
					"Seleccion modelo", 0, JOptionPane.QUESTION_MESSAGE, null, modelosChevrolet, 0);

			modelo = modelosChevrolet[elejirMarca];

		} else if (elejirMarca == 2) {

			String[] modelosVolkswagen = { "Gol", "Golf", "Passat", "Vento", "Suran" };

			elejirModelo = JOptionPane.showOptionDialog(null, "Seleccione el modelo de su vehiculo", "Seleccion modelo",
					0, JOptionPane.QUESTION_MESSAGE, null, modelosVolkswagen, 0);

			modelo = modelosVolkswagen[elejirModelo];

		} else if (elejirMarca == 3) {

			String[] modelosFiat = { "Mobi", "500", "Cronos", "Palio", "Punto" };

			elejirModelo = JOptionPane.showInternalOptionDialog(null, "Seleccione el modelo de su vehiculo",
					"Seleccion de modelo", 0, JOptionPane.QUESTION_MESSAGE, null, modelosFiat, 0);

			modelo = modelosFiat[elejirModelo];

		} else if (elejirMarca == 4) {

			String[] modelosHonda = { "Civic", "HR-V", "CR-V", "City", "Fit" };

			elejirModelo = JOptionPane.showInternalOptionDialog(null, "Seleccione el modelo de su vehiculo",
					"Seleccion modelo", 0, JOptionPane.QUESTION_MESSAGE, null, modelosHonda, 0);

			modelo = modelosHonda[elejirModelo];

		}

		String patente = JOptionPane.showInputDialog("Ingrese la patente");

		if (patente.contains(patente))

			vehiculos.add(new Vehiculo(marcas[elejirMarca], modelo, patente));

		return new Vehiculo(marcas[elejirMarca], modelo, patente);
	}

	public void historialDeReparaciones() {

	}

	public Vehiculo buscarVehiculoPorPatente() {

		String patente;

		patente = JOptionPane.showInputDialog("Ingrese la patente del vehiculo que busca");

		for (Vehiculo vehiculo : vehiculos) {
			if (vehiculo.getPatente().equalsIgnoreCase(patente)) {

				JOptionPane.showInternalMessageDialog(null, vehiculo);

				return vehiculo;
			}
		}
		return null;
	}
}
