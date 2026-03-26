/**
 * =====================================================
 * MAIN CLASS - UseCase2TrainConsistMgmt
 * =====================================================
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * Demonstrates ArrayList CRUD operations.
 *
 * Author: Veeranjaneya Reddy
 * Version: 2.0
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("=====================================\n");

        // Create ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // ADD bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println(passengerBogies);

        // REMOVE bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println(passengerBogies);

        // CHECK existence
        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? " + passengerBogies.contains("Sleeper"));

        // FINAL LIST
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);
    }
}