package repository;

import java.util.ArrayList;
import java.util.List;

import domain.Vehiculo;

public class VehiculoRepository {

	List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

	public void agregarVehiculo(Vehiculo nuevoVehiculo) {
		vehiculos.add(nuevoVehiculo);
	}
}
