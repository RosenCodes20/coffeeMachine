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
            String choiceOrDrink = myObj.nextLine();

            if (choiceOrDrink.equals("off")) {
                System.out.println("Turning off.........");
                isOn = false;
            } else if (choiceOrDrink.equals("report")) {
                System.out.println(coffeeMaker.coffeeMachineReport());
                System.out.println(moneyMachine.moneyMachineReport());
            } else {
                BaseDrink foundDrink = menu.findItem(choiceOrDrink);

                if (moneyMachine.makePayment(foundDrink.cost)) {
                    coffeeMaker.makeCoffee(foundDrink);
                }
            }
        }
    }
}