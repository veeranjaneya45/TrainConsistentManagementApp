/**
 * =====================================================
 * MAIN CLASS - UseCase4TrainConsistMgmt
 * =====================================================
 * Use Case 4: Maintain Ordered Bogie Consist
 *
 * Description:
 * Uses LinkedList to maintain order and allow insertions.
 *
 * Author: Veeranjaneya Reddy
 * Version: 4.0
 */

import java.util.*;

public class Main {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }
        System.out.println("=====================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("=====================================\n");

        // Create LinkedList
        LinkedList<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry at position 2
        trainConsist.add(2, "Pantry");

        System.out.println("\nAfter Adding Pantry at index 2:");
        System.out.println(trainConsist);

        // Remove first and last
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nAfter Removing First and Last:");
        System.out.println(trainConsist);
    }
}