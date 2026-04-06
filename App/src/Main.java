/**
 * UC8: Filter Bogies using Streams
 * Author: Veeranjaneya Reddy
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

        List<Bogie> result = bogies.stream()
                .filter(b -> b.capacity > 50)
                .collect(Collectors.toList());

        for (Bogie b : result) {
            System.out.println(b.name + " -> " + b.capacity);
        }
    }
}