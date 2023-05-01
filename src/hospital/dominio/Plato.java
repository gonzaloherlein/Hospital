package hospital.dominio;

import java.util.ArrayList;

public class Plato {
	private String nombre;
	private String procesoDeElaboracion;
	private ArrayList<Ingrediente> ingrediente = new ArrayList<Ingrediente>();
	
	public Plato() {
		
	}
	
	public Plato(String nombre,String procesoDeElaboracion) {
		this.nombre = nombre;
		this.procesoDeElaboracion = procesoDeElaboracion;
		this.ingrediente = new ArrayList<Ingrediente>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Ingrediente> getIngrediente() {
		return ingrediente;
	}

	public void setIngrediente(ArrayList<Ingrediente> ingrediente) {
		this.ingrediente = ingrediente;
	}

	public String getProcesoDeElaboracion() {
		return procesoDeElaboracion;
	}

	public void setProcesoDeElaboracion(String procesoDeElaboracion) {
		this.procesoDeElaboracion = procesoDeElaboracion;
	}

	public void agregarIngrediente(Ingrediente ingrediente) {
		this.ingrediente.add(ingrediente);
		
	}
	
	
}
