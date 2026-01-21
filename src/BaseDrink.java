import java.util.HashMap;

public abstract class BaseDrink {
    public String name;
    public float cost;
    public HashMap<String, Float> ingredients = new HashMap<>();

    public BaseDrink(float water, float milk, float coffee, String name, float cost) {
        this.name = name;
        this.cost = cost;
        this.ingredients.put("water", water);
        this.ingredients.put("milk", milk);
        this.ingredients.put("coffee", coffee);
    }
}
