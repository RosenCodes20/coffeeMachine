import java.util.ArrayList;

public class Menu {
    private final ArrayList<BaseDrink> menuItems = new ArrayList<>();
    public Menu() {
        this.menuItems.add(new BaseDrink(250, 200, 24, "Espresso", 0.80));
        this.menuItems.add(new BaseDrink(200, 150, 50, "Latte", 1.00));
        this.menuItems.add(new BaseDrink(180, 150, 60, "Cappuccino", 0.70));
    }

    public String getAllItemsNames() {
        String result = "";
        int counter = 1;
        for (BaseDrink itemName : this.menuItems) {
            if (counter < this.menuItems.toArray().length) {
                result = result.concat(itemName.getName() + "/");
            } else if (counter == this.menuItems.toArray().length ){
                result = result.concat(itemName.getName());
            }

            counter++;
        }

        return result;
    }

    public BaseDrink findItem(String itemName) {
        for (BaseDrink item : this.menuItems) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        System.out.println("Didn't find drink with that name, sorry :(");
        return null;
    }
}
