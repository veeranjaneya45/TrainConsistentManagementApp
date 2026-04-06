/**
 * ================================================================
 * MAIN CLASS – UseCase6TrainConsistMgmt
 * ================================================================
 *
 * Use Case 6: Map Bogie to Capacity (HashMap)
 *
 * Description:
 * This program associates each bogie with its seating or
 * load capacity using a key–value mapping structure.
 *
 * Features:
 * - Creates HashMap for bogie-capacity mapping
 * - Inserts capacity values for each bogie
 * - Iterates through map entries
 * - Displays bogie and capacity information
 *
 * Author: Veeranjaneya Reddy
 * Version: 6.0
 */

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("========================================\n");

        // HashMap stores data in key-value format
        Map<String, Integer> capacityMap = new HashMap<>();

        // ---- Insert bogie capacities ----
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 78);
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 100);

        // ---- Display bogie capacities ----
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}