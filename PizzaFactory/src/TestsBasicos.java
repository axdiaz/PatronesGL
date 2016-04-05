import static org.junit.Assert.*;

import org.junit.Test;

public class TestsBasicos {

	@Test
	public void CompruebaCreacionDeUnaPizzaStoreEspecifica() {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		assertNotNull(nyPizzaStore);
	}
	
	@Test
	public void CompruebaCreacionDeUnaPizzaStoreDistinta() {
		PizzaStore coPizzaStore = new COPizzaStore();
		assertNotNull(coPizzaStore);
	}
	
	@Test
	public void CompruebaCreacionDeUnaPizzaEspecifica(){
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza nuevapizza = nyPizzaStore.orderPizza("Napolitana"); 
		assertNotNull(nuevapizza);
	}
	
	@Test
	public void CompruebaCreacionDeUnaPizzaEspecificaConNombre(){
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza nuevapizza = nyPizzaStore.orderPizza("Napolitana");
		assertEquals("Napolitana", nuevapizza.name);
	}
	
	@Test
	public void CompruebaCreacionDeUnaPizzaConBake(){
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza nuevapizza = nyPizzaStore.orderPizza("Napolitana");
		assertEquals("Roja", nuevapizza.sauce);
	}

	@Test
	public void CompruebaCreacionDeUnaPizzaConDough(){
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza nuevapizza = nyPizzaStore.orderPizza("Napolitana");
		assertEquals("Fina", nuevapizza.dough);
	}
	
	@Test
	public void CompruebaCreacionDeUnaPizzaConPrepare(){
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza nuevapizza = nyPizzaStore.orderPizza("Napolitana");
		assertEquals("preparando Napolitana con Salsa Roja con masa Fina", nuevapizza.prepare());
	}
	
	@Test
	public void CompruebaCreacionDeUnaPizzaConSauce() {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza nuevapizza = nyPizzaStore.orderPizza("Napolitana");
		assertTrue(nuevapizza.sauce == "Roja");
	}
	
	@Test
	public void CompruebaCreacionDeUnaPizzaDeAnchoas(){
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza nuevapizza = nyPizzaStore.orderPizza("Anchoas");
		assertTrue(nuevapizza.name == "Anchoas");	
	}
	
	@Test
	public void CompruebaCreacionDeUnaPizzaEspecial(){
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza nuevapizza = nyPizzaStore.orderPizza("Especial");
		assertTrue(nuevapizza.name == "Especial");	
	}
	
	@Test
	public void CompruebaQueLaPizzaSeaCortada(){
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza nuevapizza = nyPizzaStore.orderPizza("Especial");
		assertTrue(nuevapizza.cut() == "Estamos cortando la pizza");
	}
	
	@Test
	public void CompruebaQueLaPizzaSeaEmpaquetada(){
		PizzaStore coPizzaStore = new COPizzaStore();
		Pizza nuevapizza = coPizzaStore.orderPizza("Palmitos");
		assertTrue(nuevapizza.box() == "Estamos empaquetando la pizza");
	}
	
	@Test
	public void CompruebaQueLaPizzaDeAnchoasSeCortaDistinto(){
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza nuevapizza = nyPizzaStore.orderPizza("Anchoas");
		assertTrue(nuevapizza.cut() == "Esta se corta clblalladflkandfldistinto");	
	}
}
