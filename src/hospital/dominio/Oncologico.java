package hospital.dominio;

public class Oncologico extends Paciente {

	public Oncologico() {
		
	}

	public Oncologico(String nombre, Integer edad) {
		super(nombre, edad);
		
	}
	
	@Override
	public boolean comer(Plato plato) {
		if(plato.getProcesoDeElaboracion().equals("crudo")) {
			return false;
		}
		return true;
	}
	
}
