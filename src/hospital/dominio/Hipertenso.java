package hospital.dominio;

public class Hipertenso extends Paciente {

	public Hipertenso() {
		
	}

	public Hipertenso(String nombre, Integer edad) {
		super(nombre, edad);
		
	}
	
	@Override
	public boolean comer(Plato plato) {
		for (int i = 0; i < plato.getIngrediente().size(); i++) {
			if(plato.getIngrediente().get(i).getNombre().equals("sal")) {
				return false;
			}
		}
		return true;
	}
}	
