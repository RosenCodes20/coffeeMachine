import java.util.ArrayList;

public class Menu {
    ArrayList<BaseDrink> menuItems = new ArrayList<>();
    public Menu() {
        this.menuItems.add(new BaseDrink(250, 200, 24, "Espresso", 0.80));
        this.menuItems.add(new BaseDrink(200, 150, 50, "Latte", 1.00));
        this.menuItems.add(new BaseDrink(180, 150, 60, "Cappuccino", 0.70));
    }

    public String getAllItemsNames() {
        String result = "";
        for (BaseDrink itemName : this.menuItems) {
            result = result.concat(itemName.name + "\n");
        }

        return result;
    }
}
