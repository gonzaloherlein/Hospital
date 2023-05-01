package hospital.dominio;

import java.util.ArrayList;

public class Paciente {
	private String nombre;
	private Integer edad;
	private ArrayList<Plato> platos = new ArrayList<Plato>();
	
	public Paciente() {
		
	}
	
	public Paciente(String nombre, Integer edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.platos = new ArrayList<Plato>();
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public ArrayList<Plato> getPlato() {
		return platos;
	}

	public void setPlato(ArrayList<Plato> ingrediente) {
		this.platos = ingrediente;
	}

	public boolean comer(Plato plato) {
		return true;
	}

	
	
}
