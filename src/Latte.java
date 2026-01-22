import java.util.HashMap;

public class Latte extends BaseDrink {
    public Latte() {
        super(
                "Latte",
                0.80,
                createIngredients()
        );
    }

    private static HashMap<String, Integer> createIngredients() {
        HashMap<String, Integer> ingredients = new HashMap<>();
        ingredients.put("water", 200);
        ingredients.put("milk", 150);
        ingredients.put("coffee", 50);
        return ingredients;
    }

    @Override
    public void prepare() {
        System.out.println("Pulling an latte out...");
    }
}
