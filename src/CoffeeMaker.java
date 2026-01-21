import java.util.ArrayList;
import java.util.HashMap;

public class CoffeeMaker {
    public HashMap<String, Integer> availability = new HashMap<>();

    public CoffeeMaker() {
        this.availability.put("water", 2000);
        this.availability.put("milk", 2000);
        this.availability.put("coffee", 600);
    }

    public String coffeeMachineReport() {
        return "Available water: " + this.availability.get("water") + "\n" +
                "Available milk: " + this.availability.get("milk") + "\n" +
                "Available coffee: " + this.availability.get("coffee");
    }

    public Boolean areResourcesSufficient(BaseDrink drink) {
        if (drink.ingredients.get("water") > this.availability.get("water") ||
            drink.ingredients.get("milk") > this.availability.get("milk") ||
            drink.ingredients.get("coffee") > this.availability.get("coffee")) {
            return false;
        } else {
            return true;
        }
    }

    public void makeCoffee(BaseDrink drink) {
        for (String dependency : drink.ingredients.keySet()) {
            this.availability.put(
                    dependency,
                    this.availability.get(dependency) - drink.ingredients.get(dependency)
            );
        }

        System.out.println("Here is your " + drink.name + " ☕️. Enjoy!");
    }
}
