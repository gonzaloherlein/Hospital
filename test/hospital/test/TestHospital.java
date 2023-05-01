package hospital.test;

import static org.junit.Assert.*;

import org.junit.Test;

import hospital.dominio.Celiaco;
import hospital.dominio.Diabetico;
import hospital.dominio.General;
import hospital.dominio.Hipertenso;
import hospital.dominio.Hospital;
import hospital.dominio.Ingrediente;
import hospital.dominio.Oncologico;
import hospital.dominio.Paciente;
import hospital.dominio.Plato;

public class TestHospital {

	@Test
	public void queSeCreeUnHospital() {
		Hospital hospitalCentral = new Hospital();
		assertNotNull(hospitalCentral);
	}
	
	@Test
	public void queSeCreeUnPaciente() {
		Paciente paciente = new Paciente();
		assertNotNull(paciente);
	}
	
	@Test
	public void queSeCreeUnDiabetico() {
		Paciente diabetico = new Diabetico();
		assertNotNull(diabetico);
	}
	
	@Test
	public void queSeCreeUnOncologico() {
		Paciente oncologico = new Oncologico();
		assertNotNull(oncologico);
	}
	
	@Test
	public void queSeCreeUnCeliacos() {
		Paciente celiaco = new Celiaco();
		assertNotNull(celiaco);
	}
	
	@Test
	public void queSeCreeUnHipertensos() {
		Paciente hipertenso = new Hipertenso();
		assertNotNull(hipertenso);
	}
	
	@Test
	public void queSeCreeUnGeneral() {
		Paciente general = new General();
		assertNotNull(general);
	}
	
	@Test
	public void queSeCreeUnPlato() {
		Plato plato = new Plato();
		assertNotNull(plato);
	}
	
	@Test
	public void queUnDiabeticoNoPuedaConsumirAzucar() {
		Diabetico diabetico = new Diabetico();
		Ingrediente azucar = new Ingrediente("azucar");
		Ingrediente pez = new Ingrediente("pez");
		Plato azucarYPez = new Plato();
		
		azucarYPez.agregarIngrediente(azucar);
		azucarYPez.agregarIngrediente(pez);

		assertFalse(diabetico.comer(azucarYPez));
	}
	
	@Test
	public void queUnDiabeticoTipo2RecibaInsulina() {
		Diabetico diabetico = new Diabetico("Juan", 10,2);
		assertTrue(diabetico.recibirInsulina());
	}
	
	@Test
	public void queUnOncologicoNoPuedaConsumirCrudo() {
		Oncologico oncologico = new Oncologico();
		Ingrediente azucar = new Ingrediente("azucar");
		Ingrediente pez = new Ingrediente("pez");
		Plato plato = new Plato("hola", "crudo");
		
		plato.agregarIngrediente(pez);
		plato.agregarIngrediente(azucar);
		
		assertFalse(oncologico.comer(plato));
	}
	
	@Test
	public void queUnCeliacoNoPuedaConsumirTrigoNiAvenaNiCebadaNiCenteno() {
		Celiaco celiaco = new Celiaco();
		Ingrediente cebada = new Ingrediente("cebada");
		Ingrediente centeno = new Ingrediente("centeno");
		Ingrediente avena = new Ingrediente("avena");
		Ingrediente trigo = new Ingrediente("trigo");
		Ingrediente pez = new Ingrediente("pez");
		Plato plato = new Plato("hola", "crudo");
		
		plato.agregarIngrediente(cebada);
		plato.agregarIngrediente(centeno);
		plato.agregarIngrediente(avena);
		plato.agregarIngrediente(trigo);
		plato.agregarIngrediente(pez);
		
		
		assertFalse(celiaco.comer(plato));
	}
	
	@Test
	public void queUnHipertensoNoPuedaConsumirSal() {
		Hipertenso hipertenso = new Hipertenso();
		Ingrediente azucar = new Ingrediente("azucar");
		Ingrediente sal = new Ingrediente("sal");
		Plato azucarYPez = new Plato();
		
		azucarYPez.agregarIngrediente(azucar);
		azucarYPez.agregarIngrediente(sal);

		assertFalse(hipertenso.comer(azucarYPez));
	}
	
	@Test
	public void queUnGeneralPuedaConsumir() {
		General general = new General();
		Ingrediente azucar = new Ingrediente("azucar");
		Ingrediente sal = new Ingrediente("sal");
		Plato azucarYPez = new Plato();
		
		azucarYPez.agregarIngrediente(azucar);
		azucarYPez.agregarIngrediente(sal);

		assertTrue(general.comer(azucarYPez));
	}
}
