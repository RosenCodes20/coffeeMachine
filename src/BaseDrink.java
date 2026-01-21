import java.util.HashMap;

public class BaseDrink {
    public String name;
    public double cost;
    public HashMap<String, Double> ingredients = new HashMap<>();

    public BaseDrink(double water, double milk, double coffee, String name, double cost) {
        this.name = name;
        this.cost = cost;
        this.ingredients.put("water", water);
        this.ingredients.put("milk", milk);
        this.ingredients.put("coffee", coffee);
    }
}
