/**
 * UC12: Safety Compliance Check
 * Author: Veeranjaneya Reddy
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

        List<GoodsBogie> list = Arrays.asList(
                new GoodsBogie("Cylindrical", "Petroleum"),
                new GoodsBogie("Box", "Coal")
        );

        boolean safe = list.stream().allMatch(b ->
                b.type.equals("Cylindrical") ? b.cargo.equals("Petroleum") : true
        );

        System.out.println("Train Safety: " + (safe ? "SAFE" : "UNSAFE"));
    }
}