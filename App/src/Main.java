/**
 * =====================================================
 * MAIN CLASS - UseCase1TrainConsistMgmt
 * =====================================================
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * Initializes an empty train consist and displays initial details.
 *
 * Author: Veeranjaneya Reddy
 * Version: 1.0
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================\n");

        // Create empty train consist
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Display train consist
        System.out.println("Train Consist: " + trainConsist);
    }
}
