import java.util.HashMap;

public class Latte extends BaseDrink {
    private static HashMap<String, Integer> createIngredients() {
        HashMap<String, Integer> ingredients = new HashMap<>();
        ingredients.put("water", 200);
        ingredients.put("milk", 150);
        ingredients.put("coffee", 50);
        return ingredients;
    }

    public Latte() {
        super(
                "Latte",
                1.0,
                createIngredients()
        );
    }

    @Override
    public void prepare() {
        System.out.println("Pulling an latte out...");
    }
}
