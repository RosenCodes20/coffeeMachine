public class Drink extends BaseDrink {
    public Drink(DrinkType type) {
        super(type.getName(), type.getCost(), type.getIngredients());
    }

    @Override
    public void prepare() {

    }
}
