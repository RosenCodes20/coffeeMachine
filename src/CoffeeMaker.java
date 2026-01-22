import java.util.HashMap;

public class CoffeeMaker {
    private final HashMap<String, Integer> availability = new HashMap<>();

    public void refillMachine() {
        this.availability.put("water", 2000);
        this.availability.put("milk", 2000);
        this.availability.put("coffee", 600);
    }

    public CoffeeMaker() {
        refillMachine();
    }

    public String coffeeMachineReport() {
        return "Available water: " + this.availability.get("water") + "\n" +
                "Available milk: " + this.availability.get("milk") + "\n" +
                "Available coffee: " + this.availability.get("coffee");
    }

    public Boolean areResourcesSufficient(BaseDrink drink) {
        if (drink.getIngredients().get("water") > this.availability.get("water") ||
            drink.getIngredients().get("milk") > this.availability.get("milk") ||
            drink.getIngredients().get("coffee") > this.availability.get("coffee")) {
            return false;
        } else {
            return true;
        }
    }

    public void makeCoffee(BaseDrink drink) {
        // TODO: ADD IFS FOR VALIDATION!!
        if (areResourcesSufficient(drink)) {
            for (String dependency : drink.getIngredients().keySet()) {
                this.availability.put(
                        dependency,
                        this.availability.get(dependency) - drink.getIngredients().get(dependency)
                );
            }
            drink.prepare();
            System.out.println("Here is your " + drink.getName() + " ☕️. Enjoy!");
            System.out.println("-".repeat(50));
        } else {
            System.out.println("Sorry, There is not enough resources in the machine, please wait till we add more!");
            System.out.println("-".repeat(50));
        }
    }
}