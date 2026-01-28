import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean isOn = true;
        Menu menu = new Menu();
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        MoneyMachine moneyMachine = new MoneyMachine();

        while (isOn) {
            Scanner myObj = new Scanner(System.in);
            System.out.print("Please select a drink from the menu (" + menu.getAllItemsNames() + "): ");
            String choiceOrDrink = myObj.nextLine().trim();

            if (choiceOrDrink.equals("off")) {
                System.out.println("Turning off.........");
                isOn = false;
            } else if (choiceOrDrink.equals("report")) {
                System.out.println(coffeeMaker.coffeeMachineReport());
                System.out.println(moneyMachine.moneyMachineReport());
            } else if (choiceOrDrink.equals("refill")) {
                coffeeMaker.refillMachine();
                System.out.println("Refilled the machine with coffee, water and milk again!");
            } else {
                BaseDrink foundDrink = menu.findItem(choiceOrDrink);
                if (foundDrink == null) {
                    continue;
                }

                if (moneyMachine.makePayment(foundDrink.getCost(), myObj)) {
                    coffeeMaker.makeCoffee(foundDrink);
                }
            }
        }
    }
}
