package PizzaBase;

public class Topping {
    private String ingredientName;
    private double price;

    // Nombres preestablecidos
    public static final String PEPPERONI_NAME = "Pepperoni";
    public static final String PINEAPPLE_NAME = "Piña";
    public static final String SWEET_PEPPER_NAME = "Chile Dulce";
    public static final String ONION_NAME = "Cebolla";
    public static final String CHEESE_NAME = "Queso";
    public static final String MUSHROOMS_NAME = "Champiñones";

    // Precios preestablecidos
    public static final double PEPPERONI_PRICE = 10.00;
    public static final double PINEAPPLE_PRICE = 12.00;
    public static final double SWEET_PEPPER_PRICE = 2.00;
    public static final double ONION_PRICE = 4.00;
    public static final double CHEESE_PRICE = 8.00;
    public static final double MUSHROOMS_PRICE = 15.00;


    // Constructor que acepta nombre y precio como double
    public Topping(String ingredientName, double price) {
        this.ingredientName = ingredientName;
        this.price = price;
    }

    // Getters y setters

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}