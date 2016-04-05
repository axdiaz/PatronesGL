
public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("Napolitana")) {
			return new NYStyleNapolitana();
		} else if (type.equals("Anchoas")) {
			return new NYStyleAnchoas();
		} else if (type.equals("Especial")){
			return new NYStyleEspecial();
		}
		return null;
	}

}
