/**
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

import java.util.regex.*;

public class Main {

    public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        boolean trainValid = trainPattern.matcher(trainId).matches();
        boolean cargoValid = cargoPattern.matcher(cargoCode).matches();

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