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
                    Coffee coffee = makeCoffee(coffeeType);
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public Coffee makeCoffee(CoffeeType coffeeType) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        return coffeeFactory.createCoffee(coffeeType);
    }

    public Coffee decorateCoffee(Coffee coffee) {
        int choice = View.showCondimentMenu();
        switch (choice) {
            case 1:
                return new CoffeeWithSugar(coffee);
            case 2:
                return coffee;
            default:
                System.out.println("Invalid choice. Please try again.");
                return null;
        }
    }
}
