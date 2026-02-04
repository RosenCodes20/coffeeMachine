public class Drink extends BaseDrink {
    public Drink(DrinkType type) {
        super(type.getName(), type.getCost(), type.getIngredients());
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName() + "...");
        getIngredients().forEach((ingredient, amount) ->
                System.out.println(ingredient + ": " + amount)
        );
        System.out.println(getName() + " is ready!\n");
    }
}
