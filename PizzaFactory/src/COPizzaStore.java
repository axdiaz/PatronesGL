

public class COPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("Palmitos")) {
			return new COStylePalmitos();
		} else if (type.equals("Chacarera")){
			return new COStyleChacarera();
		}
		return null;
	}

}
