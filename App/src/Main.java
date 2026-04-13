import java.util.*;
import java.util.stream.*;

class UC13 {
    static class Bogie {
        String type;
        int capacity;

        Bogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
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
    }
}