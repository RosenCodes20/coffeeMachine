import java.util.HashMap;
import java.util.Map;

public abstract class BaseDrink {
    private String name;
    private double cost;
    private Map<Ingredients, Integer> ingredients;

    public BaseDrink(String name, double cost, Map<Ingredients, Integer> ingredients) {
        this.name = name;
        this.cost = cost;
        this.ingredients = ingredients;
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

    public Map<Ingredients, Integer> getIngredients() {
        return this.ingredients;
    }

    public void setIngredients(Map<Ingredients, Integer> enteredIngredients) {
        this.ingredients = enteredIngredients;
    }

    public abstract void prepare();
}
