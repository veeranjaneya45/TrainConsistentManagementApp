/**
 * UC10: Total Seat Count using reduce
 * UC9: Group Bogies by Type
 * UC8: Filter Bogies using Streams
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
import java.util.stream.*;

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

        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24)
        );

        int total = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        System.out.println("Total Seats = " + total);
        for (String key : grouped.keySet()) {
            System.out.println(key + ":");
            for (Bogie b : grouped.get(key)) {
                System.out.println("  " + b.capacity);
            }
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