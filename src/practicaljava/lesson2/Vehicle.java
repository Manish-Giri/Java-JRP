package practicaljava.lesson2;

/**
 * Created by manishgiri on 7/24/17.
 */
public class Vehicle {
    String make;
    String model;
    int price;
    boolean fourWheelDrive;

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", fourWheelDrive=" + fourWheelDrive +
                '}';
    }

    public Vehicle(String make, String model, int price, boolean fourWheelDrive) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.fourWheelDrive = fourWheelDrive;
    }

}
