package base;

import derivadaGeneral.Valoracion;

public abstract class Usuario {

	protected String nombre;
	protected String ubicacion = "Estoy aca";
	protected Valoracion valoracion;

	protected abstract String getNombre();
	
	protected abstract String getUbicacion();
	
	protected abstract Valoracion getValoracion();
	
	protected abstract void setValoracion();
}
