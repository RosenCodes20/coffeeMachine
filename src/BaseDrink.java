import java.util.HashMap;

public abstract class BaseDrink {
    private String name;
    private double cost;
    private HashMap<String, Integer> ingredients;

    public BaseDrink(String name, double cost, HashMap<String, Integer> ingredients) {
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

    public HashMap<String, Integer> getIngredients() {
        return this.ingredients;
    }

    public void setIngredients(HashMap<String, Integer> enteredIngredients) {
        this.ingredients = enteredIngredients;
    }

    public abstract void prepare();
}
