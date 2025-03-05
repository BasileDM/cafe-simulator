package org.example;

public class CoffeeManager {
    private static CoffeeManager instance;
    private final CoffeeFactory coffeeFactory;

    private CoffeeManager() {
        this.coffeeFactory = new CoffeeFactory();
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
                    Coffee coffee = this.makeCoffee(coffeeType);
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
        Coffee coffee = this.coffeeFactory.createCoffee(coffeeType);
        return this.decorateCoffee(coffee);
    }

    public Coffee decorateCoffee(Coffee baseCoffee) {
        Coffee decoratedCoffee = baseCoffee;
        while (true) {
            int condimentChoice = View.showCondimentMenu();
            switch (condimentChoice) {
                case 1:
                    decoratedCoffee = new CoffeeWithSugar(decoratedCoffee);
                    System.out.println(decoratedCoffee.getPrice());
                    break;
                case 2:
                    return decoratedCoffee;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
