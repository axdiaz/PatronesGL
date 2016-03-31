
public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("Napolitana")) {
			return new NYStyleNapolitana();
		}
		return null;
	}

}
