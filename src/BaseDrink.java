import java.util.HashMap;

public class BaseDrink {
    private String name;
    private double cost;
    private HashMap<String, Integer> ingredients = new HashMap<>();

    public BaseDrink(int water, int milk, int coffee, String name, double cost) {
        this.name = name;
        this.cost = cost;
        this.ingredients.put("water", water);
        this.ingredients.put("milk", milk);
        this.ingredients.put("coffee", coffee);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String enteredName) {
        this.name = enteredName;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double enteredCost) {
        this.cost = enteredCost;
    }
}
