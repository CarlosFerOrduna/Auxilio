package service;

import javax.swing.JOptionPane;

import domain.Problema;
import domain.Profesional;
import repository.ProfesionalRepository;

public class ProfesionalService {

	ProfesionalRepository profesionales = new ProfesionalRepository();

	public void crearProfesional() {

		String nombre;
		String especialidad;

		nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		especialidad = JOptionPane.showInputDialog("Ingrese su especialidad");

		profesionales.agregarProfesional(new Profesional(nombre, especialidad));
	}

	public void presupuestar(Problema problema) {

	}

	public void aceptarAutoAReparar() {

	}

	public void cobrar() {

	}

	public Profesional buscarProfesionalPorNombre() {
		String nombre;

		nombre = JOptionPane.showInputDialog("Ingrese el nombre del profesional que busca");

		for (Profesional profesional : profesionales.verArray()) {
			if (profesional.getNombre().equalsIgnoreCase(nombre)) {

				JOptionPane.showInternalMessageDialog(null, profesional);

				return profesional;
			}
		}
		return null;
	}

	public Profesional buscarProfesionalPorEspecialidad() {

		String especialidad;

		especialidad = JOptionPane.showInputDialog("Ingrese la especialidad que busca");

		for (Profesional profesional : profesionales.verArray()) {
			if (profesional.getEspecialidad().equalsIgnoreCase(especialidad)) {

				JOptionPane.showInternalMessageDialog(null, profesional);

				return profesional;
			}
		}
		return null;
	}
}
