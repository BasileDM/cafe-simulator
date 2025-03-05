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
                    this.makeCoffee(coffeeType);
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
    }

    public Coffee makeCoffee(CoffeeType coffeeType) {
        Coffee coffee = CoffeeFactory.createCoffee(coffeeType);
        coffee = this.decorateCoffee(coffee);
        this.payOrder(coffee);
        return coffee;
    }

    public Coffee decorateCoffee(Coffee baseCoffee) {
        Coffee decoratedCoffee = baseCoffee;
        while (true) {
            int condimentChoice = View.showCondimentMenu();
            switch (condimentChoice) {
                case 1:
                    decoratedCoffee = new CoffeeWithSugar(decoratedCoffee);
                    break;
                case 2:
                    return decoratedCoffee;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
    }

    public void payOrder(Coffee coffee) {
        PaymentContext paymentContext = new PaymentContext();
        int paymentChoice = View.showPaymentMenu();
        switch (paymentChoice) {
            case 1:
                paymentContext.setPaymentStrategy(new PaypalStrategy());
                break;
            case 2:
                paymentContext.setPaymentStrategy(new CreditCardStrategy());
                break;
            default:
                System.out.println("Choix invalide. Veuillez réessayer.");
        }
        paymentContext.processPayment(coffee.getPrice());
    }
}
