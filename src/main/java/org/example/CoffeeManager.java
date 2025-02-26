package org.example;

public class CoffeeManager {
    private static CoffeeManager instance;

    private CoffeeManager() {
    }

    public static CoffeeManager getInstance() {
        if (instance == null) {
            instance = new CoffeeManager();
        }
        return instance;
    }

    public Coffee createCoffee(CoffeeType coffeeType) {
        return null;
    }
}
