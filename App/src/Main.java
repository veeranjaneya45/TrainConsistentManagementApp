/**
 * UC11: Regex Validation
 * Author: Veeranjaneya Reddy
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
    }
}