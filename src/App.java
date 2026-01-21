import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Menu menu = new Menu();
        CoffeeMaker coffeeMaker = new CoffeeMaker();

        System.out.print("Please select a drink from the menu (" + menu.getAllItemsNames() + "): ");
        String drink = myObj.nextLine();

        BaseDrink foundDrink = menu.findItem(drink);
        coffeeMaker.makeCoffee(foundDrink);

    }
}