package org.example;

import java.util.Scanner;

public class View implements Observer {
    private static final Scanner scanner = new Scanner(System.in);

    public static int showMainMenu() {
        System.out.println("Bienvenue dans le simulateur de commandes de café !");
        System.out.println("Que souhaitez-vous faire ?");
        System.out.println("1. Commander un café");
        System.out.println("2. Quitter");
        return scanner.nextInt();
    }

    public static int showCoffeeMenu() {
        System.out.println("Quel type de café souhaitez-vous ?");
        System.out.println("1. Espresso (" + formatPrice(CoffeeType.ESPRESSO.getPrice()) + ")");
        System.out.println("2. Cafe au lait (" + formatPrice(CoffeeType.MILK_COFFEE.getPrice()) + ")");
        return scanner.nextInt();
    }

    public static int showCondimentMenu() {
        System.out.println("Souhaitez-vous ajouter des condiments ?");
        System.out.println("1. Sucre (" + formatPrice(CoffeeWithSugar.additionalPrice) + ")");
        System.out.println("2. Terminer la commande");
        return scanner.nextInt();
    }

    public static int showPaymentMenu() {
        System.out.println("Quel moyen de paiement souhaitez-vous utiliser ?");
        System.out.println("1. Paypal");
        System.out.println("2. Carte de crédit");
        return scanner.nextInt();
    }

    public static void printReceipt(Coffee coffee) {
        System.out.println("====== Reçu ======");
        System.out.println("Commande : " + coffee.getDescription());
        System.out.println("Le prix total : " + formatPrice(coffee.getPrice()));
        System.out.println("Merci pour votre commande !");
        System.out.println("==================");
    }

    public static void displayMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void update(int orderStatus, Coffee coffee) {
        if (orderStatus == 1) {
            System.out.println("📢 Notification : Votre commande est terminée !");
            printReceipt(coffee);
        }
    }

    private static String formatPrice(double price) {
        return String.format("%.2f", price / 100) + "€";
    }
}
