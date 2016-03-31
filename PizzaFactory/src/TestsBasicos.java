import static org.junit.Assert.*;

import org.junit.Test;

public class TestsBasicos {

	@Test
	public void CompruebaCreacionDeUnaPizzaStoreEspecifica() {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		PizzaStore coPizzaStore = new COPizzaStore();
		
	}
	
	@Test
	public void CompruebaCreacionDeUnaPizzaEspecifica(){
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza nuevapizza = nyPizzaStore.orderPizza("Napolitana"); 
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
		assertEquals("preparando Napolitana", nuevapizza.prepare());
	}
}
