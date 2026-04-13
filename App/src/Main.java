import java.util.*;
import java.util.stream.*;

class UC13 {
    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
/**
 * UC12: Safety Compliance Check
 * UC11: Regex Validation
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

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {
        List<Bogie> list = new ArrayList<>();

        // Create dataset
        for (int i = 0; i < 100000; i++) {
            list.add(new Bogie("Sleeper", i % 100));
        }

        // Loop
        long start = System.nanoTime();
        List<Bogie> result1 = new ArrayList<>();
        for (Bogie b : list) {
            if (b.capacity > 60) result1.add(b);
        }
        long end = System.nanoTime();
        System.out.println("Loop Time: " + (end - start));

        // Stream
        start = System.nanoTime();
        List<Bogie> result2 = list.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        end = System.nanoTime();
        System.out.println("Stream Time: " + (end - start));

        List<GoodsBogie> list = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Box", "Coal")
        );

        boolean safe = list.stream().allMatch(b ->
                b.type.equals("Cylindrical") ? b.cargo.equals("Petroleum") : true
        );

        System.out.println("Train Safety: " + (safe ? "SAFE" : "UNSAFE"));
        System.out.println("Train ID Valid: " + trainValid);
        System.out.println("Cargo Code Valid: " + cargoValid);
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