package org.FactoryExample;

import org.FactoryExample.creator.RoadLogistics;
import org.FactoryExample.creator.SeaLogistics;
import org.FactoryExample.logic.Logistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nYou got a new package, choose the delivery method:");
            System.out.println("1. Road Logistics");
            System.out.println("2. Sea Logistics");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            String choice = sc.next();

            switch (choice) {
                case "1" -> {
                    Logistics logistics = new RoadLogistics();
                    logistics.planDelivery();
                }
                case "2" -> {
                    Logistics logistics2 = new SeaLogistics();
                    logistics2.planDelivery();
                }
                case "3" -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> {
                    System.out.println("Invalid choice");
                }
            }
        }

    }
}
