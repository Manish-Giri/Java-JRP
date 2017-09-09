package practicaljava.collections.lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Application {
    public static void main(String[] args) {
        /*
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(12);
        hashSet.add(43);
        hashSet.add(43);
        hashSet.add(67);
        hashSet.add(15);

        System.out.println(hashSet.toString());
        ArrayList<Integer> myList = new ArrayList<>(hashSet);
        Collections.sort(myList);
        System.out.println(myList);
        */

        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee("Mike", 3500));
        employees.add(new Employee("Peter", 2000));
        employees.add(new Employee("Paul" , 3000));
        employees.add(new Employee("Angel", 4000));

        ArrayList<Employee> employeeArrayList = new ArrayList<>(employees);
        System.out.println(employeeArrayList);

        Collections.sort(employeeArrayList);
        System.out.println(employeeArrayList);
    }

}
