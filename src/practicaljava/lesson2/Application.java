package practicaljava.lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by manishgiri on 7/24/17.
 */
class Application {

    /**
     * can print list of any type - String, Vehicle: Polymorphism
     * @param list
     */
    private static void printList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("Honda", "Accord", 23000, true));
        vehicles.add(new Vehicle("Toyota", "Camry", 25000, false));

        LinkedList<String> animals = new LinkedList<>();
        animals.add("Lion");
        animals.add("Cat");
        animals.add("Doggo");
        animals.add("Giraffe");
        animals.add("Zebra");

        // Polymorphism - pass child type where parent type is expected
        printList(vehicles);
        printList(animals);


    }
}
