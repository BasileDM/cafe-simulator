package org.example;

import java.util.Scanner;

public class View {
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
        System.out.println("1. Espresso");
        System.out.println("2. Cafe au lait");
        return scanner.nextInt();
    }

    public static int showCondimentMenu() {
        System.out.println("Souhaitez-vous ajouter des condiments ?");
        System.out.println("1. Sucre ");
        System.out.println("2. Aucun");
        return scanner.nextInt();
    }

    public static int showPaymentMenu() {
        System.out.println("Quel moyen de paiement souhaitez-vous utiliser ?");
        System.out.println("1. Paypal");
        System.out.println("2. Carte de crédit");
        return scanner.nextInt();
    }
}
