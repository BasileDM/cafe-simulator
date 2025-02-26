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

    public void run() {
        while (true) {
            int choice = View.showMainMenu();
            switch (choice) {
                case 1:
                    int coffeeChoice = View.showCoffeeMenu();
                    CoffeeType coffeeType = CoffeeType.values()[coffeeChoice - 1];
                    Coffee coffee = createCoffee(coffeeType);
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public Coffee createCoffee(CoffeeType coffeeType) {
        return null;
    }
}
