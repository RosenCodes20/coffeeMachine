import java.util.HashMap;

public class CoffeeMaker {
    private final HashMap<Ingredients, Integer> availability = new HashMap<>();

    public void refillMachine() {
        this.availability.put(Ingredients.WATER, 2000);
        this.availability.put(Ingredients.MILK, 2000);
        this.availability.put(Ingredients.COFFEE, 600);
    }

    public CoffeeMaker() {
        refillMachine();
    }

    public String coffeeMachineReport() {
        return "Available water: " + this.availability.get(Ingredients.WATER) + "\n" +
                "Available milk: " + this.availability.get(Ingredients.MILK) + "\n" +
                "Available coffee: " + this.availability.get(Ingredients.COFFEE);
    }

    public Boolean areResourcesSufficient(BaseDrink drink) {
        if (drink.getIngredients().get(Ingredients.WATER) > this.availability.get(Ingredients.WATER) ||
            drink.getIngredients().get(Ingredients.MILK) > this.availability.get(Ingredients.MILK) ||
            drink.getIngredients().get(Ingredients.COFFEE) > this.availability.get(Ingredients.COFFEE)) {
            return false;
        } else {
            return true;
        }
    }

    public void makeCoffee(BaseDrink drink) {
        // TODO: ADD IFS FOR VALIDATION!!
        if (areResourcesSufficient(drink)) {
            for (Ingredients dependency : drink.getIngredients().keySet()) {
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