public class Main {
    public static void main(String[] args) {
        // Instantiate a car object and test methods
        Car car = new Car(4, "blue", 100, "premium", "Lexus");
        car.honk();
        car.displayInfo();
    }
}