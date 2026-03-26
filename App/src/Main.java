/**
 * =====================================================
 * MAIN CLASS - UseCase3TrainConsistMgmt
 * =====================================================
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * Uses HashSet to prevent duplicate bogie IDs.
 *
 * Author: Veeranjaneya Reddy
 * Version: 3.0
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("=====================================\n");

        // Create HashSet
        Set<String> bogies = new HashSet<>();

        // Add bogies (including duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        bogies.add("BG101"); // duplicate
        bogies.add("BG102"); // duplicate

        // Display result
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogies);
    }
}