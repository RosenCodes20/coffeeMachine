import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class MoneyMachine {
    private final String moneyCurrency = "€";
    private double profit = 0;
    private double moneyReceived = 0;
    private final LinkedHashMap<String, Double> euroCents = new LinkedHashMap<>();
    private final LinkedHashMap<String, Integer> moneyStock = new LinkedHashMap<>();

    private void addMoney(String name, double value, int stock) {
        euroCents.put(name, value);
        moneyStock.put(name, stock);
    }

    private void addEuroCents() {
        addMoney("2_euro", 2.0, 6);
        addMoney("1_euro", 1.0, 15);
        addMoney("50_euro_cents", 0.50, 10);
        addMoney("20_euro_cents", 0.20, 40);
        addMoney("10_euro_cents", 0.10, 30);
        addMoney("5_euro_cents", 0.05, 20);
        addMoney("2_euro_cents", 0.02, 10);
        addMoney("1_euro_cent", 0.01, 20);
    }


    public MoneyMachine() {
        addEuroCents();
    }

    public String moneyMachineReport() {
        return "Money: " + this.profit + " " + this.moneyCurrency;
    }

    public boolean giveChange(double change) {
        change = Math.round(change * 100.0) / 100.0;

        HashMap<String, Integer> changeToGive = new HashMap<>();

        for (String coin : euroCents.keySet()) {
            double value = euroCents.get(coin);
            int available = this.moneyStock.get(coin);

            int needed = (int) (change / value);
            int used = Math.min(needed, available);

            if (used > 0) {
                changeToGive.put(coin, used);
                change -= used * value;
                change = Math.round(change * 100.0) / 100.0;
            }
        }
        if (change > 0) {
            System.out.println("Cannot return exact change. Transaction cancelled.");
            System.out.println("-".repeat(50));
            return false;
        }

        for (String coin : changeToGive.keySet()) {
            this.moneyStock.put(
                    coin,
                    this.moneyStock.get(coin) - changeToGive.get(coin)
            );
        }

        System.out.println("Change returned:");
        if (!changeToGive.isEmpty()) {
            for (String coin : changeToGive.keySet()) {
                System.out.println(coin + " x " + changeToGive.get(coin));
            }
        } else {
            System.out.println("Nothing to return :)");
        }
        System.out.println("-".repeat(50));

        return true;
    }

    public void processCoins(double cost, Scanner scanner) {
        System.out.println("Please insert coins, Product cost: " + cost + this.moneyCurrency);
        System.out.println("-".repeat(50));

        for (String coinValue : this.euroCents.keySet()) {
            System.out.print("How many " + coinValue + "?: ");
            double enteredInputCoin = scanner.nextDouble();
            this.moneyReceived += enteredInputCoin * this.euroCents.get(coinValue);
            System.out.println("-".repeat(50));
        }

    }

    public boolean makePayment(double cost, Scanner scanner) {
        this.processCoins(cost, scanner);

        if (this.moneyReceived >= cost) {
            double change = this.moneyReceived - cost;

            if (!giveChange(change)) {
                this.moneyReceived = 0;
                return false;
            }

            System.out.printf("Here is %.2f %s in change%n", change, this.moneyCurrency);
            this.profit += cost;
            this.moneyReceived = 0;
            return true;
        } else {
            System.out.println("Sorry that's not enough money! Money refunded!");
            this.moneyReceived = 0;
            return false;
        }
    }
}