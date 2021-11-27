package service;

import javax.swing.JOptionPane;

import domain.Cliente;
import domain.Colaborador;
import domain.Reparacion;
import repository.ColaboradorRepository;

public class ColaboradorService {

	ColaboradorRepository colaboradores = new ColaboradorRepository();

	public void crearColaborador() {

		String nombre;
		Integer dni;

		nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su dni"));

		colaboradores.agregarColaborador(new Colaborador(nombre, dni));
	}

	public Colaborador buscarColaboradorPorNombre() {
		String nombre;

		nombre = JOptionPane.showInputDialog("Ingrese el nombre del colaborador que busca");

		for (Colaborador colaborador : colaboradores.verArray()) {
			if (colaborador.getNombre().equalsIgnoreCase(nombre)) {

				JOptionPane.showMessageDialog(null, colaborador);

				return colaborador;
			}
		}
		return null;
	}

	public Colaborador buscarColaboradorPorDni() {
		Integer dni;

		dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dni del colaborador que busca"));

		for (Colaborador colaborador : colaboradores.verArray()) {
			if (colaborador.getDni() == dni) {

				JOptionPane.showInternalMessageDialog(null, colaborador);

				return colaborador;
			}
		}
		return null;
	}

	public String brindarAyuda(String mensajeDeAuxilio, Colaborador colaborador) {
		return colaborador.getUbicacion() + colaborador.getNombre();
	}

	public String cobrar(Cliente cliente, Reparacion reparacion, Colaborador colaborador) {
		return cliente.getMedioDePago() + reparacion.getCosto() + colaborador.getMetodoDeFactura();
	}
}
