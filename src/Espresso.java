import java.util.HashMap;
import java.util.Map;

public class Espresso extends BaseDrink {

    public Espresso() {
        super(
                "Espresso",
                0.80,
                createIngredients()
        );
    }

    private static HashMap<String, Integer> createIngredients() {
        HashMap<String, Integer> ingredients = new HashMap<>();
        ingredients.put("water", 250);
        ingredients.put("milk", 0);
        ingredients.put("coffee", 24);
        return ingredients;
    }

    @Override
    public void prepare() {
        System.out.println("Pulling an espresso out...");
    }
}
