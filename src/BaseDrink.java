import java.util.HashMap;

public class BaseDrink {
    public String name;
    public double cost;
    public HashMap<String, Integer> ingredients = new HashMap<>();

    public BaseDrink(int water, int milk, int coffee, String name, double cost) {
        this.name = name;
        this.cost = cost;
        this.ingredients.put("water", water);
        this.ingredients.put("milk", milk);
        this.ingredients.put("coffee", coffee);
    }
}
