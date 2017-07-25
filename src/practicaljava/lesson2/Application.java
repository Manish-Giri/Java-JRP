package practicaljava.lesson2;

import java.util.ArrayList;

/**
 * Created by manishgiri on 7/24/17.
 */
public class Application {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Vehicle("Honda", "Accord", 23000, true));
        vehicles.add(new Vehicle("Toyota", "Camry", 25000, false));



    }
}
