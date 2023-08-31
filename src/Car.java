public class Car extends Vehicle {
    private String brand;
    public Car(int numberOfWheels, String color, float engineSize, String fuelType, String brand) {
        // Utilize super constructor
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }

    // Honk method
    public void honk() {
        System.out.println("Honk, honk!");
    }

    // Displays all info about the vehicle
    public void displayInfo() {
        System.out.println("Num of wheels: " + numberOfWheels + "\nColor: " + color + "\nEngine size: " + engineSize + "\nFuel type: " + fuelType + "\nBrand: " + brand);
    }

}
