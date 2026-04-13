class InvalidCapacityException extends Exception {
    InvalidCapacityException(String msg) {
        super(msg);
    }
}

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0)
            throw new InvalidCapacityException("Capacity must be > 0");
        this.type = type;
        this.capacity = capacity;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Bogie b1 = new Bogie("AC", 50);
            Bogie b2 = new Bogie("Sleeper", -10); // Exception
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}