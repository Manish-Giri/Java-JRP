package practicaljava.generics.lesson7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application {

    private static <E> Set<E> union(Set<E> set1, Set<E> set2) {
        Set<E> resultSet = new HashSet<>(set1);
        resultSet.addAll(set2);
        return resultSet;
    }

    public static void main(String[] args) {

        Container<Integer, String> container = new Container<>(12, "Manish");
        int first = container.getFirstItem();
        String second = container.getSecondItem();
        System.out.println(first + " --> " + second);

        Set<String> mySet1 = new HashSet<>();
        mySet1.add("first");
        mySet1.add("second");
        mySet1.add("third");


        Set<String> mySet2 = new HashSet<>();
        mySet2.add("first");
        mySet2.add("second");
        mySet2.add("whatever");

        Set<String> results = union(mySet1, mySet2);

        Iterator<String> itr = results.iterator();
        while(itr.hasNext()) {
            String s = itr.next();
            System.out.println(s);
        }


    }

}
