package hospital.dominio;

public class Celiaco extends Paciente {

	public Celiaco() {
		
	}

	public Celiaco(String nombre, Integer edad) {
		super(nombre, edad);
		
	}
	
	
	@Override
	public boolean comer(Plato plato) {
		String ingrediente;
		for (int i = 0; i < plato.getIngrediente().size(); i++) {
			ingrediente = plato.getIngrediente().get(i).getNombre();
				switch (ingrediente) {
				case "trigo":
					return false;
				case "avena":
					return false;
				case "cebada":
					return false;
				case "centeno":
					return false;
				}
		}
		return true;
	}
}
