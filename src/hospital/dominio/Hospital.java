package hospital.dominio;

import java.util.HashSet;

public class Hospital {
	private String nombre;
	private HashSet<Paciente> pacientes = new HashSet<Paciente>();
	
	public Hospital() {
		
	}

	public Hospital(String nombre) {
		this.nombre = nombre;
		this.pacientes = new HashSet<Paciente>();
	}
	
	public void agregarPaciente(Paciente paciente) {
		pacientes.add(paciente);
	}
}
