/**
 * ================================================================
 * MAIN CLASS – UseCase5TrainConsistMgmt
 * ================================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * This program maintains the exact attachment order of bogies
 * while preventing duplicate entries using LinkedHashSet.
 *
 * Features:
 * - Attaches bogies in order
 * - Preserves insertion sequence
 * - Avoids duplicate bogies
 * - Displays final train formation
 *
 * Author: Veeranjaneya Reddy
 * Version: 5.0
 */

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("========================================\n");

        // LinkedHashSet preserves insertion order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // Adding bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Attempting duplicate insertion
        formation.add("Sleeper"); // Will be ignored automatically

        // Display final train formation
        System.out.println("Final Train Formation:");
        for (String bogie : formation) {
            System.out.print(bogie + " -> ");
        }
        System.out.println("END");
    }
}
