package practicaljava.lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Application {

    public static void main(String[] args) {
        HashSet<Integer> values = new HashSet<>();
        // LinkedHashSet<Integer> values = new LinkedHashSet<>();
        // TreeSet<Integer> values = new TreeSet<>();
        values.add(12);
        values.add(43);
        values.add(43);
        values.add(67);
        values.add(15);

        // System.out.println(values.toString());
        HashSet<Animal> animals = new HashSet<>();
        Animal animal1 = new Animal("Dog", 12);
        Animal animal2 = new Animal("Cat", 8);
        Animal animal3 = new Animal("Bird", 3);
        Animal animal4 = new Animal("Dog", 12);
        Animal animal5 = new Animal("Zebra", 6);

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);

        for(Animal animal: animals) {
            System.out.println(animal);
        }
        System.out.println(animal1.hashCode());
        System.out.println(animal4.hashCode());

    }

}
