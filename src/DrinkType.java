import java.util.Map;

public enum DrinkType {
    ESPRESSO(
            "Espresso",
            0.80,
            Map.of(
                    Ingredients.WATER, 250,
                    Ingredients.MILK, 0,
                    Ingredients.COFFEE, 24
            )
    ),

    LATTE(
            "Latte",
            1.50,
            Map.of(
                    Ingredients.WATER, 200,
                    Ingredients.MILK, 150,
                    Ingredients.COFFEE, 24
            )
    ),

    CAPPUCCINO(
            "Cappuccino",
            1.40,
            Map.of(
                    Ingredients.WATER, 200,
                    Ingredients.MILK, 100,
                    Ingredients.COFFEE, 24
            )
    );

    private final String name;
    private final double cost;
    private final Map<Ingredients, Integer> ingredients;
}
