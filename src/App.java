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
            String drink = myObj.nextLine();
            if (drink.equals("off")) {
                isOn = false;
            } else if (drink.equals("report")) {
                System.out.println(coffeeMaker.coffeeMachineReport());
                System.out.println(moneyMachine.moneyMachineReport());
            } else {
                BaseDrink foundDrink = menu.findItem(drink);

                if (moneyMachine.makePayment(foundDrink.cost)) {
                    coffeeMaker.makeCoffee(foundDrink);
                }
            }
        }
    }
}