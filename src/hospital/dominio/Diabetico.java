package hospital.dominio;

import java.util.ArrayList;

public class Diabetico extends Paciente {
	private Integer tipoDeDiabetes;
	
	
	public Diabetico() {
		
	}

	public Diabetico(String nombre, Integer edad,Integer tipoDeDiabetes) {
		super(nombre, edad);
		this.tipoDeDiabetes = tipoDeDiabetes;
		
	}
	
	@Override
	public boolean comer(Plato plato) {
		for (int i = 0; i < plato.getIngrediente().size(); i++) {
			if(plato.getIngrediente().get(i).getNombre().equals("azucar")) {
				return false;
			}
		}
		return true;
	}
		
	public boolean recibirInsulina() {
		Boolean insulina = false;
		if(tipoDeDiabetes == 2) {
			insulina = true;
			return insulina;
		}
		return insulina;
	}
}
 