package practicaljava.collections.lesson5;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        HashMap<String, String> foods = new HashMap<>();
        foods.put("A", "apple");
        foods.put("B", "banana");
        foods.put("C", "chocolate");
        foods.put("D", "doritos");

        /*for(String word: foods.keySet()) {
            System.out.println(foods.get(word));
        }
        */
        for(Map.Entry<String, String> entry: foods.entrySet()) {
            System.out.println(entry.getKey() + " --> "  + entry.getValue());
        }


    }
}
