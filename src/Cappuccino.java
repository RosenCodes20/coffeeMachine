import java.util.HashMap;

public class Cappuccino extends BaseDrink {
    public Cappuccino() {
        super(
                "Espresso",
                0.70,
                createIngredients()
        );
    }

    private static HashMap<String, Integer> createIngredients() {
        HashMap<String, Integer> ingredients = new HashMap<>();
        ingredients.put("water", 180);
        ingredients.put("milk", 150);
        ingredients.put("coffee", 60);
        return ingredients;
    }

    @Override
    public void prepare() {
        System.out.println("Pulling an cappuccino out...");
    }
}
