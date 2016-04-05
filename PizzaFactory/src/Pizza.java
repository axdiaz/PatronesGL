public abstract class Pizza {

	public String name;
	public String sauce;
	public String dough;
	
	public String prepare() {
		// TODO Auto-generated method stub
		return "preparando "  + name + " con Salsa " + sauce + " con masa " + dough;
		
	}

	public String cut() {
		return "Estamos cortando la pizza";
	}

	public String box() {

		return "Estamos empaquetando la pizza";
	}
}
