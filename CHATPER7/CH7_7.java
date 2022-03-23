package CHATPER7;

public class CH7_7 {
    public static void main(String[] args) {
        Car car = null;

        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;
    }
}


class Car {
    String color;
    int door;

    void drive() {
        System.out.println("Driving");
    }

    void stop() {
        System.out.println("stop.");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water");
    }
}
