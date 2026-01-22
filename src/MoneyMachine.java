import java.util.HashMap;

public class MoneyMachine {
    private final String moneyCurrency = "€";
    private double profit = 0;
    private double moneyReceived = 0;
    private HashMap<String, Double> euroCents = new HashMap<>();

    private void addEuroCents() {
        this.euroCents.put("1_euro_cent", 0.01);
        this.euroCents.put("2_euro_cents", 0.02);
        this.euroCents.put("5_euro_cents", 0.05);
        this.euroCents.put("10_euro_cents", 0.10);
        this.euroCents.put("20_euro_cents", 0.20);
        this.euroCents.put("50_euro_cents", 0.50);
        this.euroCents.put("1_euro", 1.0);
        this.euroCents.put("2_euro", 2.0);
    }

    public MoneyMachine() {
        addEuroCents();
    }

    public String moneyMachineReport() {
        return "Money: " + this.profit + " " + this.moneyCurrency;
    }

    public double processCoins() {
        System.out.println("Please insert coins");
    }
}
