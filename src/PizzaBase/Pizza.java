package PizzaBase;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private double price;
    private List<Topping> toppings = new ArrayList<>();

    // Nombres preestablecidos
    public static final String PEPPERONI_NAME = "Pepperoni";
    public static final String HAWAIIAN_NAME = "Hawaiiana";
    public static final String VEGETARIAN_NAME = "Vegetariana";
    public static final String SUPREME_NAME = "Suprema";
    public static final String WHITE_NAME = "Blanca";

    // Precios preestablecidos como double
    public static final double PEPPERONI_PRICE = 40;
    public static final double HAWAIIAN_PRICE = 55;
    public static final double VEGETARIAN_PRICE = 50;
    public static final double SUPREME_PRICE = 70;
    public static final double WHITE_PRICE = 35;


    // Constructor que acepta nombre y precio como double
    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    @Override
    public String toString() {
        return "Pizza: {" + name + " Precio=" + price + "}";
    }

    // Getters y setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
}